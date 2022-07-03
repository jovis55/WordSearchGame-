package com.example.sopadeletras.controller;

import com.example.sopadeletras.MainGame;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void showThemes(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(MainGame.class.getResource("soupType.fxml"));
        root= loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void showIntro(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(MainGame.class.getResource("introGame.fxml"));
        root= loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void showInfo(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(MainGame.class.getResource("infoGame.fxml"));
        root= loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
