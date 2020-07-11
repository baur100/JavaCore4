package HW15;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Car tesla = new Car("Tesla", "Model 3", Color.BLACK);
        System.out.println(tesla.getColor());

        System.out.println("*********");

        List<Day> dayForGym = new ArrayList<Day>();
        dayForGym.add(Day.MONDAY);
        dayForGym.add(Day.WEDNESDAY);
        dayForGym.add(Day.SATURDAY);

        Sport gym = new Sport("Gym", dayForGym);
        System.out.println(gym.getDay());
    }
}
