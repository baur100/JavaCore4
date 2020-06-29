package HW8;

public class app {
    public static void main(String[] args){
    Food pizza = new Food();
    pizza.FoodName ="pizza";
    pizza.calories = 300;
    pizza.NutritionFacts();;

    Food apple = new Food();
    apple.FoodName= "apple";
    apple.calories = 60;
    apple.NutritionFacts();

    System.out.println("************************");

    Job QaEng = new Job();
    QaEng.JobName = "QA Engineer";
    QaEng.HourlyRate = 35.50;
    QaEng.JobDescription(true);

    Job Cashier = new Job();
    Cashier.JobName = "Cashier";
    Cashier.HourlyRate = 14.50;
    Cashier.JobDescription(false);

    System.out.println("************************");

    Pet dog = new Pet();
    dog.PetName = "Damian";
    dog.PetAge = 3;
    dog.PetProfile("dog");

    Pet cat = new Pet();
    cat.PetName = "kitty";
    cat.PetAge = 4;
    cat.PetProfile("cat");

    System.out.println("************************");

    Smartphone iphone = new Smartphone();
    iphone.ram = 1;
    iphone.storage = 64;
    iphone.DeviceSpecs("iphone 11 ");

    Smartphone samsung = new Smartphone();
    samsung.ram = 4;
    samsung.storage = 128;
    samsung.DeviceSpecs("Samsung Galaxy 10 ");


    }
}
