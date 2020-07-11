package hw8;

public class Figure {
    public String name;
    public String color;

    public void changeColor(String color){
        this.color = color;
    }

    public void presentation(){
        System.out.println("This figure is a " + name);
    }
}
