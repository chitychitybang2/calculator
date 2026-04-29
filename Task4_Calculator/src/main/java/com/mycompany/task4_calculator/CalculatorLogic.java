/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task4_calculator;

/**
 *
 * @author Student
 */
public class CalculatorLogic {
    public double calculate(String expression){
        
        String[] tokens = expression.split(" ");
        
        double result = Double.parseDouble(tokens[0]);
        
        for (int i = 1; i < tokens.length; i += 2) {
            String op = tokens[i];
            double num = Double.parseDouble(tokens[i + 1]);
            
            switch (op) {
                case "+":
                    result += num;
                    break;
                case "-":
                    result -= num;
                    break;
                case "x":
                    result *= num;
                    break;
                case "/":
                    result /= num;
                    break;
            }
        }
        return result;
    }
}
