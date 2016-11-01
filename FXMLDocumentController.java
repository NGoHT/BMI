/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Krisztian
 */
public class FXMLDocumentController implements Initializable {
    //Labels, Textfields to work with
    @FXML
    public Label result;
    @FXML
    public TextField textfield1;
     @FXML
    public TextField textfield2;
     @FXML
    public Button button1;
     
    
    @FXML
    public void Calculate(ActionEvent event) {
        double height=Double.parseDouble(textfield1.getText()); //Parse string to double
        int weight=Integer.parseInt(textfield2.getText());      //Parse string to int
        double BMI=weight/(height*height);
        
        //round to 2 decimals without string format
        BMI = Math.round(BMI * 100);
        BMI = BMI/100;
        
        //print result according to BMI ranges
        
         if(BMI <18.5 && BMI>7.5){           //7.5 is the record lowest BMI
        result.setText("Your BMI is: "+BMI+" You are underweight!");
         }
         else if(BMI >=18.5 && BMI<=25){
          result.setText("Your BMI is: "+BMI+" You are healthy!");
         }else if(BMI >25 && BMI<=29.9){
          result.setText("Your BMI is: "+BMI+" You are overweight!");
         }else if(BMI>30&& BMI <186){       //~185.6 is the Guiness record for BMI
          result.setText("Your BMI is: "+BMI+" You are obese!");
         }else{
          result.setText("Enter valid numbers.");
         }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
