import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String user = scnr.nextLine();
        do {
            if (user.endsWith("?")) {
                System.out.println("sure");
            } else if (user.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (user.length() == 0) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }
            user = scnr.nextLine();
        }while(! user.equalsIgnoreCase("Exit"));

        int x = 5 * 4 % 3;


    }
}
