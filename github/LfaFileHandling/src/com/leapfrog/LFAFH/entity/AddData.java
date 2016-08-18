/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.LFAFH.entity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class AddData {

    private Scanner input;

    public AddData() {
    }

    public  AddData(Scanner input) {
        this.input = input;
    }
    public  void Add(){
         String folder="g:hello/";
         File file=new File(folder);
         if(!file.isDirectory()){
             
         }
                try {
                    FileWriter writer = new FileWriter(folder+"course");
                    writer.write(content.toString());
                    writer.close();
                } catch (IOException ioe) {
                    System.out.println(ioe.getMessage());

                }
    }

}
