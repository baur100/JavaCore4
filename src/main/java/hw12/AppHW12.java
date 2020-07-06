package hw12;

public class AppHW12 {
    public static void main(String[] args) {
       String[] propertyAmenities = {"Kitchen", "Washer & Dryer", "Balcony",
               "24/7 Security", "Beach nearby"};
       Vacation condo = new Vacation("Condo", propertyAmenities,
               3,
               "San Diego ", false);
       condo.printPropertyInfo();
       condo.printVacation();


       String[] townHouseAmenities = {"Kitchen", "Washer & Dryer", "Backyard",
                "School nearby", "Beach nearby"};
       Residential townHouse = new Residential("TownHouse", townHouseAmenities,
               4, "Los Angeles", true);
        townHouse.printPropertyInfo();
        townHouse.printResidential();


        String[] rentalAmenities = {"Kitchen", "Washer & Dryer", "Backyard",
                "School nearby", "Super Market", "Public Transportation"};
        Rental apartment = new Rental("Apartment", rentalAmenities, 2, "West Hollywood",
                false  );
        apartment.printPropertyInfo();
        apartment.printRental();





    }

}
