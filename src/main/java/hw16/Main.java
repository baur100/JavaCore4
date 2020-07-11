package hw16;

import java.util.ArrayList;
import java.awt.Point;

public class Main {
    public static void main(String [] args){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Purple");
        System.out.println("ArrayList \"colors\" contains : ");
        System.out.println(colors.toArray());
        System.out.println("First element : " + colors.get(0));
        System.out.println("Last element : " + colors.get(colors.size()-1));
        System.out.println("Swap first and last elements");
        String temp = colors.get(colors.size()-1);
        colors.set(0,colors.get(colors.size()-1));
        colors.set(colors.size()-1, temp);
        System.out.println("First element : " + colors.get(0));
        System.out.println("Last element : " + colors.get(colors.size()-1));
        System.out.println("Remove first and last elements");
        colors.remove(0);
        colors.remove(colors.size()-1);
        System.out.println(colors.toArray());

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(11);
        numbers.add(5);
        numbers.add(45);
        numbers.add(64);
        numbers.add(24);
        System.out.println("ArrayList \"numbers\" contains : ");
        System.out.println(numbers.toArray());
        System.out.println("First element : " + numbers.get(0));
        System.out.println("Last element : " + colors.get(numbers.size()-1));
        System.out.println("Swap first and last elements");
        int temp1 = numbers.get(numbers.size()-1);
        numbers.set(0,numbers.get(numbers.size()-1));
        numbers.set(numbers.size()-1, temp1);
        System.out.println("First element : " + numbers.get(0));
        System.out.println("Last element : " + numbers.get(numbers.size()-1));
        System.out.println("Remove first and last elements");
        numbers.remove(0);
        numbers.remove(numbers.size()-1);
        System.out.println(numbers.toArray());

        ArrayList<Point> points = new ArrayList<Point>();
        Point point = new Point(1,2);
        points.add(point);
        point = new Point(2,6);
        points.add(point);
        point = new Point(6,4);
        points.add(point);
        point = new Point(10,9);
        points.add(point);
        point = new Point(5,5);
        points.add(point);
        System.out.println("ArrayList \"points\" contains : ");
        System.out.println(points.toArray());
        System.out.println("First element : " + points.get(0));
        System.out.println("Last element : " + colors.get(points.size()-1));
        System.out.println("Swap first and last elements");
        Point temp2 = points.get(points.size()-1);
        points.set(0,points.get(points.size()-1));
        points.set(points.size()-1, temp2);
        System.out.println("First element : " + points.get(0));
        System.out.println("Last element : " + points.get(points.size()-1));
        System.out.println("Remove first and last elements");
        points.remove(0);
        points.remove(colors.size()-1);
        System.out.println(points.toArray());
    }

}
