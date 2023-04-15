package com.example.newyearprojectyaaass;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    public static final String username = "";//mysql username
    public static final String password = "0912mosh";//mysql password
    public static final String url = "jdbc:mysql://localhost:3306/online_shopping";
    public static Connection con = null;

    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
        } catch(Exception ex){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        }
        return con;
    }
}
