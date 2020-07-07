package HW9;

public class Planet {
    private String name;
    private int radius;
    private String color;

    public Planet(String name, int radius, String color){
        this.name=name;
        this.radius=radius;
        this.color=color;
    }

    public Planet(){
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setColor(String Color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void printPlanetInfo(){
        System.out.println("Name= " + name + "\nRadius= " + radius + "\nColor=" + color);
    }
}
