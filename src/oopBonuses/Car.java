package oopBonuses;

public class Car {

    private String owner;
    private int mileage;
    private int mpg;

    private Car(String owner, int mileage, int mpg){
        this.owner = owner;
        this.mileage = mileage;
        this.mpg = mpg;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    public void setMpg(int mpg){
        this.mpg = mpg;
    }

    public String getOwner(){
        return owner;
    }

    public int getMileage(){
        return mileage;
    }

    public int getMpg() {
        return mpg;
    }

}
