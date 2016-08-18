/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sfc;

import com.leapfrog.sfc.utils.InputData;
import com.leapfrog.sfc.utils.OutputData;
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
        System.out.println("1.Add to file\t2.Display Answer");
        int option; option = input.nextInt();
        InputData idata=new InputData(input);
        OutputData odata=new OutputData();
        switch (option) {
            case 1:
             idata.write(input);
                break;
            case 2:
                odata.display();
                break;

        }

    }
}
