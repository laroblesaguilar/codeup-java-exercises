import java.sql.SQLOutput;
import java.util.Scanner;
public class ControlFlowExercises {

    public static int add(int a, int b){
        int c = a + b;
        return c;
    }


    public static void main(String[] args) {
//        Scanner scnr = new Scanner(System.in);
//        int j = 5;
//        while(j <= 15){
//            System.out.print(j + " ");
//            j++;
//        }
//        System.out.println();
//        for(int b = 1; b < 100; b++){
//            if(b % 15 == 0){
//                System.out.println("Fizzbuzz");
//            } else if(b % 5 == 0){
//                System.out.println("Buzz");
//            } else if( b % 3 == 0){
//                System.out.println("Fizz");
//            } else{
//                System.out.println(b);
//            }
//        }
//        System.out.println("Enter number grade");
//        int grade = scnr.nextInt();
//        if(grade < 60){
//            System.out.println("F");
//        }else if(grade < 67){
//            System.out.println("D");
//        } else if(grade < 80){
//            System.out.println("C");
//        } else if(grade < 88){
//            System.out.println("B");
//        } else if(grade <=98){
//            System.out.println("A");
//        } else{
//            System.out.println("A+");
//        }

//        System.out.println("Enter something");
//
//        String userString = scnr.next();
//        if(userString.equals("hi")){
//            System.out.println("Winner");
//        }

//        int a = 1;
//        while(a < 17){
//            System.out.println((int)Math.pow(2,a));
//            a*=2;
//        }
//        for(int c = 1; c < 17; c*=2){
//            System.out.println((int) Math.pow(2,c));
//        }
//        System.out.format("What number would you like to go up to?");
//        int userMax = scnr.nextInt();
//        System.out.println("number | squared | cubed \n ------| ------  | -----");
//        System.out.flush();
//        for(int i = 1; i <= userMax; i++ ){
//            System.out.println(i+"      |" + (int)Math.pow(i,2)+"        |" + (int) Math.pow(i,3));
//        }
//        System.out.println();
//        for(int d = 0; d < 30; d++){
//            if(d % 2 == 1){
//                continue;
//            }
//            System.out.println(d);
//        }
//        boolean boo = true;
//        boolean lean = false;

        System.out.println(add(5,3));

        String test = "Hello, my name is Luis";
        System.out.println(test.toLowerCase());
        System.out.println(test.replace("Hello", "Goodbye"));

    }
}

