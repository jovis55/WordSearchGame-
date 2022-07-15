package com.example.sopadeletras.controller;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class SoupsController {


    @FXML
    public AnchorPane anchorPane1;


    @FXML
    public void iniciar() throws IOException {
        GridPane root = new GridPane();
        Button buttom= new Button("Buttom1");
        Rectangle rect = new Rectangle(0,0,40,40);
        rect.setFill(Color.BLACK);
        anchorPane1.getChildren().add(rect);
        root.add(buttom, 0, 0, 40, 40);

        /**for(int i= 0; i <= 0; i++){
            for(int j = 0; j <= 0; j++){
                Button buttom= new Button("Buttom"+i);
                root.add(buttom, i, j);
            }
        }
         */

        anchorPane1.getChildren().add(root);



    }

}
