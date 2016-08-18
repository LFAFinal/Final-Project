/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.LFAFH.entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class ShowData {

    public static void Display() {
        Scanner input = new Scanner(System.in);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("g:/myfolder/final.csv"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length >= 3) {
                    DataProcess dataprocess = new DataProcess();
                    System.out.println(dataprocess.toString());
                }
            }

            reader.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
