package movies;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Movie {

    private String name;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        category = category;
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    static boolean arrayEqualizer(int[] x, int[] y) {
        boolean test = true;
        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i]) {
                test = false;
            } else {
                test = true;
            }
        }
        return test;
    }

    static int indexOf(String[] test, String searchFor){
        for(int i  = 0; i < test.length; i++){
            if(test[i].equals(searchFor)){
                return i;
            }
        }
        return -1;
    }

    static boolean indexOfBoolean(String[] test, String searchFor){
        for(int i  = 0; i < test.length; i++){
            if(test[i].equals(searchFor)){
                return true;
            }
        }
        return false;
    }

    public static Movie[] addPerson(Movie[] arrayOfPersons, Movie addMe) {
        Movie[] arrayOfPersons2 = Arrays.copyOf(arrayOfPersons, arrayOfPersons.length + 1);
        arrayOfPersons2[arrayOfPersons2.length - 1] = addMe;
        return arrayOfPersons2;
    }

    static boolean searchFor(String [] test, String searchFor){
        for(int i = 0; i < test.length; i++){
            if(test[i].equals(searchFor)){
                return true;
            }
        }
        return false;
    }

    static boolean isPalindrome(String test){
        String concatonateHere = "";
        for(int i = test.length() -1; i >= 0; i--){
            concatonateHere += test.charAt(i);
        }
        return concatonateHere.equalsIgnoreCase(test);
    }

    static boolean compareArrays(int [] num1, int[] num2){
        for(int i = 0; i < num1.length; i++) {
            if (num1[i] != num2[i]) {
                return false;
            }
        }
        return true;
    }



