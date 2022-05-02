package com.example.animations;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HW7 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        HBox hbox = new HBox();
        HBox hbox2 = new HBox();
        Pane pane = new Pane();
        BorderPane bp = new BorderPane();

        Text text = new Text("Programming is fun");
        text.setX(200);
        text.setY(200);
        Button btn1 = new Button("<=");
        Button btn2 = new Button("=>");


        RadioButton r1 = new RadioButton("Red");
        RadioButton r2 = new RadioButton("Yellow");
        RadioButton r3 = new RadioButton("Black");
        RadioButton r4 = new RadioButton("Orange");
        RadioButton r5 = new RadioButton("Green");

        btn1.setOnAction(e -> text.setX(text.getX() - 10));
        btn2.setOnAction(e -> text.setX(text.getX() + 10));

        ToggleGroup group = new ToggleGroup();
        r1.setToggleGroup(group);
        r2.setToggleGroup(group);
        r3.setToggleGroup(group);
        r4.setToggleGroup(group);
        r5.setToggleGroup(group);

        r1.setOnAction(e -> {
            text.setFill(Color.RED);
        });
        r2.setOnAction(e -> {
            text.setFill(Color.YELLOW);
        });
        r3.setOnAction(e -> {
            text.setFill(Color.BLACK);
        });
        r4.setOnAction(e -> {
            text.setFill(Color.ORANGE);
        });
        r5.setOnAction(e -> {
            text.setFill(Color.GREEN);
        });

        hbox.getChildren().addAll(r1 , r2, r3, r4, r5);
        hbox2.getChildren().addAll(btn1 , btn2);
        pane.getChildren().addAll(text);

        bp.setTop(hbox);
        bp.setCenter(pane);
        bp.setBottom(hbox2);

        Scene scene = new Scene(bp , 500 , 500);
        primaryStage.setTitle("MMM");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
