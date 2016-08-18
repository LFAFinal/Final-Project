/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.paymentmodule.entity.dao;

import com.leapfroog.mfp.entity.Course;
import java.util.List;

/**
 *
 * @author Anonymous
 */
public interface CourseDAO {

    List<Course> getAll();

    Course getByid(int id);

    int insert(Course c);
}
