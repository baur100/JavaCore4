//        1. Create a super class and 3 child classes
//        create 2 object of each class (including superclass - don't make it abstract)


        package HM12;

public class App {
        public static void main(String[] args) {
                Lexus lexus = new Lexus("Lexus","LX570",true,"Red","White");
                Toyota toyota = new Toyota("Toyota","Camry",true,"White","Black");
                Ford ford = new Ford("Ford","Focus",false,"Blue","Black");
        lexus.printLexus();
                System.out.println("************************************************");
        toyota.printToyota();
                System.out.println("************************************************");
        ford.printFord();
        }

}
