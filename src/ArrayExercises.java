import java.util.Arrays;

public class ArrayExercises {

    public static void main(String[] args) {
        String [] strings = new String [5];

        String [] strings2 = {"Hi","Hello", "Hola"};

        int [] numbers = new int [6];

        boolean [] yesNo = new boolean [3];

//        System.out.println(numbers);

        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;
        numbers[5] = 5;

        yesNo[0] = true;
        yesNo[1] = false;
        yesNo[2] = true;

        strings[0] = "Test";
        strings[1] = "Still a test";
        strings[2] = "testing";
        strings[3] = "test in progress";
        strings[4] = "final test";



//        for(int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
//
//        for(boolean value : yesNo){
//            System.out.println(value);
//        }
//
//        for(String string : strings2){
//            System.out.println(string);
//        }
//
//        for(String x : strings){
//            System.out.println(x);
//        }

//        String[] months = {"January","February", "March", "April", "May", "June", "July"};
//        String [] months2;
//
//        System.out.println(Arrays.toString(months));
//        Arrays.sort(months);
//        System.out.println(Arrays.toString(months));
//        months2 = Arrays.copyOf(months,3);
//        System.out.println(Arrays.toString(months2));

        Person p1 = new Person("Luis");
        Person p2 = new Person("Ariana");
        Person p3 = new Person("Leo");

        Person [] arrayOfPerson = {p1, p2, p3};

        for(Person people : arrayOfPerson){
            System.out.println(people.getName());
        }
        Person p4 = new Person("Luca");
        Person p5 = new Person("Luna");

        System.out.println(Arrays.toString(Person.addPerson(arrayOfPerson, p5)));







//        System.out.println(Arrays.toString(strings));
//
//        System.out.println(Arrays.toString(yesNo));
    }
}
