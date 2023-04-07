package com.example.newyearprojectyaaass;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UserController {
    @FXML
    private Button xbutton;
    @FXML
    private AnchorPane ScenePane;
    Stage stage;
    @FXML
    private RadioButton seller,admin,user;


    public void XButton(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout!");
        alert.setHeaderText("You are about to logout ");
        alert.setContentText("are you sure?");

        if(alert.showAndWait().get() == ButtonType.OK){
        stage = (Stage) ScenePane.getScene().getWindow();
        System.out.println("You successfully logged out!");
        stage.close();
        }
    }
    public void LoginButton(ActionEvent event){

    }
    public void ForgotButton(ActionEvent event){

    }
    public void SignUpButton(ActionEvent event){

    }
    //FOR THE RADIO BUTTONS WE NEED METHODS

}