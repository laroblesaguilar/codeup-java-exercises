import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);
        System.out.println("Enter 3 words");
        String userWord = scnr.next();
        String userWord2 = scnr.next();
        String userWord3 = scnr.next();
        System.out.println(userWord + " " +  userWord2 + " " + userWord3);
        System.out.println("Enter width and length of classroom");
        int length = scnr.nextInt();
        int width = scnr.nextInt();
        int perimeter = (2* width) + (2*length);
        System.out.println(perimeter);
    }
}
