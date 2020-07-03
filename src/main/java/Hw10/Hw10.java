package Hw10;

import l10.Pet;

public class Hw10 {
    public static void main(String[] args) {

//        1. Create 4 classes with fields (at least 3 fields) and methods (at least 1 method)
//        each class has at least 2 constructors (default and full)
//        create printClass()/ printInfo() method to print out all fields
//        fields are private
//        each field has getter and setter
//        2. In the App class create main() and create 2 instances of each class;
//        one instance created used default constructor - fill up fields using setter
//        second object created using full constructor
//        print object info using print-out method

        Accountant heidi = new Accountant("Heidi Kline", "Accounting assistant", 2);


//        heidi.name = "Heidi Kline";
//        heidi.position = "Accounting assistant";
//        heidi.experience = 2;

        Accountant sandi = new Accountant("Sandi Smith", "Controller", 15);
//        sandi.name = "Sandi Smith";
//        sandi.position = "Controller";
//        sandi.experience = 15;

        Accountant mary = new Accountant();

        mary.setName("Mary Peters");
        mary.setPosition("Loan accountant");
        mary.setExp(10);

        System.out.println(heidi.getName());
        System.out.println(heidi.getPosition());
        System.out.println(heidi.getExp());

        System.out.println(sandi.getName());
        System.out.println(sandi.getPosition());
        System.out.println(sandi.getExp());


//        System.out.println(mary.getName());
//        System.out.println(mary.getPosition());
//        System.out.println(mary.getExp());


        mary.printInfo();

        System.out.println("_________________________");


        Pizza neapolitan = new Pizza("Neapolitan", "thin", "tomatoes, olive oil, mozarella", "Chianti");
        Pizza chicago = new Pizza("Chicago", "thin medium", "assembled upside-down", "Zinfandel");
        Pizza greek = new Pizza("Greek", "thick and chewy", "black olives, feta cheese, tomatoes", "Chardonnay");


        neapolitan.printOut();
        chicago.printOut();
        greek.printOut();

        Pizza california = new Pizza();
        california.setName("California");
        california.setCrust("thin and crispy");
        california.setTopping("Chicken, artichokes, salmon, feta");
        california.setDrink("whiskey-based cocktail");

        california.printOut();

        System.out.println("_________________________");

        Singer sting = new Singer("Sting", "Rock", "Shape of my heart");
        Singer patriciaKaas = new Singer("Patricia Kaas", "Blues", "Mademoiselle chantle bluese");
        Singer andreaBocelli = new Singer ();

        andreaBocelli.setName("Andrea Bocelli");
        andreaBocelli.setGenre("Opera");
        andreaBocelli.setBestSong("The Prayer");

        sting.printOut();
        patriciaKaas.printOut();
        andreaBocelli.printOut();

        System.out.println("_________________________");


        Cookie samoas = new Cookie ("Samoas", "vanilla, coconut, chocolate coating", "tender", 450);
        Cookie trefoils = new Cookie ("Trefoils", "sugar, butter", "buttery", 580);
        Cookie dulcheDeLeuche = new Cookie();

        dulcheDeLeuche.setName("Dulche De Leuche");
        dulcheDeLeuche.setIngredients("milk caramel chips");
        dulcheDeLeuche.setTaste("chewy");
        dulcheDeLeuche.setCallories(650);

       samoas.printOut();
       trefoils.printOut();
       dulcheDeLeuche.printOut();

        System.out.println("_________________________");
    }
}
