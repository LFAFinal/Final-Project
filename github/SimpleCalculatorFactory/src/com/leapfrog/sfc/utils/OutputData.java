/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sfc.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class OutputData {

    public void display() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file name to REad:");
        String filename = input.next();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length >= 3) {
                    Variable var = new Variable();

                    System.out.println(var.toString());
                }
            }

            reader.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }

}
