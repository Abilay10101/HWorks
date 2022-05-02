package com.example.animations;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class HW6 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        CarPane pane = new CarPane();


        pane.setOnMousePressed(e -> pane.pause());
        pane.setOnMouseReleased(e -> pane.play());

        pane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                pane.increaseSpeed();
            }
            else if (e.getCode() == KeyCode.DOWN) {
                pane.decreaseSpeed();
            }
        });

        Scene scene = new Scene(pane, 600, 100);
        primaryStage.setTitle("HW6");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }
}
