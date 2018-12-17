package main.preloader;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Preloader extends Preloader {

    @Override
    public void start(Stage stage) {
        init(stage);
        stage.show();

    }

    public void init(Stage stage) {
        BorderPane bp = new BorderPane();
        Scene scene = new Scene(bp, 300, 200);
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}