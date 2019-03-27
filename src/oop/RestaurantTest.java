package oop;

public class RestaurantTest {

    public static void main(String[] args) {
        RestaurantDish d1 = new RestaurantDish(500, "Nuggets", true);

        d1.setNewName("Chicken Nuggets");
        System.out.println(d1.getDishName());

    }
}
