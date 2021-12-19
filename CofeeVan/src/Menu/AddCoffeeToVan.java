package Menu;

import java.util.Scanner;

import Entities.*;

public class AddCoffeeToVan implements Command {
    Scanner scan = new Scanner(System.in);

    @Override
    public void execute(Manager manager) {
        if(!manager.getVan().isEmpty()){
            inputCoffee(manager);
        }
        else{
            System.out.println("Input your budget");
            int budget = scan.nextInt();
            manager.setBudget(budget);
            System.out.println("Input size of your van");
            int vanSize = scan.nextInt();
            manager.setVanSize(vanSize);
            inputCoffee(manager);
        }
    }

    public void inputCoffee(Manager manager) {
        System.out.println("Add coffee to your van by this parameters\n" +
                "\"Name\"" +
                " \"CoffeeType\"" +
                " \"PackageType\"" +
                "\nCoffeeType (Ground, Instant, Beans)   PackageType (Jar, Pack)");
        String[] parametersArr = new String[3];
        parametersArr[0] = scan.next();
        parametersArr[1] = scan.next();
        parametersArr[2] = scan.next();
        Coffee tempCoffee = null;
        switch (parametersArr[1]){
            case "Ground":
                Ground ground = new Ground();
                if(parametersArr[2].equals("Jar")){
                    Jar jar = new Jar();
                    tempCoffee = new Coffee(parametersArr[0], ground, jar);
                    manager.checkBudget(tempCoffee.getPrice());
                    manager.checkSize(tempCoffee.getWeight());
                    break;
                }
                else if(parametersArr[2].equals("Pack")){
                    Pack pack = new Pack();
                    tempCoffee = new Coffee(parametersArr[0], ground, pack);
                    manager.checkBudget(tempCoffee.getPrice());
                    manager.checkSize(tempCoffee.getWeight());
                    break;
                }
                else{
                    System.out.println("Wrong PackageType");
                    break;
                }
            case "Instant":
                Instant instant = new Instant();
                if(parametersArr[2].equals("Jar")){
                    Jar jar = new Jar();
                    tempCoffee = new Coffee(parametersArr[0], instant, jar);
                    manager.checkBudget(tempCoffee.getPrice());
                    manager.checkSize(tempCoffee.getWeight());
                    break;
                }
                else if(parametersArr[2].equals("Pack")){
                    Pack pack = new Pack();
                    tempCoffee = new Coffee(parametersArr[0], instant, pack);
                    manager.checkBudget(tempCoffee.getPrice());
                    manager.checkSize(tempCoffee.getWeight());
                    break;
                }
                else{
                    System.out.println("Wrong PackageType");
                    break;
                }
            case "Beans":
                Beans beans = new Beans();
                if(parametersArr[2].equals("Jar")){
                    Jar jar = new Jar();
                    tempCoffee = new Coffee(parametersArr[0], beans, jar);
                    manager.checkBudget(tempCoffee.getPrice());
                    manager.checkSize(tempCoffee.getWeight());
                    break;
                }
                else if(parametersArr[2].equals("Pack")){
                    Pack pack = new Pack();
                    tempCoffee = new Coffee(parametersArr[0], beans, pack);
                    manager.checkBudget(tempCoffee.getPrice());
                    manager.checkSize(tempCoffee.getWeight());
                    break;
                }
                else{
                    System.out.println("Wrong PackageType");
                    break;
                }
            default:
                System.out.println("Wrong CoffeeType");
                break;

        }
        if (!manager.isBudgetStatus()){
            System.out.println("Your budget is empty\n");
        }
        else if (!manager.isVanSizeStatus()){
            System.out.println("Your van is full\n");
        }
        else{
            System.out.println("Coffee " + "\"" + tempCoffee.getName() + "\"" + " added to your van\n");
            manager.addCoffee(tempCoffee);
        }

    }

}
