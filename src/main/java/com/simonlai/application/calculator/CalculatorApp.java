package com.simonlai.application.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class CalculatorApp extends Application {
    public static Stage primeStage;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculatorApp.class.getResource("CalculatorInterface.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.setFill(Color.TRANSPARENT);
        stage.setTitle("Simon's Calculator");
        stage.initStyle(StageStyle.TRANSPARENT);
        // stage.getIcons().add()  // Add Icons
        stage.setResizable(false);
        stage.setScene(scene);
//        primeStage = stage;
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}