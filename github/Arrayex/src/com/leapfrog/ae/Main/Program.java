/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ae.Main;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Program {

    /**
     *
     * @author Anonymous
     * @param args
     */
    public static void main(String[] args) {
        int i;
        double[] total = null;
        double[] per = null;
        String[] students = {"Rohan", "Roshan", "Roman", "Robin"};
        String[] subjects = {"English", "Mathmatics", "Science", "Nepali", "Computer"};
        Scanner input = new Scanner(System.in);
        double[] marks = new double[subjects.length];

        for (i = 0; i < subjects.length; i++) {
            System.out.println("Enter the marks secured by" + students[i] + "in:");
            System.out.print("\t\t\t\t" + subjects[i] + ":");
            marks[i] = input.nextDouble();

        }

        for (i = 0; i < subjects.length; i++) {
            total[i] = total[i] + marks[i];

            per[i] = total[i] / 5;
        }
        System.out.println("Student Name\t\tResult\t\tTotal\t\tPercantages");

        if (marks[0] >= 40 & marks[1] >= 40 & marks[2] >= 40 & marks[3] >= 40 & marks[4] >= 40) {
            System.out.print("\t");
            if (per[i] >= 80) {
                System.out.print(" Distinction");
            } else if (per[i] > 60 && per[i] <= 80) {
                System.out.print(" First Division");
            } else if (per[i] > 45 && per[i] <= 60) {
                System.out.print(" Second Division");
            } else if (per[i] <= 40) {
                System.out.print(" Third Division");
            }
        } else {
            System.out.print(" Faild");
        }
        System.out.print("\t");
        System.out.print("\tTotal marks:" + total[i]);
        System.out.print("\tPercantage:" + per[i]);
        System.out.println("");
    }
}
