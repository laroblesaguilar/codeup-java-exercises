package oopBonuses;

public class UserTest {

    public static void main(String[] args) {
        User newUser = new User("Luis",25,"laroblesaguilar", "laroblesaguilar");
        User newUser2 = new User("Robles", 25, "test", "hiii");

        System.out.println(newUser.toString());

        System.out.println(newUser.getUserName());
        System.out.println(newUser2.getUserName());

        newUser2.setName("Changed it");

        System.out.println(newUser2.getName());

        newUser2.getEmail();

    }


}
