package grades;

import java.util.*;

public class Student {

    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage(){
        double total = 0;
         for(Integer grade : grades){
             total += grade;
         }

         return total / grades.size();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student " +
                "name='" + name + '\'' +
                ", grade=" + getGradeAverage();
    }
}
