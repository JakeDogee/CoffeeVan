package Entities;

public class Instant extends CofeeType {

    @Override
    public int getPrice() {
        return 300;
    }

    public String toString(){
        return this.getClass().getSimpleName();
    }

}
