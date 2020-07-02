package l10Hw;

public class App {
    public static void main(String[] args) {
        Clothes tshirt = new Clothes("t-shirt", "S", "cotton");

        System.out.println("___________________________________" + "\n1st class ");
        tshirt.printInfo();
        System.out.println(tshirt.getMaterial());
        tshirt.setMaterial("Silk");
        tshirt.printInfo();
        System.out.println(tshirt.getMaterial());
        tshirt.setSize("L");
        System.out.println(tshirt.getSize());
        System.out.println("___________________________________" + "\n2nd class ");
        Hotel hilton = new Hotel("Hilton", 5, 150);

        System.out.println("Name of hotel: " + hilton.getName() + "\nNumber of stars: " + hilton.getNumOfStars() + "\nPrice per night for 2: " + hilton.getPrice()+"$");
        hilton.getInfo();

        System.out.println("___________________________________" + "\n3rd class ");
        Grain buckwheat = new Grain("Buckwheat", 343, "brown");
        buckwheat.getInfo();
        buckwheat.setType("Wheat");
        buckwheat.setCalories(340);
        buckwheat.setColor("yellow");
        System.out.println("Grain: " + buckwheat.getType() + "\nCalories: " + buckwheat.getCalories() + "\nColor: " + buckwheat.getColor());
        buckwheat.getInfo();


    }
}
