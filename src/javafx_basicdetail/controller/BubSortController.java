/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_basicdetail.controller;

import com.jfoenix.controls.JFXSlider;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx_basicdetail.model.Element.ElementArray;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class BubSortController implements Initializable {
    
    
    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button runBtn;
    @FXML
    private TextField numElement;
    @FXML
    private JFXSlider speedSlider;
    @FXML
    private AnchorPane biggestPane;
    private ElementArray arr;


    @FXML
    void handleRunClicked(ActionEvent event) {
        System.out.println("s");
        int numE = Integer.parseInt(numElement.getText());
        int speed = (int)speedSlider.getValue();
        System.out.println(numE);
        System.out.println(speed);
        arr = new ElementArray(numE);
//        biggestPane.getChildren().addAll(arr.getAll());
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
