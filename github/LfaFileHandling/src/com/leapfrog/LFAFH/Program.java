/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.LFAFH;

import com.leapfrog.LFAFH.entity.AddData;
import com.leapfrog.LFAFH.entity.ShowData;
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
        AddData ad = new AddData(input);
        
        System.out.println("==============Manu==============");
        System.out.println("1.Add data to math.csv");
        System.out.println("2.Display Final.csv");
        System.out.println("3.Display Broken List");
        System.out.println("4.Exit");
        int option = input.nextInt();
        switch (option) {
            case 1:
                ad.Add();
                break;
            case 2:
                ShowData.Display();
                break;
            case 3:
                
                break;
            case 4:
                System.out.println("Thanks you for using my Program");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input.\nPlease try again");
        }
    }

}
