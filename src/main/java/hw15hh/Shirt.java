package hw15hh;

import l15Enums.Size;

import java.util.List;

public class Shirt {
    private ShirtType shirtType;
    private String color;
    private List<Design> design;
    private List<ShirtSize> shirtSize;

    public Shirt(ShirtType shirtType, String color, List<Design> design, List<ShirtSize> shirtSize) {
        this.shirtType = shirtType;
        this.color = color;
        this.design = design;
        this.shirtSize = shirtSize;
    }

    public ShirtType getShirtType() {
        return shirtType;
    }

    public void setShirtType(ShirtType shirtType) {
        this.shirtType = shirtType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Design> getDesign() {
        return design;
    }

    public void setDesign(List<Design> design) {
        this.design = design;
    }

    public List<ShirtSize> getShirtSize() {
        return shirtSize;
    }

    public void setShirtSize(List<ShirtSize> shirtSize) {
        this.shirtSize = shirtSize;
    }

    @Override
    public String toString() {
        return "Shirt: " +
                "shirtType=" + shirtType +
                ", color='" + color + '\'' +
                "\ndesign=" + design +
                "\nsize=" + shirtSize;
    }

    public void printShirt() {
        System.out.println(toString());
    }
}
