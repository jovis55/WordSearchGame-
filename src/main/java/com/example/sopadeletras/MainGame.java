package com.example.sopadeletras;

import javafx.application.Application;
import com.example.sopadeletras.controller.introController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainGame extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainGame.class.getResource("introGame.fxml"));
        Parent root= loader.load();
        Scene scene = new Scene(root, 1300, 700);
        primaryStage.setTitle("Sopa de letras");
        primaryStage.setScene(scene);

        introController controller = loader.getController();
        controller.setStage(primaryStage);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}