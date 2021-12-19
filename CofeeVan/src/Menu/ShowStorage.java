package Menu;

import Entities.Manager;

public class ShowStorage implements Command{
    @Override
    public void execute(Manager manager){
        System.out.println("\t\t\t\t\t\t\tCoffee at storage:\n" +
                "Coffee types: 1.Beans(1000 dollars/kg)            Package types: 1.Jar(100 kg)\n" +
                "              2.Ground(500 dollars/kg)                           2.Pack(70 kg)\n" +
                "              3.Instant(300 dollars/kg");
    }
}
