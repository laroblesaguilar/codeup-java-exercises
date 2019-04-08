package util;
import java.util.*;


class InputException extends Exception {}

public class InputTest {
    public static void main(String[] args) {

//        Scanner scnr = new Scanner(System.in);


        System.out.println("Enter number");
        Input scnr = new Input();
        System.out.println(scnr.getDouble());




//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch (ArithmeticException e) {
//            System.out.println("Math still works!");
//        }

//        int[] numbers = {1, 2, 3};
//        int x;
//
//        try {
//            x = numbers[100];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Caught an array index exception!");
//        } catch (Exception e) {
//            System.out.println("Caught a generic exception!");
//        } finally {
//            System.out.println("This will always run.");
//        }

        int[] numbers = {1, 2, 3};
        int i = -1;
//
//        try{
//            System.out.println(numbers[4]);
//        }catch(Exception e){
//            System.out.println("There was an exception");
//        }
//        System.out.println("Made it to the end...");
//        try {
//            if(i > numbers.length - 1 || i < 0){
//                throw new Exception("My exception");
//            }
//            System.out.println(numbers[i]);
//            System.out.println("number is: " + numbers[i]);
//        } catch (java.util.InputMismatchException e) {
//            System.out.println("Not the exception I am looking for...");
//            System.out.println(e);
//        } catch (Exception e) {
//            System.out.println("The exception I am looking for....");
//            System.out.println(e);
//        } finally {
//            System.out.println("Made it to the end..HA!");
//        }


    }
}
