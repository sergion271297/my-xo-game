package com.sergion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Game extends Application {

    private static Scene scene;
    public static boolean singlePlayer;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("menu"));
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Game.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void startMultiPlayer() throws IOException {
        System.out.println("startMultiPlayer");
        Game.singlePlayer = false;
        Game.setRoot("field");
    }

    public static void startSinglePlayer() throws IOException {
        System.out.println("startSinglePlayer");
        Game.singlePlayer = true;
        Game.setRoot("field");
    }

}