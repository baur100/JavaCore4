package l11Hw;

public class App {
    public static void main(String[] args) {

    Document id = new Document("id", 12345,"10/10/2020");

    String[] fullName ={"Adam", "Ilkin", "Guliyev"};
    Client adam = new Client(54321, fullName, id, "Corporate");

    adam.printInfo();



    }
}
