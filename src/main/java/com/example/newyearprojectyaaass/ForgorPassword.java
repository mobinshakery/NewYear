package com.example.newyearprojectyaaass;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ForgorPassword extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        FXMLLoader fxmlLoader = new FXMLLoader(User.class.getResource("ForgotPasswordFXML.fxml"));
        Scene primaryscene = null;
        try {
            primaryscene = new Scene(fxmlLoader.load(), 400, 240);
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setScene(primaryscene);
        primaryStage.show();
    }
}
