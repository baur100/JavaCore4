package HW10June29;

public class ClassPetShopHW10Jun29 {
    public static void main(String[] args) {


        //Non-parameterized Constructors
        PetLovers pl1 = new PetLovers();
        PetsForSale pfs1 = new PetsForSale();
        PetDiet pd1 = new PetDiet();
        PetAccessories pa1 = new PetAccessories();
        pl1.setFirstName("Peter");
        pl1.setLastName("Paul");
        pl1.setPetRequired("Calf");
        pl1.setPetCostBudget(3500);
        pl1.printDetails();

        //String firstName, String lastName, String petRequired, double petCostBudget
        PetLovers pl2 = new PetLovers("Ben", "Scherman", "Dog", 90.39);
        pl2.printInfo();
        //String petType, String petName, int petAge, double petWeight, double petPrice
        PetsForSale pfs2 = new PetsForSale("Dog", "Bonny", 3, 5.4, 1500.99);
        pfs2.printInfo();
        //double petFoodPrice, double petDrinkPrice, double petSnackPrice, double petCandyPrice, double petChewPrice
        PetDiet pd2 = new PetDiet(23.54, 32.4, 65.4, 12.23, 23.90);
        pd2.setPetFood("Pedigree");
        pd2.setPetDrink("Carrot Juice for Dog");
        pd2.setPetSnack("Dog Snack");
        pd2.setPetCandy("Dog Candy");
        pd2.setPetChew("Dog Chew");
        pd2.printInfo();
        //String petHouse, double petHousePrice, String petMattress, double petMattressPrice, String petToys, double petToysPrice, String petDress, double petDressPrice
        PetAccessories pa2 = new PetAccessories("Dog House", 190.49, "SoftPetMattress", 89.90, "ToyForDogs", 10.90, "DogDress", 2.99);
        pa2.printInfo();

        //String firstName, String lastName
        PetLovers pl3 = new PetLovers("Peter", "Paul");
        System.out.println("\nPet lover name:\t"+pl3.getFirstName()+" "+pl3.getLastName());
        //String petType, String petName, double petPrice
        PetsForSale pfs3 = new PetsForSale("Parrot", "Shilly", 590.89);
        //String petFood, String petDrink, String petSnack, String petCandy, String petChew
        System.out.println("\nA "+pfs3.getPetType()+" named "+pfs3.getPetName()+" costs $"+pfs3.getPetPrice());
        PetDiet pd3 = new PetDiet(54.64,43.7,62.43,89.87,94.3);
        //String petHouse, String petMattress, String petToys, String petDress
        PetAccessories pa3 = new PetAccessories("Birds House", "Soft Circular Cage Mattress", "Cage Swings", "Colored Feathers");
        System.out.println("\nThe lists of pet accessories are:\n "+pa3.getPetHouse()+"\n "+pa3.getPetMattress()+"\n "+pa3.getPetToys()+"\n "+pa3.getPetDress());
        pa3.setPetHouse("Cat House");
        pa3.setPetMattress("Cat Mattress");
        pa3.setPetToys("Bony Chew");
        pa3.setPetDress("Cat Dress");
        System.out.println("\nThe lists of pet accessories are:\n "+pa3.getPetHouse()+"\n "+pa3.getPetMattress()+"\n "+pa3.getPetToys()+"\n "+pa3.getPetDress());

    }
}
