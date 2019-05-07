/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_basicdetail.controller;

import com.jfoenix.controls.JFXButton;
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
import javafx_basicdetail.model.algos.Bubble;
import javafx_basicdetail.model.algos.*;
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
        if (arr != null)
            biggestPane.getChildren().removeAll(arr.getAll());
        arr = new ElementArray(numE);
        biggestPane.getChildren().addAll(arr.getAll());
//        Bubble buble = Bubble.getInstance();
//        buble.sort(arr);
//        arr.toString();
    }
      @FXML
    private JFXButton playButton;

    @FXML
    void handlePlayBtn(ActionEvent event) {
        System.out.println("helo");
        Bubble buble = Bubble.getInstance();
        buble.sort(arr);
//        arr.toString();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
