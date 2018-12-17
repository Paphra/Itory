package main;

import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;

public class Maker {

    public Maker() {

    }

    // border pane
    public BorderPane bp() {
        return new BorderPane();
    }

    // menu bar
    public MenuBar mb() {
        return new MenuBar();
    }

    // menu
    public Menu menu(String name) {
        return new Menu(name);
    }

    // menu item
    public MenuItem mi(String name) {
        return new MenuItem(name);
    }

    // button
    public Button btn(String text) {
        return new Button(text);
    }

    // TabbedPane
    public TabPane tbp() {
        return new TabPane();
    }

    // Tab
    public Tab tb(String name) {
        return new Tab(name);
    }
}