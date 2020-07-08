package HW15;

public class Truck implements Oilchange{
    private int truckid;
    String truck_brand;
    private int mileage;

    public Truck(int truckid, String truck_brand, int mileage) {
        this.truckid = truckid;
        this.truck_brand = truck_brand;
        this.mileage = mileage;
    }

    public int getTruckid() {
        return truckid;
    }

    public void setTruckid(int truckid) {
        this.truckid = truckid;
    }

    public String getTruck_brand() {
        return truck_brand;
    }

    public void setTruck_brand(String truck_brand) {
        this.truck_brand = truck_brand;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void emptyFirstOil(){
        System.out.println("Empty the existing oil in the " + truck_brand + " truck");

    }

    public void addNewOil(){
        System.out.println("Fill up with the brand new oil in the " + truck_brand + " truck");

    }

}
