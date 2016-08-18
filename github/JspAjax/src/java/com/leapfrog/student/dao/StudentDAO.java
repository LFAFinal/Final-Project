/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.student.dao;

import com.leapfrog.jspajax.entity.Student;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Anonymous
 */
public interface StudentDAO {

    int insert(Student s) throws ClassNotFoundException, SQLException;

    List<Student> getAll() throws ClassNotFoundException, SQLException;
}
