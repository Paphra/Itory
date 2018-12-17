package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import main.main_bp.BPMain;
import main.menu_bar.MBMain;

public class App extends Application {

    private Maker mk = new Maker();
    private MBMain mb_main = new MBMain();
    private BPMain bp_main = new BPMain();

    private BorderPane root;
    private Scene scene;

    @Override
    public void start(Stage stage) {
        init(stage);
        stage.show();
    }

    public void init(Stage stage) {

        root = mk.bp();
        init_root();
        scene = new Scene(root, 800, 600);

        stage.setScene(scene);
        stage.setTitle("Itory Business Operator");
        stage.setResizable(false);

    }

    /**
     * MAIN BORDERPANE
     */
    public void init_root() {
        root.setTop(mb_main.out());
        root.setCenter(bp_main.out());
    }

    public static void main(String[] args) {
        launch(args);
    }
}