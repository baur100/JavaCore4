
//        2. In the App class create main() and create 2 instanses of each class, fill all fields
//        invoke methods

package HM9;

public class App {
    public static void main(String[] args) {
        Laptop newToy = new Laptop();
        newToy.brand = "MacBook";
        newToy.model = "Pro 16";
        System.out.println("My new toy is " + newToy.brand);
        newToy.my("Pro 16");

        System.out.println("**************************");

        Soccer_Team favorite = new Soccer_Team();
        favorite.name = "Liverpool";
        favorite.country = "United Kingdom";
        System.out.println("My favorite team is " + favorite.name);
        favorite.country("United Kingdom");

        System.out.println("**************************");

        House myHouseAddress = new House();
        myHouseAddress.streetNumbers = 1435;
        myHouseAddress.streetName = "Snowdon Garden";
        System.out.println("My street number " + myHouseAddress.streetNumbers);
        myHouseAddress.street("Snowdon Garden");

        System.out.println("**************************");

        Country myCountryData = new Country();
        myCountryData.nameOfTheCountry = "USA";
        myCountryData.countryPopulation = 332.639;
        System.out.println("My country is "+myCountryData.nameOfTheCountry);
        myCountryData.pop("332.639");



    }

}
