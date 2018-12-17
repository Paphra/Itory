package main.main_bp;

import javafx.scene.layout.BorderPane;
import main.Maker;

public class BPMain {

    private BorderPane bp_main;
    private Maker mk;

    public BPMain() {
        mk = new Maker();
        bp_main = mk.bp();

        _init_();
    }

    /**
     * Initialize the main borderpane
     */
    private void _init_() {

    }

    /**
     * Output the main border pane
     * 
     * @return BorderPane bp_main
     * @author Paphra
     */
    public BorderPane out() {
        return bp_main;
    }
}