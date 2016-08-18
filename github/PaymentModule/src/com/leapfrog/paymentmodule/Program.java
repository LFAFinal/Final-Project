/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.paymentmodule;

import com.leapfroog.mfp.entity.Course;
import com.leapfrog.paymentmodule.entity.dao.CourseDAO;
import com.leapfrog.paymentmodule.entity.dao.PaymentDAO;
import com.leapfrog.paymentmodule.entity.dao.impl.CourseDAOImpl;
import com.leapfrog.paymentmodule.entity.dao.impl.PaymentDAOImpl;
import com.leapfrog.paymentmodule.helper.FileHelper;
import com.leapfroog.mfp.entity.Payment;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Import course data:");
        String fileName = input.next();
        CourseDAO courseDAO = new CourseDAOImpl();
        try {
            for (String line : FileHelper.readLines(fileName)) {
                String[] tokens = line.split(",");
                if (tokens.length >= 3) {
                    Course c = new Course();
                    c.setId(Integer.parseInt(tokens[0]));
                    c.setName(tokens[1]);
                    c.setFees(Double.parseDouble(tokens[2]));
                    courseDAO.insert(c);
                }
            }
            for (Course c : courseDAO.getAll()) {
                System.out.println(c.getName() + "" + c.getFees());
            }

            PaymentDAO paymentDAO = new PaymentDAOImpl();
            System.out.print("Import payment data:");
            fileName = input.next();
            for (String line : FileHelper.readLines(fileName)) {
                String[] tokens = line.split(",");
                if (tokens.length >= 6) {
                    int cId=Integer.parseInt(tokens[4]);
                    Course course=new CourseDAO
                    
                    Payment payment = new Payment();
                    payment.setId(Integer.parseInt(tokens[0]));
                    payment.setFirstName(tokens[1]);
                    payment.setLastName(tokens[2]);
                    payment.setEmail(tokens[3]);
                    
                    

                }

            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
