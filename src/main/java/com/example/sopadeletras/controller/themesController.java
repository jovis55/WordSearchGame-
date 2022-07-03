package com.example.sopadeletras.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class themesController {

    private introController controller2;
    private Stage stage;

    @FXML
    public void backIntro(ActionEvent event) {



        controller2.show();
        stage.close();

    }


    public void init(Stage stage, introController introController) {
        this.controller2= introController;
        this.stage= stage;
    }
}
