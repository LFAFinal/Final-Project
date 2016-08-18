/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sfc.utils;

/**
 *
 * @author Anonymous
 */
public class VariableFactory {
   
    public static Variable get(String tokens[]) {
        if (tokens[1].equalsIgnoreCase("+")) {
            return new AddVariable();
        } else if (tokens[1].equalsIgnoreCase("-")) {
            return new SubVariable();
        } else if (tokens[1].equalsIgnoreCase("*")) {
            return new MulVariable();
        } else if (tokens[1].equalsIgnoreCase("/")) {
            return new DivVariable();
        } else if (tokens[1].equalsIgnoreCase("Max")) {
            return new MaxVariables();
        } else if (tokens[1].equalsIgnoreCase("Min")) {
            return new MinVariable();
        }

        return null;
    }
}
