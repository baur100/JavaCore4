package hw12;

import java.util.Arrays;

public class Property {
    protected String type;
    protected String[] amenities;
    protected int rooms;
    protected String propertyLocation;

    public Property(String type, String[] amenities, int rooms, String propertyLocation){
        this.type=type;
        this.amenities=amenities;
        this.rooms=rooms;
        this.propertyLocation=propertyLocation;
    }

    protected void printPropertyInfo(){
        System.out.println(this.type + Arrays.toString(this.amenities) +
                this.rooms + propertyLocation);
    }

    public String getPropertyLocation() {
        return propertyLocation;
    }

    public void setPropertyLocation(String propertyLocation) {
        this.propertyLocation = propertyLocation;
    }

    public String getName() {
        return type;
    }

    public void setName(String name) {
        this.type = name;
    }

    public String[] getAmenities() {
        return amenities;
    }

    public void setAmenities(String[] amenities) {
        this.amenities = amenities;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
}
