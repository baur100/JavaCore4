package l10Hw;

public class Clothes {
    private String type;
    private String size;
    private String material;

    public Clothes(){}

    public Clothes(String type, String size, String material){
        this.type = type;
        this.size = size;
        this.material = material;
    }

    public void printInfo(){
        System.out.println("I am wearing " + this.size + " size" + ", " + this.material + " " + this.type + ".");

    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size=="L"){
            System.out.println("L size out of stock.");
            System.out.println("Size will be set as M");

        }
        this.size = "M";
    }
}
