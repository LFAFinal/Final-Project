/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.contactmanager.constant;

/**
 *
 * @author Anonymous
 */
public class SQLConstant {
    public static final String INSERT_MANAGER="INSERT INTO "+ TableConstant.MANAGER_TABLE+"(name,email,phone,address,DOB) VALUES(?,?,?,?,?)";
    public static final String UPDATE_MANAGER="UPDATE  "+TableConstant.MANAGER_TABLE+" SET name=?,email=?,phone=?,address=?,DOB=? WHERE id=?";
    
}
