import java.util.Arrays;

public class Person {
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello from, " + name);
    }

    public Person(String name){
        this.name = name;
    }

    public static Person[] addPerson (Person [] arrayOfPersons, Person addMe){
        Person [] arrayOfPersons2 = Arrays.copyOf(arrayOfPersons, arrayOfPersons.length + 1);
        arrayOfPersons2[arrayOfPersons2.length - 1] = addMe;
        return arrayOfPersons2;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Person test1 = new Person("Luis");
//        System.out.println(test1.name);
        test1.setName("Ariana");
//        System.out.println(test1.name);

        Person test2 = new Person("Ariana");

        System.out.println(test1.getName() == test2.getName());

    }

}
