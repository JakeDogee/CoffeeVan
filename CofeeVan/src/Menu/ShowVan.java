package Menu;

import Entities.Manager;

public class ShowVan implements Command{
    @Override
    public void execute(Manager manager){

        System.out.println("Showing elements");
        if (manager.getVan().isEmpty()){
            System.out.println("Your van is empty! Please add elements");
        }
        else{
            System.out.println("Van of coffee for size: " + manager.getStartVanSize() +" and budget: " + manager.getStartBudget() + " is");
            System.out.println("Van is loaded by:" + manager.getLoadedVanSize() + " kg. of coffee with price:" + manager.getLoadedBudget() + " dollars");
            manager.showVan(manager.getVan());
        }

    }
}
