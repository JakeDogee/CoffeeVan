package Entities;

public class Coffee {
    private String name;
    private CofeeType coffeeType;
    private PackageType packageType;
    private int weight;
    private int price;

    public Coffee(String name, CofeeType cofeeType, PackageType packageType) {
        this.name = name;
        this.coffeeType = cofeeType;
        this.packageType = packageType;
        this.weight = packageType.getWeight();
        this.price = cofeeType.getPrice();

    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String toStringCoffeeType(){
        return coffeeType.toString();
    }

    public String toStringPackageType(){
        return packageType.toString();
    }
    public String toString(){
        return name + "\t\t" + coffeeType + "\t\t\t" + packageType + "\t\t\t" + weight + "\t\t\t\t" + price;
    }
}
