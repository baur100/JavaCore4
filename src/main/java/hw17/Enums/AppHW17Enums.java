package hw17.Enums;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AppHW17Enums {
    public static void main(String[] args) {
        Colors colorOfFruit = Colors.GREEN;

        Fruits watermelon = new Fruits("Watermelon", Colors.GREEN);
        System.out.println(watermelon);

        List<Colors> color = new ArrayList<Colors>();
        color.add(Colors.GREEN);
        color.add(Colors.RED);
        System.out.println(color);


    }
}
