package Entities;

public class Beans extends CofeeType {

    @Override
    public int getPrice() {
        return 1000;
    }

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
