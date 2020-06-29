package l9Hw;


public class App {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        myLaptop.brand = "Asus";
        myLaptop.type = "Vivobook";
        myLaptop.processor = "Intel Core i5";
        myLaptop.ramSize = 4;
        myLaptop.hardDiskSizeGB = 512;
        myLaptop.screenSize = 12.5f;
        myLaptop.weight = 5.3f;

        Laptop myFriendsLaptop = new Laptop();
        myFriendsLaptop.brand = "HP";
        myFriendsLaptop.type = "Ultrabook";
        myFriendsLaptop.processor = "Intel Core i7";
        myFriendsLaptop.ramSize = 8;
        myFriendsLaptop.hardDiskSizeGB = 1024;
        myFriendsLaptop.screenSize = 14;
        myFriendsLaptop.weight = 4.8f;

        System.out.println("1st class: Laptop");
        System.out.println("Brand: " + myLaptop.brand + "\n" + "Type: " + myLaptop.type + "\n" + "Weight: " + myLaptop.weight);
        System.out.println("----------------------------------------");

        Furniture sofa = new Furniture();
        sofa.style = "Modern";
        sofa.color = "Blue";
        sofa.price = 1550;
        sofa.sizeCapacity = "7 seats";
        sofa.material = "Fabric";

        Furniture table = new Furniture();
        table.material = "Wood";
        table.sizeCapacity = "62 x 51";
        table.style = "Farmhouse";
        table.color = "Brown";
        table.price = 480;

        System.out.println("2nd class: Furniture");
        System.out.println("I'm planing to buy " + sofa.style.toLowerCase() + ", " + sofa.color.toLowerCase()+ " color, " + sofa.material.toLowerCase() + " sofa." );
        System.out.println("----------------------------------------");

        Tree oak = new Tree();
        oak.name = "Oak";
        oak.numOfSpecies = 600;
        oak.leavesType = "Spirally";
        oak.fruitType = "Nut";
        oak.maxHeightFeet = 80;

        Tree eucalyptus = new Tree();
        eucalyptus.name = "Eucalyptus";
        eucalyptus.numOfSpecies = 700;
        eucalyptus.leavesType = "Lanceolate";
        eucalyptus.fruitType = "Gumnut";
        eucalyptus.maxHeightFeet = 200;

        System.out.println("3rd class: Tree");
        System.out.println("75 years old " + oak.name + " can reach " + oak.maxHeightFeet +" feet in height." );
        System.out.println("----------------------------------------");

        City sanjose = new City();
        sanjose.name = "San Jose";
        sanjose.state = "California";
        sanjose.population = 1000000;

        City seattle = new City();
        seattle.name = "Seattle";
        seattle.state = "Washington";
        seattle.population = 745000;

        System.out.println("4th class: City");
        System.out.println("I live in "+ sanjose.name+ " city of the state " + sanjose.state + "." );
    }
}
