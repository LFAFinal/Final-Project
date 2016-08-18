/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.swinguipart2.dao.impl;

import com.leapfrog.swinguipart2.constant.SQLConstant;
import com.leapfrog.swinguipart2.dao.CourseDAO;
import com.leapfrog.swinguipart2.dbconnection.DBConnection;
import com.leapfrog.swinguipart2.entity.Course;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Anonymous
 */
public class CourseDAOImpl implements CourseDAO{
private DBConnection db=new DBConnection();
    @Override
    public int insert(Course c) throws ClassNotFoundException, SQLException {
       db.open();
        PreparedStatement stmt=db.initStatement(SQLConstant.INSERT_COURSE);
        stmt.setString(1,c.getName());
        stmt.setDouble(2,c.getFees());
        stmt.setInt(3,c.getDuration());
        stmt.setString(4,c.getDurationType());
        stmt.setBoolean(5,c.isStatus());
        int result=db.executeUpdate();
        db.close();
        return result;

    }
    
    
}
