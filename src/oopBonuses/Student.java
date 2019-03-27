package oopBonuses;

public class Student {

    public static String goesTo = "Codeup";

    private String name;
    private int age;
    private String dob;

    public Student(String name, int age, String dob){
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setDob(String dob){
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' +
                '}';
    }
}
