package com.example.labb3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Shape!");
    }

    @FXML
    protected void test() {
        welcomeText.setText("Draw");
    }
}

