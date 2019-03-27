package oop;

public class RestaurantDish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public String eat() {
        return nameOfDish  + ", Nom nom nom!";
    }

    public RestaurantDish(int costInCents, String nameOfDish, boolean wouldRecommend){
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public String getDishName(){
        return this.nameOfDish;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public int getCost(){
        return this.costInCents;
    }

    public boolean getIt(){
        return this.wouldRecommend;
    }

    public void setNewName(String nameOfDish){
        this.nameOfDish = nameOfDish;
    }

    @Override
    public String toString() {
        return "RestaurantDish{" +
                "costInCents=" + costInCents +
                ", nameOfDish='" + nameOfDish + '\'' +
                ", wouldRecommend=" + wouldRecommend +
                '}';
    }
}
