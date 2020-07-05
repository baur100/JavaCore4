package HM12;

public class Ford extends JapaneseCar {
    private String ExteriorColor;
    private String InteriorColor;

    public Ford(String brand, String model, boolean isJapaneseCar, String exteriorColor, String interiorColor) {
        super(brand, model, isJapaneseCar);
        ExteriorColor = exteriorColor;
        InteriorColor = interiorColor;
    }
    public void printFord() {
        System.out.println("Ford:" +
                super.info() +
                "\nExterior Color = " + ExteriorColor +
                "\nInterior Color = " + InteriorColor);
        if (this.isJapaneseCar()) {
            System.out.println("This is Japanese car!!!!!");
        } else {
            System.out.println("This is American car!!!!!");
        }
    }
}
