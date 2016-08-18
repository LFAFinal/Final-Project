package com.leapfrog.ae;

import java.util.Scanner;

/**
 * @author Anonymous
 */
public class Program {

    static double[] percentages = new double[3];
    static double[] totals = new double[3];
    static double[] marks;
static double[] temp=new double[3];
    public static void main(String[] args) {

        String[] students = {"Rohan", "Rishab", "Rojin"};
        String[] subjects = {"English", "Mathmatics", "Science", "Nepali", "Computer"};
        Scanner input = new Scanner(System.in);
        marks = new double[subjects.length];
        for (int j = 0; j < students.length; j++) {
            System.out.println("Enter the marks secured by " + students[j] + " in ");

            for (int i = 0; i < subjects.length; i++) {
                System.out.print("\t\t\t\t" + subjects[i] + ":");
                marks[i] = input.nextDouble();
            }
        }
        for (int j = 0; j < students.length; j++) {
            for (int i = 0; i < subjects.length; i++) {

                totals[j] += marks[i];
                percentages[j] = totals[j] / 5;
            }

        }
       
       
        for (int j = 0; j < students.length; j++) {
            if (percentages[j] >= 40) {
          percentages[j]=temp[j];
          temp[j]=percentages[j];
            }
        } 
        System.out.println("Student Name\t\tResult\t\tTotal\t\tPercantages");
         for (int j = 0; j < students.length; j++) {
            System.out.print(" " + students[j]);
            if (marks[0] >= 40 && marks[1] >= 40 && marks[2] >= 40 && marks[3] >= 40 && marks[4] >= 40) {
                System.out.print("\t");
                if (percentages[j] >= 80) {
                    System.out.print(" Distinction");
                } else if (percentages[j] > 60 && percentages[j] <= 80) {
                    System.out.print(" First Division");
                } else if (percentages[j] > 45 && percentages[j] <= 60) {
                    System.out.print(" Second Division");
                } else if (percentages[j] <= 40) {
                    System.out.print(" Third Division");
                }
            } else {
                System.out.print(" Faild");
            }
            System.out.print("\t");
            System.out.print("\t" + totals[j]);
            System.out.print("\t" + percentages[j]);
            System.out.println("");
        }
    }

}
