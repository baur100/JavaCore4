package hw8;

public class Clothes {
    public String type;
    public String size;
    public String color;

    public void presentation(){
        System.out.println(color + " " + type + " size: " + size);
    }

    public void changeSize(String size){
        this.size = size;
    }
}
