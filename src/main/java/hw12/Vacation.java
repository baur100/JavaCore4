package hw12;

public class Vacation extends Property {
    private boolean isVacationHouse;


    public Vacation(String type, String[] amenities, int rooms,
                    String propertyLocation, boolean isVacationHouse) {
        super(type, amenities, rooms, propertyLocation);
        this.isVacationHouse=isVacationHouse;
    }



    public void printVacation (){
        if (isVacationHouse){
            System.out.println("This is a vacation property!");
        }else {
            System.out.println("This is not a vacation house!");
        }
    }


}
