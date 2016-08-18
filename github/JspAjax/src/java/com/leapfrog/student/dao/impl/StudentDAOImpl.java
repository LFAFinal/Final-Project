/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.student.dao.impl;

import com.leapfrog.student.constant.SQLConstant;
import com.leapfrog.jspajax.entity.Student;
import com.leapfrog.student.dao.StudentDAO;
import com.leapfrog.student.dbconnection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anonymous
 */
public class StudentDAOImpl implements StudentDAO {

    private DBConnection db = new DBConnection();

    @Override
    public int insert(Student s) throws ClassNotFoundException, SQLException {

         String sql = "INSERT INTO tbl_student(name,email,phone,address,status) values(?,?,?,?,?)";
        db.open();
        PreparedStatement stmt = db.initStatement(SQLConstant.INSERT_STUDENT);
        stmt.setString(1, s.getName());
        stmt.setString(2, s.getEmail());
        stmt.setString(3, s.getPhone());
        stmt.setBoolean(4, s.isStatus());
        int result = db.executeUpdate();

        db.close();
        return result;
    }

    @Override
    public List<Student> getAll() throws ClassNotFoundException, SQLException {

     List<Student> studentList = new ArrayList<>();
        String sql = "SELECT * FROM tbl_students";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setEmail(rs.getString("email"));
            student.setPhone(rs.getString("phone"));
            student.setAddress(rs.getString("address"));
            student.setStatus(rs.getBoolean("status"));
            studentList.add(student);
        }
        db.close();
        return studentList;

    }

   
}
