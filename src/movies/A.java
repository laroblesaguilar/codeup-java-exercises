package movies;

public class A {

    String name;

    void saySomething(){
        System.out.println("from A");
    }

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
