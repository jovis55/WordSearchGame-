package com.example.sopadeletras.controller;

import com.example.sopadeletras.MainGame;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class introController {
    private Stage stage;


    @FXML
    void showThemes(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainGame.class.getResource("soupType.fxml"));
        Parent root= loader.load();
        themesController controller = loader.getController();
        Scene scene = new Scene(root, 1300, 700);
        Stage stage = new Stage();
        stage.setTitle("Sopa de letras");
        stage.setScene(scene);
        controller.init(stage, this);


        stage.show();
        this.stage.close();

    }

    public void setStage(Stage primaryStage) {
        stage = primaryStage;

    }

    public void show() {
        stage.show();
    }
}