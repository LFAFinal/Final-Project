/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Fileoi;

import com.leapfrog.Fileoi.entity.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
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
        System.out.print("Enter file name to read:");
        String fileName = input.next();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length >= 5) {
                    Employee emp = new Employee();
                    emp.setId(Integer.parseInt(tokens[0]));
                    emp.setFirstName(tokens[1]);
                    emp.setLastName(tokens[2]);
                    emp.setEmail(tokens[3]);
                    emp.setStatus(Boolean.parseBoolean(tokens[4]));
                    System.out.println(emp.toString());
                }
            }
            reader.close();
        } catch (IOException ioe) {

        }
    }
}
