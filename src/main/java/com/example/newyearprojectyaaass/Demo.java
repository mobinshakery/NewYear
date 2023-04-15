package com.example.newyearprojectyaaass;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Demo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(User.class.getResource("AdminDashboardFXML.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 240);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
