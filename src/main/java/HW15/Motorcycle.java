package HW15;

public class Motorcycle implements Oilchange{
    int moto_id;
    String moto_brand;
    int mileage;

    public Motorcycle(int moto_id, String moto_brand, int mileage) {
        this.moto_id = moto_id;
        this.moto_brand = moto_brand;
        this.mileage = mileage;
    }

    public int getMoto_id() {
        return moto_id;
    }

    public void setMoto_id(int moto_id) {
        this.moto_id = moto_id;
    }

    public String getMoto_brand() {
        return moto_brand;
    }

    public void setMoto_brand(String moto_brand) {
        this.moto_brand = moto_brand;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void emptyFirstOil(){
        System.out.println("Empty the existing oil in the " + moto_brand + " motorcycle");

    }

    public void addNewOil(){
        System.out.println("Fill up with the brand new oil in the " + moto_brand + " motorcycle");

    }

}
