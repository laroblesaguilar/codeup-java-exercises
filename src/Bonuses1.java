import java.util.Scanner;

public class Bonuses1 {
    public static double calculator(double a, String operator, double b){
        Scanner scnr = new Scanner (System.in);
            if (operator.equals("+")) {
                return a + b;
            } else if (operator.equals("-")) {
                return a - b;
            } else if (operator.equals("/")) {
                return a / b;
            } else {
                return a * b;
            }

    }

    public static int vowelCounter(String userString){
        userString.toLowerCase();
        int vowelCount = 0;
        for(int i = 0; i < userString.length(); i++){
            if(userString.charAt(i) == ('a') || userString.charAt(i) == ('e') || userString.charAt(i) == ('i') || userString.charAt(i) == ('o') || userString.charAt(i) == ('u') ){
                vowelCount++;
            }
        }
        return vowelCount;
    }

//    public static String dateConverter()

    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        String userResponse = "yes";

        while(userResponse.equals("yes")){
            System.out.println("Do you want to enter a calculation?");
            userResponse = scnr.next();
            if(userResponse.equals("no")){
                System.out.println("Goodbye");
                break;
            }
            System.out.println("Enter calculation to be preformed:");
            double userNum1 = scnr.nextDouble();
            String operator = scnr.next();
            double userNum2 = scnr.nextDouble();
            System.out.println(calculator(userNum1, operator, userNum2));
        }

//        System.out.println("Enter a sentence and I'll tell you the amount of vowels it has: ");
//        String countVowels = scnr.nextLine();
//        System.out.format("%s has %d vowels", countVowels, vowelCounter(countVowels));

    }
}
