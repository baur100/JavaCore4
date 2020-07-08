package hw12Inheritance;

public class App12 {
    public static void main(String[] args) {
        Address address = new Address ("1209 Sofico St", "New York", "NY", 48032);
        String [] products = {"Chocolate", "Candy", "Soda"};
        String [] manPerfumList = {"Dior", "Gucci", "Chanel"};
        String [] womanPerfumeList = {"Nina Ricci", "Prada", "YSL"};


        Grocery grocery = new Grocery("Tamara", 392000, address, "Sofia", products);
        ManPerfume manPerfume = new ManPerfume("Tamara", 392000, address, "Cody", manPerfumList);
        WomanPerfume womanPerfume = new WomanPerfume("Tamara",392000, address, "Peter", womanPerfumeList);

        manPerfume.printManPerfums();
        womanPerfume.printWomanPerfumes();
        grocery.printGrocery();

    }

}



//   1. Create a super class and 3 child classes
//create 2 object of each class (including superclass - don't make it abstract)

