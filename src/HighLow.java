import java.util.Scanner;

public class HighLow {

    public static void game() {
        int randomNumber = (int) Math.floor(Math.random() * 100);
        System.out.println(randomNumber);
        System.out.println();
        Scanner scnr = new Scanner(System.in);
        int userGuess = 0;
        int guessCount = 1;

        do {
            if (guessCount == 1) {
                System.out.println("Guess what number I am thinking of");
                userGuess = scnr.nextInt();
            }
            if (userGuess < randomNumber) {
                System.out.println("HIGHER");
                userGuess = scnr.nextInt();
            } else if (userGuess > randomNumber) {
                System.out.println("LOWER");
                userGuess = scnr.nextInt();
            }
            guessCount++;
        } while (userGuess != randomNumber);
        System.out.println("You got it!");

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userContinue = "yes";
        do{
            game();
            System.out.println("Play again?");
            userContinue = scnr.next();
        }while(userContinue.equals("yes"));
    }
}
