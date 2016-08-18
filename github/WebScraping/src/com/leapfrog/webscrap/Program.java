/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.webscrap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Anonymous
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String site;
        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the url:");
        site = input.next();
        System.out.println("Press 1 to continue");

        /*
         System.out.println("Choose what you want to display");
         System.out.println("1.Job Item ID\t2.Links\t3.Post/Designation");*/
        System.out.print("Option:");
        i = input.nextInt();
        try {
            URL url = new URL(site);
            URLConnection conn = url.openConnection();
            InputStream is = conn.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            System.out.println("Scrapping....");
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            String regEx = "<img src=\"(.*)\"(.*)/>";
            //String regEx = "<a class=\"job-item\"(.*?)href=\"(.*?)\"\\s>\\n(.*?)</a>";
            Pattern pattern = Pattern.compile(regEx);
            Matcher matcher = pattern.matcher(content.toString());
            while (matcher.find()) {
                System.out.println(matcher.group(i).trim());
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }

}
