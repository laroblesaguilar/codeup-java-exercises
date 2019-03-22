import java.util.Scanner;

public class MethodsExercises {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int factorial(int a) {
        for (int i = a - 1; i >= 1; i--) {
            a = a * i;
        }
        return a;
    }

    public static int dice(int numOfSides) {

        double diceRoll1 = Math.random() * (numOfSides - 1) + 1;
        double diceRoll2 = Math.random() * (numOfSides - 1) + 1;
        System.out.println((int) diceRoll1);
        System.out.println((int) diceRoll2);
        return (addition((int) diceRoll1, (int) diceRoll2));
    }

    public static int getInteger(int min, int max) {
        Scanner scnr = new Scanner(System.in);
        int userNum;
        do{
            System.out.format("Enter a number between %d and %d\n", min, max);
            userNum = scnr.nextInt();
        }while(userNum < min || userNum > max);

        return userNum;
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

//        int userNum1 = scnr.nextInt();
//        int userNum2 = scnr.nextInt();

        String userContinue;
        do {
            System.out.println(factorial(getInteger(1,10)));
            System.out.println("Do you wish to continue?");
            userContinue = scnr.next();
        } while (userContinue.equalsIgnoreCase("yes"));


    }
}
