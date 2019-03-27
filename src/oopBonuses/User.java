package oopBonuses;

public class User {

    private String name;
    private int age;
    private String userName;
    private String email;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public String getUserName(){
        return userName;
    }

    public User(String name, int age, String userName, String email) {
        this.name = name;
        this.age = age;
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
