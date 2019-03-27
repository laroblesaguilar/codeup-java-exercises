package shapes;
import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

//        double userRadius = scnr.nextDouble();
//        Circle userCircle = new Circle(userRadius);
//        System.out.println(userCircle.getArea());
//        System.out.println(userCircle.getCircumfrence())

        Circle createCircles = new Circle(0);
        createCircles.createCircles();

    }


}
