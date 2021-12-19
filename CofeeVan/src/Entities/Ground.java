package Entities;

public class Ground extends CofeeType {

    @Override
    public int getPrice() {
        return 500;
    }

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
