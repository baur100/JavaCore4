package Homework10;

public class App {
    public static void main(String[] args) {

        Laptops samsung = new Laptops("Samsung", "Flex", "Black");
        samsung.printInfo();
        samsung.setBrand("LG");
        samsung.setModel("Gram");
        samsung.setColor("Blue");
        System.out.println(samsung.getBrand()+" "+samsung.getModel()+" "+samsung.getColor());

        System.out.println("************************");

        Laptops macbook = new Laptops("Apple", "Macbook Pro", "Silver");
        macbook.printInfo();
        macbook.setBrand("HP");
        macbook.setModel("Spectre");
        macbook.setColor("White");
        System.out.println(macbook.getBrand()+" "+macbook.getModel()+" "+macbook.getColor());

        System.out.println("************************");

        Candy gum = new Candy("Gum", "Apple", 10);
        gum.printCandyInfo();
        gum.setType("Mint");
        gum.setFlavor("Orange");
        gum.setCalories(15);
        System.out.println(gum.getType()+" "+gum.getFlavor()+" "+gum.getCalories());

        System.out.println("************************");

        Candy jelly = new Candy("Gummy", "Strawberry", 5);
        jelly.printCandyInfo();
        jelly.setType("Hard Candy");
        jelly.setFlavor("Cherry");
        jelly.setCalories(20);
        System.out.println(jelly.getType()+" "+jelly.getFlavor()+" "+jelly.getCalories());

        System.out.println("************************");

        Game valorant = new Game("Valorant", "Riot", "FPS");
        valorant.printGameInfo();
        valorant.setName("Modern Warfare");
        valorant.setCompany("Infinity Ward");
        valorant.setGenre("FPS");
        System.out.println(valorant.getName()+" "+valorant.getCompany()+" "+valorant.getGenre());

        System.out.println("************************");

        Game minecraft = new Game("Minecraft", "Mojang Studios", "Sandbox");
        minecraft.printGameInfo();
        minecraft.setName("Final Fantasy");
        minecraft.setCompany("Square Enix");
        minecraft.setGenre("RPG");
        System.out.println(minecraft.getName()+" "+minecraft.getCompany()+" "+minecraft.getGenre());

        System.out.println("************************");

        Restaurants mastros = new Restaurants("Steak", "Malibu", 5);
        mastros.printRestaurantInfo();
        mastros.setSpecialty("Seafood");
        mastros.setLocation("Beverly Hills");
        mastros.setRating(4);
        System.out.println(mastros.getSpecialty()+" "+mastros.getLocation()+" "+mastros.getRating());

        System.out.println("************************");

        Restaurants bestia = new Restaurants("Pasta", "Los Angeles", 5);
        bestia.printRestaurantInfo();
        bestia.setSpecialty("Italian");
        bestia.setLocation("Downtown");
        bestia.setRating(3);
        System.out.println(bestia.getSpecialty()+" "+bestia.getLocation()+" "+bestia.getRating());
    }
}
