/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.swinguipart2.constant;

/**
 *
 * @author Anonymous
 */
public class SQLConstant {
    public static final String INSERT_COURSE="INSERT INTO"+ TableConstant.COURSE_TABLE+"(course_name,feess,duration,duration_type,status) VALUES(?,?,?,?,?)";
    
}
