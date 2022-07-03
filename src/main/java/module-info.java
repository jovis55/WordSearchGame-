module com.example.sopadeletras {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sopadeletras to javafx.fxml;
    exports com.example.sopadeletras;
    exports com.example.sopadeletras.controller;
    opens com.example.sopadeletras.controller to javafx.fxml;
}