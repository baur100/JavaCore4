package HM12;

public class Lexus extends JapaneseCar {
    private String ExteriorColor;
    private String InteriorColor;

    public Lexus(String brand, String model, boolean isJapaneseCar, String exteriorColor, String interiorColor) {
        super(brand, model, isJapaneseCar);
        ExteriorColor = exteriorColor;
        InteriorColor = interiorColor;
    }

    public String getExteriorColor() {
        return ExteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        ExteriorColor = exteriorColor;
    }

    public String getInteriorColor() {
        return InteriorColor;
    }

    public void setInteriorColor(String interiorColor) {
        InteriorColor = interiorColor;
    }

    public void printLexus() {
        System.out.println("Lexus: " + super.info() +
                "\nExterior Color = " + ExteriorColor +
                "\nInterior Color = " + InteriorColor);
        if (this.isJapaneseCar()) {
            System.out.println("This is real Japanese car!!!!!");
        } else {
            System.out.println("Not Japanese car");
        }
    }
}
