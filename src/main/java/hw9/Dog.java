package hw9;

public class Dog {
    public String nickname;
    public String breed;
    public String owner;
    public int age;

    public void hi (String dogInfo) {
        System.out.println("This is " + dogInfo);
        System.out.println("(S)he is " + breed);
        System.out.println("The owner's name is " + owner);
        System.out.println("(S)he is " + age + " year(s) old");


    }
}
