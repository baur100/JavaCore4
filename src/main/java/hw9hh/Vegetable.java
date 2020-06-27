package hw9hh;

public class Vegetable {
    public String name;
    public String color;
    public String cutUpSize;

    public void cook(String otherIngredients) {
        System.out.println("You can saute "+cutUpSize+" with "+otherIngredients);
    }
}
