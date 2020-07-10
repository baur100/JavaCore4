package hw16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AppHW16 {


    public static void main(String[] args) {
        ArrayList<String> collage = new ArrayList<String>();

        collage.add("HWS");
        collage.add("NYU");
        collage.add("UCLA");
        collage.add("USC");
        collage.add("UCSD");
        System.out.println(collage);
        System.out.println("****************");

        System.out.println(collage.contains("HWS"));
        System.out.println("****************");

        collage.remove("UCSD");
        System.out.println(collage);
        System.out.println("****************");

        collage.set(0, "UCSF");
        System.out.println(collage);
        System.out.println("****************");

        System.out.println(collage.get(2));
        System.out.println("****************");

        List<Double> gpa = Arrays.asList(3.3, 4.0, 3.0, 4.1);
        gpa.forEach(v -> System.out.println(v));
        System.out.println("****************");


        List<Students> person = new ArrayList<Students>();
        Students deejah = new Students("Deejah", "rios", 23);
        Students jenella = new Students("Jenella", "anderson", 27);
        Students tom = new Students("Tom", "Cruz", 50);

        person.add(deejah);
        person.add(jenella);
        person.add(tom);

        for (Students p: person){
            System.out.println(p.getName());
        }
        System.out.println("****************");


        person.forEach(v -> System.out.println(v.getLastName()));
        System.out.println("****************");

        for (Students p:person){
            System.out.println(p.getAge());
        }


    }
}
