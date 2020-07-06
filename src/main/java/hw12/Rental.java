package hw12;

public class Rental extends Property {
    private boolean isOpenToPublic;

    public Rental(String type, String[] amenities, int rooms,
                  String propertyLocation, boolean isOpenToPublic) {
        super(type, amenities, rooms, propertyLocation);
        this.isOpenToPublic = isOpenToPublic;
    }

    public void printRental(){
        if(isOpenToPublic){
            System.out.println("This is public property!");
        }else {
            System.out.println("This not open for public");
        }
    }
}
