package hw15_enum;

import java.util.ArrayList;
import java.util.Collections;

public class App {

  public static void main(String[] args) {
    ArrayList<Size> sizes = new ArrayList<>();

    sizes.add(Size.SINGLE);
    sizes.add(Size.DOUBLE);
    sizes.add(Size.TRIPLE);
    sizes.add(Size.KIDS);
    sizes.add(Size.FAMILY);

    IceCream forAmy;
    forAmy = new IceCream("Amy's Ice cream", 5.00, Flavor.CHOCOLATE,
        Collections.singletonList(sizes.get(0)));
    forAmy.printIceCream();
    IceCream forAndrew;
    forAndrew = new IceCream("Andrew's Icecream", 7.00, Flavor.VANILLA,Collections.singletonList(sizes.get(1)));
    forAndrew.printIceCream();
    IceCream forFamily;
    forFamily = new IceCream("For the entire Family", 25.00, Flavor.STRAWBERRY, Collections.singletonList(sizes.get(4)));
    forFamily.printIceCream();

  }

}
