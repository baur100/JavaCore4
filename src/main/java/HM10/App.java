//1.    Create 4 classes with fields (at least 3 fields) and methods (at least 1 method)
//        each class has at least 2 constructors (default and full)
//        create printClass()/ printInfo() method to print out all fields
//        fields are private
//         each field has getter and setter

//2.    In the App class create main() and create 2 instanses of each class;
//        one instance created used default constructor - fill up fields using setter
//        second object created using full constructor
//        print object info using print-out method

package HM10;


public class App {
    public static void main(String[] args) {
        Country UnitesStateOfAmerica = new Country("Unites State of America", 332.639,"USA");

        UnitesStateOfAmerica.printInfo();

        System.out.println("-------------After Set and Get---------------------------");
        UnitesStateOfAmerica.setName("My original country is Ukraine");
        System.out.println(UnitesStateOfAmerica.getName());
        UnitesStateOfAmerica.setPopulation(41.625);
        System.out.println(UnitesStateOfAmerica.getPopilation());
        UnitesStateOfAmerica.setAbbreviation("UA");
        System.out.println(UnitesStateOfAmerica.getAbbreviation());

        System.out.println("**********************************************************");


        House myHouse = new House(1435,"Snowdon Garden",22);

        myHouse.printInfo();
        System.out.println("-------------After Set and Get---------------------------");
        System.out.println("My best friend address:");
        myHouse.setStreetNumbers(99);
        System.out.println(myHouse.getStreetNumbers());
        myHouse.setStreetName("Radley");
        System.out.println(myHouse.getStreetName());
        myHouse.setAptNumber(41);
        System.out.println(myHouse.getAptNumber());

        System.out.println("**********************************************************");

        Laptop powerfulLaptop = new Laptop("Apple","Pro 16",256);
        powerfulLaptop.printInfo();

        System.out.println("-------------After Set and Get---------------------------");
        System.out.println("Not Powerfull laptop:");
        powerfulLaptop.setBrand("HP");
        System.out.println(powerfulLaptop.getBrand());
        powerfulLaptop.setModel("Envy");
        System.out.println(powerfulLaptop.getModel());
        powerfulLaptop.setSsdDrive(20);
        System.out.println(powerfulLaptop.getSsdDrive());

        System.out.println("**********************************************************");
        Soccer_Team myFavorite = new Soccer_Team("Liverpool","UK",30);
        myFavorite.printInfo();

        System.out.println("-------------After Set and Get---------------------------");
        System.out.println("Not Favarite team:");
        myFavorite.setName("Man City");
        System.out.println(myFavorite.getName());
        myFavorite.setCountry("UK");
        System.out.println(myFavorite.getCountry());
        myFavorite.setAvrAgePlayers(27);
        System.out.println(myFavorite.getAvrAgePlayers());

    }

}
