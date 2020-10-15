package com.sergion;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class menuController {
    @FXML
    Button exitButton;

    //public Game game = new Game();

    @FXML
    private void startSinglePlayer() throws IOException {
        Game.startSinglePlayer();
    }

    @FXML
    private void startMultiPlayer() throws IOException {
        Game.startMultiPlayer();
    }

    @FXML
    private void buttonExit() {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
}
