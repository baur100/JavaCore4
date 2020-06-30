package hw8;

public class Town{

    public String name;
    public int per_capita_area;

    public void printIt(){
        System.out.println("name = " + name);
        System.out.println("per_capita_area = " + per_capita_area);

    }
    public void  story() {
        System.out.println("I live in "+name+" with a " + per_capita_area + " sq feet area");
    }
}



