package grades;

import util.Input;

import java.util.*;

public class GradesApplication {

    public static void main(String[] args) {
        Input scnr = new Input();
        Map<String, Student> students = new HashMap<>();

        Student luis = new Student("Luis");
        Student s1 = new Student("Leo");
        Student s2 = new Student("Luca");
        Student s3 = new Student("Luna");

        luis.addGrade(98);
        s1.addGrade(92);
        s2.addGrade(93);
        s3.addGrade(90);
        s1.addGrade(80);


        students.put("laroblesaguilar", luis);
        students.put("user1", s1);
        students.put("user2", s2);
        students.put("user3", s3);


        do {
            System.out.println("Welcome! \n\nHere are the github usernames of our students: \n");

            for (String key : students.keySet()) {
                System.out.print("|" + key + "|");
            }

            System.out.println("\n");
            System.out.println("What Student would you like to see more information on?");

            String userStudent = scnr.getString();
            for (String key : students.keySet()) {
                if (userStudent.equals(key)) {
                    System.out.println("Name: " + students.get(key).getName() + " - Username: " + key + "\nCurrent Average: " + students.get(key).getGradeAverage() +
                            " - All grades: ");
                    for (Integer x : students.get(key).getGrades()) {
                        System.out.print(x + ", ");
                    }
                } else{
                    scnr.getLine();
                    System.out.println("Sorry, no student exists with that name!");
                    continue;
                }
            }
            System.out.println("\n");
            System.out.println("Would you like to see another student?");
        } while (scnr.yesNo());

    }
}
