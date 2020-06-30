package hw10hh;

import javax.crypto.spec.PSource;

public class hw10AppHH {
    public static void main(String[] args) {
        Flowers rose = new Flowers("Rose", "Red", "All Seasons", 15);
        rose.setPrice(-1);
        System.out.println(rose.getPrice());
        rose.printInfo();

        System.out.println("*******************************************");

        Flowers tulip = new Flowers();
        tulip.setType("Tulip");
        tulip.setColor("Yellow");
        tulip.setSeason("Spring");
        tulip.setPrice(10);
        tulip.printInfo();

        System.out.println("*******************************************");

        Insects bee = new Insects("Bee", "Black & Yellow", "No");
        bee.printInfo();

        System.out.println("*******************************************");

        Insects cricket = new Insects();
        cricket.setName("Cricket");
        cricket.setColor("Grayish Green");
        cricket.setFood("Yes");
        cricket.printInfo();

        System.out.println("*******************************************");

        Pandemic covid = new Pandemic("COVID-19", "Wuhan, China", 10402637, 2019);
        covid.setYear(2025);
        covid.printInfo();

        System.out.println("*******************************************");

        Pandemic spanish = new Pandemic();
        spanish.setName("Spanish Flu");
        spanish.setOrigin("Kansas");
        spanish.setInfected(500000000);
        spanish.setYear(1918);
        spanish.printInfo();

        System.out.println("*******************************************");

        Shoes nike = new Shoes("Nike", "Running", 145);
        nike.setBrand("Supreme");
        nike.setPrice(1500);
        nike.printInfo();

        System.out.println("*******************************************");

        Shoes aldo = new Shoes();
        aldo.setBrand("Aldo");
        aldo.setType("Dress Shoes");
        aldo.setPrice(99);
        aldo.printInfo();
    }
}
