package oop;

public class BurgerTester {
    public static void main(String[] args) {
        System.out.println(BurgerTools.mostPopularTopping);
        BurgerTools.grill();
        System.out.println(BurgerTools.averageDaysBeforeExpiration);
    }
}
