package shapes;
import util.Input;

public class Circle {

    private double radius;

    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * (Math.pow(radius, 2));
    }

    public double getCircumfrence() {
        return 2 * pi * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void createCircles() {
        Input input = new Input();
        boolean keepGoing;

        do {
            System.out.println("Enter circle radius: ");
            int userCircle = input.getInt();
            Circle c1 = new Circle(userCircle);
            System.out.println(c1.getArea());
            System.out.println(c1.getCircumfrence());
            System.out.println("Continue?");
            keepGoing = input.yesNo();
        } while (keepGoing);
    }

}
