package movies;

public class B extends A {

    String nickname;

    @Override
    void saySomething() {
        super.saySomething();
        System.out.println("from B");
    }

    public B(String name, String nickname) {
        super(name);
        this.nickname = nickname;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public static void main(String[] args) {
        System.out.println(new B("luis", "test").getName());

      new A("luis").saySomething();

      A a = new B("luis", "luisan");
    }
}
