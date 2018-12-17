/**
 * Creates a menu bar with all the neccessary menus and menu items
 * 
 * @author Epaphradito Lugayavu
 * 
 */
package main.menu_bar;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import main.Maker;

public class MBMain extends MenuBar {

    private MenuBar mb_main;
    private Maker mk;

    public MBMain() {
        init();

    }

    // init method
    public void init() {
        mk = new Maker();
        mb_main = mk.mb();

        mb_main.getMenus().addAll(file("File"), view("View"), tools("Tools"), security("Security"), help("Help"));
    }

    // MENUS
    /**
     * File
     * 
     * @return Menu file
     * @param String name
     */
    public Menu file(String name) {
        Menu f = mk.menu(name);

        return f;

    }

    /**
     * File
     * 
     * @return Menu view
     * @param String name
     */
    public Menu view(String name) {
        Menu v = mk.menu(name);

        return v;

    }

    /**
     * File
     * 
     * @return Menu tools
     * @param String name
     */
    public Menu tools(String name) {
        Menu t = mk.menu(name);

        return t;

    }

    /**
     * File
     * 
     * @return Menu security
     * @param String name
     */
    public Menu security(String name) {
        Menu s = mk.menu(name);

        return s;

    }

    /**
     * File
     * 
     * @return Menu help
     * @param String name
     */
    public Menu help(String name) {
        Menu h = mk.menu(name);

        return h;

    }

    public MenuBar out() {
        return mb_main;
    }

}
