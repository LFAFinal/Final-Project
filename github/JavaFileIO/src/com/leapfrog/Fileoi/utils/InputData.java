/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Fileoi.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class InputData {
    private Scanner input;

    public InputData(Scanner input) {
this.input=input;
    }
    
    public void write(){
      System.out.print("Enter the file name:");
        String fileName = input.next();
        StringBuilder content = new StringBuilder();
        String line = "";
        while (!(line = input.nextLine()).equalsIgnoreCase(":q")) {
            content.append(line);
        }

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content.toString());
            writer.close();
        } catch (IOException ioe) {
        }
}
}