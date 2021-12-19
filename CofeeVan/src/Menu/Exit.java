package Menu;

import Entities.Manager;

public class Exit implements Command{
    @Override
    public void execute(Manager manager){
        System.out.println("Closing program");
        System.exit(0);
    }
}
