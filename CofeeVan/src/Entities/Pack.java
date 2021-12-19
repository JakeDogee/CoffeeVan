package Entities;

public class Pack extends PackageType {

    @Override
    public int getWeight() {
        return 70;
    }

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
