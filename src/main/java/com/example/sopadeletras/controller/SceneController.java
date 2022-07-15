package com.example.sopadeletras.controller;

import com.example.sopadeletras.MainGame;
import com.example.sopadeletras.logic.lista;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;



    private String soup = "";



    public void showThemes(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(MainGame.class.getResource("soupType.fxml"));
        root= loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void showSoupFruit(ActionEvent event) throws IOException{
        soup = "frutas";

        FXMLLoader loader = new FXMLLoader(MainGame.class.getResource("fruitSoup.fxml"));
        root= loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        SoupsController controllerTypesSoups = loader.getController();
        controllerTypesSoups.updateScene(soup);
        stage.setScene(scene);
        stage.show();

    }
    public void showSoupAnimal(ActionEvent event) throws IOException{
        soup = "animales";

        FXMLLoader loader = new FXMLLoader(MainGame.class.getResource("fruitSoup.fxml"));
        root= loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        SoupsController controllerTypesSoups = loader.getController();
        controllerTypesSoups.updateScene(soup);
        stage.setScene(scene);
        stage.show();

    }
    public void showSoupPaises(ActionEvent event) throws IOException{
        soup = "paises";
        FXMLLoader loader = new FXMLLoader(MainGame.class.getResource("fruitSoup.fxml"));
        root= loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        SoupsController controllerTypesSoups = loader.getController();
        controllerTypesSoups.updateScene(soup);
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

    /**public void updateScene(){
        this.listaPalabras = new lista(this.soup);
        typeSoup = new Label();
        typeSoup.setText("hola");
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
         //this.listaPalabras.getType()

    }
*/


}
