package HM10;

public class Laptop {
    private String brand;
    private String model;
    private int ssdDrive;

    public Laptop(String brand,String model,int ssdDrive){
        this.brand=brand;
        this.model=model;
        this.ssdDrive=ssdDrive;
    }
    public void printInfo(){
        System.out.println("Powerful Laptop: "+"\n" + brand + "\n" + model + "\n" + ssdDrive);
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setSsdDrive(int ssdDrive){
        this.ssdDrive=ssdDrive;
    }
    public int getSsdDrive(){
        return ssdDrive;
    }
}
