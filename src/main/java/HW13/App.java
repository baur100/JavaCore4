package HW13;

//Create an interface and 2 classes which implements it. Create 2 objects of each class. Assign one object to interface type

public class App {
    public static void main(String[] args) {

        Drinks hot = new HotDrinks("Earl Grey", "Latte", "Nesquik");
        hot.sip();
        hot.drink();
        hot.spill();

        Juice juice = new Juice("Orange", "Apple", "Tomato");
        juice.sip();
        juice.drink();
        juice.spill();

    }
}
