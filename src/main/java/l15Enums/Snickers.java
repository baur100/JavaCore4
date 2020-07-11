package l15Enums;

import java.util.List;

public class Snickers {
    private String brand;
    private String model;
    private Colors color;
    private List<Gender> genders;
    private List<Size> sizes;

    public Snickers(String brand, String model, Colors color, List<Gender> genders, List<Size> sizes) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.genders = genders;
        this.sizes = sizes;
    }
}