//    static int [] bubbleSort(int [] numbers){
//        for(int i = 0; i < numbers.length; i++){
//            int largestValue = 0;
//            for(int j = 0; j < numbers.length -1; j++){
//                if(numbers[j] > numbers[j+1]){
//                    largestValue = numbers[j];
//                    numbers[j] = numbers[j+1];
//                    numbers[j+1] = largestValue;
//                }
//            }
//        }
//        return numbers;
//    }

    static String reverseString(String string){
        String addHere = "";
        String arr [] = string.split(" ");
        for(int i = arr.length - 1; i >= 0; i--){
            addHere += arr[i] + " ";
        }
        return addHere;
    }

    static String[] reverseArray(String [] arr){
     String [] reversed = new String [arr.length];
     int i = arr.length -1;
     int j = 0;

     while(i >= 0){
         reversed[j] = arr[i];
         j++;
         i--;
     }

     return reversed;

    }


    static int[] countdown(int[] num){
        int j = 0;
      int [] reversed = new int [num.length];
      for(int i = num.length -1; i >= 0; i--){
          reversed[j] = num [i];
          j++;
      }
        return reversed;
    }


    static int [] sortIntArray(int [] num){
        for(int i = 0; i < num.length; i++){
            int greaterThan = 0;
            for(int j = 0; j < num.length -1; j++){
                if (num[j] > num[j +1 ]) {
                    greaterThan = num[j];
                    num[j] = num[j+1];
                    num[j+1] = greaterThan;
                }
            }
        }
        return num;
    }




    public static void main(String[] args) {

        int [] x = {4,5,6,1,8,2,3,7};

//        for(int i = 0; i < x.length; i++){
//            int greatestValue = 0;
//            for(int j = 0; j < x.length -1;j++){
//                if(x[j] > x[j+1]){
//                    greatestValue = x[j];
//                    x[j] = x[j+1];
//                    x[j+1] = greatestValue;
//                }
//            }
//        }

        for(int c : sortIntArray(x)){
            System.out.println(c);
        }


        int [] a = {1,2,3,4,5,6};

        for(int b : countdown(a)){
            System.out.println(b);
        }



//        for(Integer num : x){
//            System.out.println(num);
//        }
//
//        System.out.println(reverseString("I love watching movies"));
//
//        String example = "I love watching movies";
//
//        String[] copyHere = new String[5];
//        copyHere = example.split(" ");
//
//        String test = "";
//
//        for(int i = copyHere.length -1; i >=0; i--){
//            if(i > 0){
//                test += copyHere[i] + " ";
//            } else if(i == 0)
//                test += copyHere[i];
//        }
//
//        System.out.println(test);
//
        String [] test1 = {"this", "is", "a", "test"};

        String [] reversed = reverseArray(test1);

        for(String s : reversed){
            System.out.println(s);
        }

















//        for(int i = 0; i < x.length;i++){
//            int largestValue = 0;
//            for(int j = 0; j < x.length - 1; j++){
//                if(x[j] > x[j+1]){
//                    largestValue = x[j];
//                    x[j] = x[j+1];
//                    x[j + 1] = largestValue;
//                }
//            }
//        }

//        bubbleSort(x);
//
//        for(Integer num : x){
//            System.out.println(num);
//        }


























//        for(int i = 0; i < x.length;i++){
//            int largerValue = 0;
//            for(int j = 0; j < x.length -1; j++){
//                if(x[j] >  x [j + 1]){
//                    largerValue = x[j];
//                    x[j] = x[j +1];
//                    x[j+1] = largerValue;
//                }
//            }
//        }
//
//        for(int num : x){
//            System.out.println(num);
//        }

//        int [] a = {1,2,3};
//        int [] b = {1,2,3};
//        int sum = 0;
//        for(int i = 0; i < a.length; i++){
//            sum += a[i];
//            sum += b[i];
//        }
//        int average = sum / (a.length + b.length);
//        System.out.println(average);
//        int [] num = {7,4,2,3,1,5};

//        for(int i = 0; i < num.length;i++){
//            int temp = 0;
//            for(int j = 1; j < num.length -i;j++){
//                if (num[j] > num[j - 1]) {
//                    temp = num[i];
//                    num[i] = num[j +1];
//                    num[j+1] = temp;
//                }
//            }
//        }
//        for(int i = 0; i < num.length; i++){
//            System.out.println(num[i]);
//        }

//                int [] x = {3,4,67,69,98,50,40,30,20,1};


//        boolean swapped = true;
//        while (swapped) {
//            swapped = false;
//            for(int i=1; i<x.length; i++) {
//                int temp=0;
//                if(x[i-1] > x[i]) {
//                    temp = x[i-1];
//                    x[i-1] = x[i];
//                    x[i] = temp;
//                    swapped = true;
//                }
//            }
//        }
//
//                for (int i = 0; i < x.length; i++) {
//            System.out.println(x[i]);
//        }

//        int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
//        int temp;
//        for (int i = 1; i < array.length; i++) {
//            for (int j = i; j > 0; j--) {
//                if (array[j] < array [j - 1]) {
//                    temp = array[j];
//                    array[j] = array[j - 1];
//                    array[j - 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

//
//        int n = numArray.length;
//        int temp = 0;

//        int [] n = {3,4,67,69,98,50,40,30,20,1};
//
//        for (int i = 0; i < n.length; i++) {
//            int temp1 = 0;
//            for (int j = 0; j <n.length -1; j++) {
//
//                if (n[i] > n[j + 1]) {
//                    temp1 = n[j + 1];
//                    n[j + 1] = n[i];
//                    n[i] = temp1;
//                }
//
//            }
//        }
//
//        for(int i = 0; i < n.length; i++){
//            System.out.println(n[i]);
//        }


//      String test = null;
//      System.out.println(test.toString());

//        int[] x = {1, 2, 3, 4, 5, 6, 7};
//        int[] y = {1, 2, 4};

 //        System.out.println(arrayEqualizer(x, y));
//        int sum = 0;
//        for(int num : x){
//            sum += num;
//        }

//        System.out.println(sum/ x.length);
//        System.out.println(x[x.length/ 2]);
//
//        y[1] = 4;
//        System.out.println(Arrays.toString(y));
//
//        boolean[] test = {true, true, false, false, true};
//
//        for(int i = 0; i < test.length; i++){
//            if(test[i] == false){
//                test[i] = true;
//            }
//        }


//        String [] names = {"luis", "ariana", "leo"};


//        System.out.println(Arrays.toString(test));
//
//
//        String hi = "test";
//
//
//        for(int i = 0; i < names.length; i++){
//            names[i] = names[i].substring(0,1).toUpperCase() + names[i].substring(1);
//        }
//
//        System.out.println(Arrays.toString(names));
//
//        int [] test2 = {2,7,4,1,0};
//
//        Arrays.sort(test2);
//
//        System.out.println(Arrays.toString(test2));
//
//        Movie[] movies = new  Movie [5];
//
//        movies[0] = new Movie("test", "drama");
//        movies[1] = new Movie("test", "drama");
//        movies[2] = new Movie("test3", "comedy");
//        movies[3] = new Movie("test4", "thriller");
//        movies[4] = new Movie("test5", "animated");
//
//        for(Movie movie : movies){
//            if(movie.getCategory().equals("animated")){
//                System.out.println(movie.getName());
//            }
//        }
//
//        int[] test1 = {1,2,3,5,6};
//        int[] test3 = {1,2,3,4,5};
//
//        String [] a = {"hi", "hello", "hi"};
//        String [] b = {"hi", "h", "hi"};
//
//
//
//        for(int i = 0; i < test1.length; i++){
//            if(test1[i] == test3[i]){
//                System.out.println(true);
//            }
//        }
//
//        for(int i = 0; i < b.length; i++){
//            if(a[i].equals(b[i])){
//                System.out.println(a[i]);
//            }
//        }
//
//        for (String s : a) {
//            for (int j = 0; j < s.length(); j++) {
//                System.out.println(s.charAt(j));
//            }
//        }

//        String[] testEx = {"this", "is", "a", "test"};
//
//        for(int i = 0; i < testEx.length; i++){
//            if(testEx[i].equals("a")){
//                System.out.println(i);
//            }
//        }
//        String example = "hi hello";

//        System.out.println(example.indexOf("poop"));

//        System.out.println(indexOf(testEx, "no"));
//        System.out.println(indexOfBoolean(testEx, "this"));
//
//        String ex = "test";
//
//
//
//        String name = "luis robles";
//
//        name = name.substring(0,1).toUpperCase() +  name.substring(1, name.indexOf(" ")) +
//                name.substring(name.indexOf(" "), name.indexOf(" ") + 2).toUpperCase() + name.substring(name.indexOf(" ") + 2);
//
//        System.out.println(name);
//        System.out.println(name.length());

//        String p = "bob";
//
//        String q = "";
//        for(int i = p.length() -1; i >= 0;i--){
//            q += p.charAt(i);
//        }

//        System.out.println(p.equals(q));

//        String[] ex2 = {"hi", "hello"};

//        System.out.println(searchFor(ex2, "hi"));

//        System.out.println(isPalindrome("luis"));

//        int[] sortThis = {1,3,2,4,7,6};

//        System.out.println(sort(sortThis));
//
//        int[] num1 = {5,2,3,4};
//        int[] num2 = {1,2,3,4};
//        System.out.println(compareArrays(num1, num2));
//
//        List<Movie> movies1 = new ArrayList<>();
//        movies1.add(new Movie("test", "drama"));
//        movies1.add(new Movie("test2", "comedy"));
//
//        for(Movie movie : movies1){
//            System.out.println(movie.getName());
//        }
//
//        System.out.println(ex.charAt(1));
//
//        System.out.println(ex.indexOf("t"));
//




    }
}
