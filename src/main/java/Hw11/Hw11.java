package Hw11;


public class Hw11 {
    public static void main(String[] args) {
//    Create 2 classes
//    Every class should contain at least one field - type of Array
//    And At least one field - Custom Type (so obvious you should create more classes)
//    create 2 objects of each class

//    Address1 address = new Address1("300 Longwood Ave","Boston","MA",02115);


        Address1 nickAddress = new Address1("300 Longwood Ave", "Boston", "MA", 02115, 318);
        String[] services = {"Craneotomy", "Chiari Decompression", "Laminectomy", "Lumbar Puncture"};
        Doctor nick = new Doctor("Nick", "Sturgis", services, "neurosurgeon", nickAddress);

        nick.printInfo();
        System.out.println("______________________________________");
        Address1 meredithAddress = new Address1("300 Longwood Ave", "Boston", "MA", 02115, 310);
        String[] services2 = {"Dermabrasion", "Chemical peels", "Cosmetic injections", "Cryotherapy"};
        Doctor meredith = new Doctor("Meredith", "Gray", services2, "Dermatology", meredithAddress);

        meredith.printInfo();
        System.out.println("______________________________________");
        Address1 michaelAddress = new Address1("300 Longwood Ave", "Boston", "MA", 02115, 312);
        String[] services3 = {"Cataract Surgery", "iLasik Surgery", "Blepharoplasty", "Glaucoma Laser Procedures"};
        Doctor michael = new Doctor("Michael", "Lewis", services3, "ophtalmologist", michaelAddress);

        michael.printInfo();


        System.out.println("______________________________________");


        Recipe borodinskyRecipe = new Recipe("rye flour", "used", "prepare starter, prepare second starter, make the dough, bake", 410, 65);
        String[] ingredients = {"Rye flour", "molasses", "coriander", "malt"};
        Bread borodinsky = new Bread("Borodinsky", ingredients, "dark crusty", borodinskyRecipe);
        borodinsky.printInfo();
        System.out.println("______________________________________");
        Recipe kulichRecipe = new Recipe("white flour", "not used", "prepare leaven, let rise, prepare dough, knead the dough, let rise, bake", 385, 45);
        String[] ingredients1 = {"White flour", "eggs", "butter", "sugar"};
        Bread kulich = new Bread("Kulich", ingredients1, "soft", kulichRecipe);
        kulich.printInfo();
        System.out.println("______________________________________");
    }
}
