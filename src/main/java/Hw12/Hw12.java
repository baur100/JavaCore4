package Hw12;


public class Hw12 {
    public static void main(String[] args) {
//        1. Create a super class and 3 child classes
//        create 2 object of each class (including superclass - don't make it abstract)

        Address annaAddress = new Address("124 Pinetree Street", "Forrest Hill", "SC", 25621);
        Person anna = new Person("Anna", "Stevens", annaAddress, 24);

        Address shawnAddress = new Address("568 Glitter Way", "South Wind", "NC", 75821);
        Person shawn = new Person("Shawn", "Winter", shawnAddress, 36);

        Address eliseAddress = new Address("546 Main ave", "Towny", "MA", 12123);
        Address angelaAddress = new Address("325 Strawberry Court", "Towny", "MA", 12123);
        Address kathrynAddress = new Address("658 Lipton Dr", "Green Hills", "AZ", 49820);
        Address joshAddress = new Address("1269 Amber Road", "Green Hills", "AZ", 49820);

        String[] danceCLass = {"Salsa", "Bachata", "Kizomba"};
        String[] danceClass1 = {"Cha cha cha", "Merengue", "Bachata"};
        String[] danceStyle = {"Merengue", "Bachata", "Salsa"};

        Dancer elise = new Dancer("Elise", "Samuels", eliseAddress, 25, "Bachata", "Thomas");


        Teacher mrsThomas = new Teacher("Angela", "Thomas", angelaAddress, 35, danceCLass, "certified");
        Teacher mrEmerson = new Teacher("Josh", "Emerson", joshAddress, 32, danceClass1, "certified");
        ProfessionalDancer kathryn = new ProfessionalDancer("Kathryn", "Geller", kathrynAddress, 28, "Salsa", "Emerson", danceStyle, "professional");
        elise.printDancer();
        mrsThomas.printTeacher();
        kathryn.printProfessionalDancer();
        mrEmerson.printTeacher();

//        System.out.println(peter.getLastName());
    }
}
