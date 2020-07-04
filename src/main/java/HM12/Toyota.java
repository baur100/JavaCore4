package HM12;

public class Toyota extends JapaneseCar {
    private String ExteriorColor;
    private String InteriorColor;

    public Toyota(String brand, String model, boolean isJapaneseCar, String exteriorColor, String interiorColor) {
        super(brand, model, isJapaneseCar);
        ExteriorColor = exteriorColor;
        InteriorColor = interiorColor;
    }

    public void printToyota() {
        System.out.println("Toyota {" +
                " Brand='" + brand + '\'' +
                " Model='" + model + '\'' +
                " Exterior Color='" + ExteriorColor + '\'' +
                " Interior Color='" + InteriorColor + '\'' +
                '}');
        if (this.isJapaneseCar()){
            System.out.println("This is real Japanese car!!!!!");
        }else{
            System.out.println("Not Japanese car");
        }
    }
}
