package Entities;

import java.util.List;
import java.util.ArrayList;

public class Manager {
    private List<Coffee> van = new ArrayList<>();
    private int vanSize;
    private int startVanSize;
    private int budget;
    private int startBudget;
    private boolean budgetStatus = true;
    private boolean vanSizeStatus = true;


    public List<Coffee> getVan() {
        return van;
    }

    public int getLoadedVanSize() {
        return startVanSize - vanSize;
    }

    public int getLoadedBudget() {
        return startBudget - budget;
    }

    public int getStartVanSize() {
        return startVanSize;
    }

    public int getStartBudget() {
        return startBudget;
    }

    public void setBudget(int budget) {
        this.startBudget = budget;
        this.budget = budget;
    }

    public void setVanSize(int vanSize) {
        this.startVanSize = vanSize;
        this.vanSize = vanSize;
    }

    public boolean isBudgetStatus() {
        return budgetStatus;
    }

    public boolean isVanSizeStatus() {
        return vanSizeStatus;
    }

    public void addCoffee(Coffee coffee){
        van.add(coffee);
    }

    public void showVan(List<Coffee> coffeeList){
        System.out.println("Name\t\tCoffeeType\t\tPackageType\t\tWeight(kg)\t\tPrice(dollars/kg)");
        for (Coffee i : coffeeList){
            System.out.println(i);
        }
    }
    public void checkSize(int size){
        this.vanSize -= size;
        if(this.vanSize < 0){
            this.vanSize = 0;
            this.vanSizeStatus = false;
        }
    }
    public void checkBudget(int price){
        this.budget -= price;
        if (this.budget < 0){
            this.budget = 0;
            this.budgetStatus = false;
        }
    }

}
