package com.example.newyearprojectyaaass;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SelectSellerController {
    @FXML
    private Button xbutton;
    @FXML
    private AnchorPane ScenePane;
    Stage stage;

    //
    //writing methods for the choicebox
    //
    //

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
    public void SelectButton(ActionEvent event){

    }

}
