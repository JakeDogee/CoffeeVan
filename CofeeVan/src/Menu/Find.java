package Menu;

import Entities.Coffee;
import Entities.Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Find implements Command{
    Scanner scan = new Scanner(System.in);
    @Override
    public void execute(Manager manager){
        if (manager.getVan().isEmpty()){
            System.out.println("Your van is empty! Please add elements");
        }
        else{
            List<Coffee> newList = new ArrayList<>();
            System.out.println("Choose finding type:\n" +
                    "1 - by coffeeType(Ground, Beans, Instant)\n" +
                    "2 - by packageType(Jar, Pack)");
            int sortType = scan.nextInt();
            switch (sortType){
                case 1:
                    findByCoffeeType(manager.getVan(),newList);
                    System.out.println("Found list:");
                    manager.showVan(newList);
                    break;
                case 2:
                    findByPackageType(manager.getVan(),newList);
                    System.out.println("Found list:");
                    manager.showVan(newList);
                    break;
            }

        }
    }

    public void findByCoffeeType(List<Coffee> van, List<Coffee> newList){
        System.out.println("Input CoffeeType to find ->>");
        String coffeeType = scan.next();
        for (Coffee i : van){
            if (i.toStringCoffeeType().equals(coffeeType)){
                newList.add(i);
            }
        }
    }

    public void findByPackageType(List<Coffee> van, List<Coffee> newList){
        System.out.println("Input PackageType to find ->>");
        String packageType = scan.next();
        for (Coffee i : van){
            if (i.toStringPackageType().equals(packageType)){
                newList.add(i);
            }
        }
    }
}
