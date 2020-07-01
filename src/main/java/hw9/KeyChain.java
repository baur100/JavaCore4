package hw9;

public class KeyChain {
        private String type;
        private String color;
        private int[] size;

    public KeyChain(String type, String color, int[] size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int[] getSize() {
        return size;
    }

    public void setSize(int[] size) {
        this.size = size;
    }

    public void printNow() {
            System.out.println("Type = " + this.type + "\nColor = " + this.color);
            for (int size : this.size){
                System.out.println(size);
            }
        }
    }


