package HM12;

public class JapaneseCar {
    protected String brand;
    protected String model;
    private boolean isJapaneseCar;


    public JapaneseCar(String brand, String model, boolean isJapaneseCar) {
        this.brand = brand;
        this.model = model;
        this.isJapaneseCar = isJapaneseCar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isJapaneseCar() {
        return isJapaneseCar;
    }

    public String info() {
        return
                "\nBrand = " + brand +
                        "\nModel = " + model;
    }
}

