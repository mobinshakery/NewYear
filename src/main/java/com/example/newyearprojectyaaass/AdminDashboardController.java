package com.example.newyearprojectyaaass;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashboardController {
    @FXML
    private Button logout,managecategories;
    @FXML
    private AnchorPane ScenePane;
    Stage stage;
    private Scene scene;
    private Parent root;

    public void ManageCategoriesButton(ActionEvent event) throws IOException {

            Parent root = FXMLLoader.load(getClass().getResource("CategoryFXML.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

    public void LogOutButton(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout!");
        alert.setHeaderText("You are about to logout ");
        alert.setContentText("are you sure?");

        if(alert.showAndWait().get() == ButtonType.OK){
            Parent root = FXMLLoader.load(getClass().getResource("UserFXML.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    public void ManageProductButton(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ProductFXML.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ManageUsersButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ManageUsersFXML.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void AddSupliersButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddSellerFXML.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ManageSupliersButton(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ManageSellerFXML.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void SelectSupplierButton(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SelectSellerFXML.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void DealingButton(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("DealiNgFXML.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
