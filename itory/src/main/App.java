package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

    Maker mk = new Maker();

    private BorderPane root;
    private Scene scene;

    @Override
    public void start(Stage stage) {
        init(stage);
        stage.show();
    }

    public void init(Stage stage) {

        root = mk.bp();
        scene = new Scene(root, 800, 600);

        stage.setScene(scene);
        stage.setTitle("Itory Business Operator");

    }

    public static void main(String[] args) {
        launch(args);
    }
}