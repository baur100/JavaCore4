package hw17;

import java.util.HashMap;
import java.util.Map;

public class AppHW17 {
    public static void main(String[] args) {
        HashMap<String, String> restaurant = new HashMap<String, String>();
        restaurant.put("Chinese", "Palms City");
        restaurant.put("Thai", "Culver City");
        restaurant.put("Italian", "Westwood");
        restaurant.put("American", "Santa Monica");

        System.out.println(restaurant);
        System.out.println("**************");
        System.out.println(restaurant.get("Thai"));
        System.out.println("**************");


        HashMap<Integer, String> areaCode = new HashMap<Integer, String>();
        areaCode.put(90034, "Palms");
        areaCode.put(91606, "North Hollywood");
        areaCode.put(90404, "Santa Monica");
        areaCode.put(91689, "Pasadena");

        System.out.println(areaCode);
        System.out.println("**************");
        System.out.println(areaCode.get(90034));
        System.out.println("**************");

        areaCode.replace(91606, "NoHo");
        System.out.println(areaCode.get(91606));
        System.out.println("**************");

        Map<City, State> cityState = new HashMap<City, State>();
        cityState.put(new City(), new State());
        cityState.put(new City(), new State());
        cityState.put(new City(), new State());

        System.out.println(cityState.size());





    }

}
