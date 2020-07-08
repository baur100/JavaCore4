package Homework15;

public class RemoteController implements Battery {
    private String brand;
    private String type;
    private String software;

    public RemoteController(String brand, String type, String software) {
        this.brand = brand;
        this.type = type;
        this.software = software;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    @Override
    public void BatteryStandard() {
        System.out.println("I implement Battery standards to operate Remote Controller");
    }
}
