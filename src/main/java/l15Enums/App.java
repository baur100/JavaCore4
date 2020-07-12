package l15Enums;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Colors snickers = Colors.CYAN;

        Fruits apple = new Fruits("Apple",Colors.RED);
//
//        // "RED" "red" "Red"
//
//        School newDorpSchool = new School("New Dorp High School", SchoolType.PUBLIC);
//
//        List<Size> sizes = new ArrayList<Size>();
//        sizes.add(Size.S);
//        sizes.add(Size.L);
//
//        List<Gender> genders = new ArrayList<>();
//        genders.add(Gender.FEMALE);
//
//        Snickers adidasNeo = new Snickers("Adidas","Neo",Colors.CYAN,genders,sizes);
//

        System.out.println(apple.getColor());
    }
}
