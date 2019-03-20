import java.util.Scanner;
public class HelloWorld {

    public static void mathStuff(int a){

        System.out.println("1. Addition table\n");
        for(int i = 1; i < 11; i++){
            System.out.println(a + "+" + i +  "=" + (a + i));
        }
        System.out.println("2. Substraction table\n");
        for(int j = 0; j < 11; j++){
            System.out.println(a + " - " + j + "    =" + (a - j));
        }
        System.out.println("3. Multiplication Table\n");
        System.out.println("");
        for(int k = 0; k < 11; k++){
            System.out.println(a + " x " + k + "    =" + (a * k));

        }
        System.out.println("4. Division table\n");
        System.out.println("");
        for(int b = 1; b < 11; b++){
            System.out.println(a + " / " + b + "     =" + (a/b));
        }
        System.out.println("5. Remainder table\n");
        System.out.println(" ");
        for(int c = 1; c < 11; c++){
            System.out.println(a + " % " + c + "    =" + (a % c));
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Something: ");
        int userInput = scnr.nextInt();
        System.out.println("You entered " + userInput);
        String[] cars = {"hi", "hello"};
//    for(i = 0; i < cars.length; i++){
//        System.out.println(cars[i]);
//    }
//        char a = 'a';
//        char b = 'b';

//        System.out.println("" + a + b);

//        for(i = 1; i < 51; i++){
//            if(i % 15 == 0){
//                System.out.println("BizzFuzz");
//            } else if(i % 5 == 0){
//                System.out.println("Fuzz");
//            } else if(i % 3 == 0){
//                System.out.println("Bizz");
//            } else{
//                System.out.println(i);
//            }
//        }
//
//        System.out.print("Here is a \\ ");
//        mathStuff(userInput);
        for(int i = 9; i > 0; i--){
            for(int j = 8; j > 0; j--){
//                System.out.print(i);
                System.out.print(j);
            }
        }
    }
}
// String is a class