/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.webserver;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
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
        int port = 9000;
         try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Server is running at" + port);
            while (true) {
                Socket client = server.accept();
                System.out.println("Got request from " + client.getInetAddress().getHostAddress());
                PrintStream ps = new PrintStream(client.getOutputStream());
                ps.println("Enter uname:");
                Scanner input = new Scanner(client.getInputStream());
                String uname = input.next();
                if(uname.equalsIgnoreCase("hello")){
                    ps.print("Enter password:");
                    String pass=input.next();
                    if(pass.equalsIgnoreCase("123")){
                        ps.print("Welcome to My Server");
                        
                        
                        
                        
                        
                        
                    }
                    else{
                        System.out.println("Wrong password");
                    }
                }
                 else{
                        System.out.println("Wrong uname.");
                    }

            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
