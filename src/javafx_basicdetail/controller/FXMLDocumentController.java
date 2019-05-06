/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_basicdetail.controller;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


/**
 *
 * @author Admin
 */
public class FXMLDocumentController implements Initializable {
//    @FXML
//    private Label label;
    
    @FXML
    private void handleButtonAction(javafx.event.ActionEvent event) throws IOException {
        //label.setText("Hello World!");
        if (event.getSource() == bubBtn) {
            loadStage("/javafx_basicdetail/view/BubbleSort.fxml");
        }
        else if(event.getSource() == selecBtn){
            loadStage("/javafx_basicdetail/view/SelectionSort.fxml");
        }
        else if(event.getSource() == mergeBtn){
            System.out.println("You clicked me!");
            loadStage("/javafx_basicdetail/view/MergeSort.fxml");
        }
        else if(event.getSource()==bucBtn){
            System.out.println("You clicked me!");
            loadStage("/javafx_basicdetail/view/BucketSort.fxml");
        }
        
        
        
   
    }
    @FXML
    private Button bubBtn;
      @FXML
    private Button selecBtn;

    @FXML
    private Button mergeBtn;

    @FXML
    private Button bucBtn;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    private void loadStage(String fxml) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxml));
        //Parent root = FXMLLoader.load(getClass().getResource("DashBoard.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("DashBoard.fxml"));
        Stage stage=new Stage();
        Scene scene = new Scene(root);
        //Stage stage=new Stage();
        stage.setScene(scene);
        stage.setTitle("VisualAlgo");
        stage.show();
    }
    
}
