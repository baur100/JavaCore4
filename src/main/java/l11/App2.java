package l11;

public class App2 {
    public static void main(String[] args) {

        Address home = new Address("112 Holly st", "Bronx", "NY", 10112);
        String name = new String("Ted");
        String lastName = new String("Simmons");
        String subj = "Math";

        Teacher teddySimmons = new Teacher(name,lastName,subj,home);

        teddySimmons.printInfo();
    }
}
