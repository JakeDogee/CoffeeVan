package Main;

import Entities.*;
import Menu.Menu;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Menu menu = new Menu(manager);
        menu.execute();
    }
}
