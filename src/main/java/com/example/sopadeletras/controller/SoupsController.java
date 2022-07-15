package com.example.sopadeletras.controller;

import com.example.sopadeletras.MainGame;
import com.example.sopadeletras.logic.lista;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class SoupsController {

    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    private Label typeSoup, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9;

    private lista listaPalabras;


    public void updateScene(String soup){
        this.listaPalabras = new lista(soup);
        typeSoup.setText(this.listaPalabras.getType());
        p0.setText(this.listaPalabras.getLista().get(0));
        p1.setText(this.listaPalabras.getLista().get(1));
        p2.setText(this.listaPalabras.getLista().get(2));
        p3.setText(this.listaPalabras.getLista().get(3));
        p4.setText(this.listaPalabras.getLista().get(4));
        p5.setText(this.listaPalabras.getLista().get(5));
        p6.setText(this.listaPalabras.getLista().get(6));
        p7.setText(this.listaPalabras.getLista().get(7));
        p8.setText(this.listaPalabras.getLista().get(8));
        p9.setText(this.listaPalabras.getLista().get(9));

    }

    public void showThemes(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(MainGame.class.getResource("soupType.fxml"));
        root= loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}
