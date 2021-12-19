package Menu;

import Entities.Coffee;
import Entities.Manager;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Sort implements Command{
    Scanner scan = new Scanner(System.in);
    @Override
    public void execute(Manager manager){
        if (manager.getVan().isEmpty()){
            System.out.println("Your van is empty! Please add elements");
        }
        else{
            System.out.println("Choose sorting type:\n" +
                    "1 - by price\n" +
                    "2 - by weight");
            int sortType = scan.nextInt();
            switch (sortType){
                case 1:
                    sortByPrice(manager.getVan(),manager);
                    break;
                case 2:
                    sortByWeight(manager.getVan(),manager);
                    break;
            }
        }
    }

    public void sortByPrice(List<Coffee> van, Manager manager){
        System.out.println("Sorting your van by price");
        Comparator<Coffee> comparator = Comparator.comparing(Coffee::getPrice);
        manager.getVan().sort(comparator);
        manager.showVan(van);
    }

    public void sortByWeight(List<Coffee> van, Manager manager){
        System.out.println("Sorting your van by weight");
        Comparator<Coffee> comparator = Comparator.comparing(Coffee::getWeight);
        manager.getVan().sort(comparator);
        manager.showVan(van);
    }

}
