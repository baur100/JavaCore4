package hw12;

public class Residential extends Property {
    private boolean isResidential;

    public Residential(String type, String[] amenities, int rooms,
                       String propertyLocation, boolean isResidential) {
        super(type, amenities, rooms, propertyLocation);
        this.isResidential = isResidential;
    }

    public void printResidential (){
        if (isResidential){
            System.out.println("This is a residential property!");
        }else {
            System.out.println("This is not a residential property!");
        }
    }


}



