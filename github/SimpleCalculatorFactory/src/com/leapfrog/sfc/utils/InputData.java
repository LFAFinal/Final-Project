/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sfc.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class InputData {
    private Scanner input;

    public InputData() {
    }

    public InputData(Scanner input) {
        this.input = input;
    }
    
  public void write(Scanner input){
       System.out.print("Enter the file name:");
                String filename = input.next();
                StringBuilder content = new StringBuilder();
                String line = "";
                while (!(line = input.nextLine()).equalsIgnoreCase("exit")) {
                    content.append(line);
                }
                try {
                    FileWriter writer = new FileWriter(filename);
                    writer.write(content.toString());
                    writer.close();
                } catch (IOException ioe) {
                    System.out.println(ioe.getMessage());

                }
  }  
    
    
}
