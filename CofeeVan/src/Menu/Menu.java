package Menu;

import Entities.Manager;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    private final HashMap<String, Command> menuFunctions;
    private Manager manager;

    public Menu(Manager manager) {
        this.manager = manager;
        menuFunctions = new HashMap<>();
        menuFunctions.put("add", new AddCoffeeToVan());
        menuFunctions.put("sort", new Sort());
        menuFunctions.put("showVan", new ShowVan());
        menuFunctions.put("showStorage", new ShowStorage());
        menuFunctions.put("find", new Find());
        menuFunctions.put("exit", new Exit());
    }

    Scanner scan = new Scanner(System.in);

    public void execute() {
        while (true) {
            System.out.println("Input command ('info' - info about list of commands )");
            String command = scan.next();
            if (command.equals("info")){
                System.out.println("add ->> add coffee to your van\n" +
                        "sort ->> sort coffee\n" +
                        "showVan ->> show coffee at your van\n" +
                        "showStorage ->> show coffee at storage\n" +
                        "find ->> find coffee by parameters" +
                        "exit ->> close program");
            }
            else {
                Command menuFunction = menuFunctions.get(command);
                if (menuFunction != null) {
                    menuFunction.execute(manager);
                } else {
                    System.out.println("Unknown command. Try again !\n");
                }
            }
        }
    }
}
