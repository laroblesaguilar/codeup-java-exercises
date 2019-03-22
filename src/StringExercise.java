public class StringExercise {
    public static void main(String[] args) {

        String one = "We dont need no education";
        System.out.println(one.replace("education", "thought control"));
        System.out.println("I can do backslackes \\  double backslashes \\ \\ \n and the amazing triple backslash \\\\\\");
        System.out.println("Check \"this\" out!, \"s inside of \" s!");
        System.out.println("In windows, the main drive us usually C:\\");

        System.out.println("This is a test".charAt(5));

        String message = "How are you?";
        System.out.println(message.endsWith("?"));

        int test = 5;
        String five = Integer.toString(test);
        System.out.println(five);

        String two = "2";
        int dos = Integer.valueOf(two);
        System.out.println(dos);

        int start = 1;
        int end = 3;
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum+= i;
        }
        System.out.println(sum);


    }
}
