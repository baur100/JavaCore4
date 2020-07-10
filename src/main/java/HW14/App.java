package HW14;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {


        List<String> Planets = new ArrayList<String>();
        Planets.add("Mercury");
        Planets.add("Venus");
        Planets.add("Earth");
        Planets.add("Jupiter");
        Planets.add("Saturn");
        Planets.add("Uranus");
        Planets.add("Neptune");
        Planets.add("ceres");
        System.out.println(Planets);
        Planets.add(3,"mars");
        Planets.set(8,"Pluto");
        System.out.println(Planets);
        System.out.println(Planets.get(3));
        for (String v:Planets
             ) {
            System.out.println(v);

        }

        System.out.println("**************************");
        List<Integer> Odds = new ArrayList<Integer>();
        Odds.add(1);
        Odds.add(2);
        Odds.add(7);
        Odds.add(9);
        Odds.add(13);
        System.out.println(Odds);
        Odds.set(1,3);
        Odds.remove(4);
        System.out.println(Odds);

        for (int v: Odds
             ) {
            System.out.println(v);
        }
        System.out.println("**************************");
        List<Flowers> Flower = new ArrayList<>();
        Flowers SunFlower = new Flowers("SunFlower");
        Flowers Rose = new Flowers("Rose");
        Flowers Lilly = new Flowers("Lilly");
        Flowers Poppy = new Flowers("Poppy");

        Flower.add(SunFlower);
        Flower.add(Rose);
        Flower.add(Lilly);
        Flower.add(Poppy);

        for (Flowers v: Flower) {
            System.out.println(v.getFlowerName());

        }
    }
}
