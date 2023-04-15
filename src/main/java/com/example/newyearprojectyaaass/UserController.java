package com.example.newyearprojectyaaass;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

public class UserController {
    @FXML
    private TextField emailText,passwordText;
    @FXML
    private Button xbutton;
    @FXML
    private AnchorPane ScenePane;
    Stage stage;
    @FXML
    private RadioButton seller,admin,user;
    @FXML
    private RadioButton AdminButton,SellerButton,UserButton;
    @FXML
    private Button logout;
    @FXML
    private Scene scene;
    private Parent root;

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
    public void RadioButton(ActionEvent event){
        if(AdminButton.isSelected()){
            String email = emailText.getText();
            String password = String.valueOf(passwordText.getText());
            try{
                Connection con =MyConnection.getConnection();
                PreparedStatement ps;
                ps = con.prepareStatement("select * from admin where email =? and password =? ");
                ps.setString(1,email);
                ps.setString(2,password);
                ResultSet rs = ps.executeQuery();
                if(rs.next()) {
                    Parent root = FXMLLoader.load(getClass().getResource("AdminDashboardFXML.fxml"));
                    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
                else{
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setContentText("email address or password is incorrect!");
                }
            } catch(SQLException | IOException ex){
                ex.printStackTrace();
            }
        }
        else if (SellerButton.isSelected()){

        }
        else if (UserButton.isSelected()){

        }
    }

}