package oopBonuses;

public class Dog extends Animal {

    private String breed;

    public Dog(String species, boolean walksOnfour ,String breed){
        super(species, walksOnfour);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void growl(){
        System.out.println("Ruff");
    }

    @Override
    void test() {
        System.out.println("hello");;
    }


    void test2(){
        System.out.println("this is a test");
    }

    public static void main(String[] args) {
        Animal test = new Dog("Canine",true,"lab");
        test.test();
    }
}
