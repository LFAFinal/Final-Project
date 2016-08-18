/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.paymentmodule.entity.dao.impl;

import com.leapfroog.mfp.entity.Course;
import com.leapfrog.paymentmodule.entity.dao.CourseDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anonymous
 */
public class CourseDAOImpl implements CourseDAO {

    private List<Course> CourseList = new ArrayList<>();

    @Override
    public List<Course> getAll() {
        return CourseList;
    }

    @Override
    public Course getByid(int id) {
        for (Course c : CourseList) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public int insert(Course c) {

        return (CourseList.add(c) ? 1 : 0);
    }

}
