package oopBonuses;

public class Product {

    private double price;
    private String name;
    private String soldAt;

    public Product(double price, String name, String soldAt){
        this.price = price;
        this.name = name;
        this.soldAt = soldAt;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSoldAt(String soldAt){
        this.soldAt = soldAt;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public String getSoldAt(){
        return soldAt;
    }
}
