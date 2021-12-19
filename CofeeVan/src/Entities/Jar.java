package Entities;

public class Jar extends PackageType{


    @Override
    public int getWeight() {
        return 100;
    }

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
