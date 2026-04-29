/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.task4_calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Student
 */
public class FXMLController implements Initializable {
    @FXML private TextField displayField;
    
    private String expression = "";
    private CalculatorLogic logic = new CalculatorLogic();
      
    @FXML 
    private void handleNumber(javafx.event.ActionEvent event) {
        String value = ( (Button) event.getSource()).getText();
        if (value.equals(".")) {
            String[] parts = expression.split("");
            String lastNumber = parts[parts.length - 1];
            
            if (lastNumber.contains(".")){
                return;
            }
            if (lastNumber.isEmpty()){
                expression += "0";
            }
            
        }
        expression += value;
        displayField.setText(expression);
    }
            
    @FXML
    private void handleOperator(javafx.event.ActionEvent event){
        String op = ( (Button) event.getSource()).getText();
        expression += " " + op + " ";
        displayField.setText(expression);
    }
    
    @FXML 
    private void handleEqual() {
        double result = logic.calculate(expression);
        displayField.setText(String.valueOf(result));
        expression = String.valueOf(result); //continue to compute
    }
    
    @FXML
    private void handleClear() {
        expression = " ";
        displayField.clear();
    }
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
