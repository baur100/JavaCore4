package hw14;
import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String[] args) {

    List<Cake> cakeList = new ArrayList<Cake>();

    Cake chocolate = new Cake("Banana chocolate cake");
    Cake cheese = new Cake("NY Cheese cake");

    cakeList.add(chocolate);
    cakeList.add(cheese);
    System.out.println("***The cake menu***");
    cakeList.forEach(v-> System.out.println(v.getName()));


    List<Cake> priceList = new ArrayList<Cake>();
    Cake fullSize = new Cake(58.00);
    Cake halfSize = new Cake(47.00);
    Cake slice = new Cake(12.00);

    priceList.add(fullSize);
    priceList.add(halfSize);
    priceList.add(slice);
    System.out.println();
    System.out.println("***The Price tags $$$***");
    priceList.forEach(v-> System.out.println("$ "+ v.getPrice()));

    System.out.println();
    System.out.println("***The Coffee menu***");
    ArrayList<FullMenu> fullMenuList = new ArrayList<FullMenu>();
    fullMenuList.add(new FullMenu("Americano", 4.5));
    fullMenuList.add(new FullMenu("Caffe Mocha",5.5 ));
    fullMenuList.add(new FullMenu("Iced Latte", 5.8));

    fullMenuList.forEach(v-> System.out.println(v.getCoffeeMenu() + ": $" +v.getPrice()));

    System.out.println();
    System.out.println("***NEW Coffee menu***");
    fullMenuList.remove(2);
    fullMenuList.forEach(v-> System.out.println(v.getCoffeeMenu() + ": $" +v.getPrice()));

    System.out.println();
    Cake summer = new Cake("Summer Lemon cake");
    cakeList.add(summer);

    System.out.println("***The NEW cake menu***");
    cakeList.forEach(v-> System.out.println(v.getName()));

  }

  }


