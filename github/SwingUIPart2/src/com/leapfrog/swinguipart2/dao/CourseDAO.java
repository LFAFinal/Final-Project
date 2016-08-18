/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.swinguipart2.dao;

import com.leapfrog.swinguipart2.entity.Course;
import java.sql.SQLException;

/**
 *
 * @author Anonymous
 */
public interface CourseDAO {
    int insert(Course c) throws ClassNotFoundException,SQLException;
    
}
