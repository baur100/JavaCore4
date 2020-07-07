package HW13Jul6;

public class SystemConfig implements Software, Hardware{
    protected boolean motherBoard;
    protected int ramConfig;
    protected int romConfig;
    protected String intelConfig;
    protected String getStorageType;
    protected String version;
    protected String systemOS;
    protected boolean internetSetUp;
    protected double price;
    protected int width;
    protected int length;
    protected double weight;
    protected int height;

    public SystemConfig(boolean motherBoard, int ramConfig, int romConfig, String intelConfig, String getStorageType, String version, String systemOS, boolean internetSetUp, double price) {
        this.motherBoard = motherBoard;
        this.ramConfig = ramConfig;
        this.romConfig = romConfig;
        this.intelConfig = intelConfig;
        this.getStorageType = getStorageType;
        this.version = version;
        this.systemOS = systemOS;
        this.internetSetUp = internetSetUp;
        this.price = price;
    }

    public SystemConfig(int width, int length, double weight, int height) {
        this.width = width;
        this.length = length;
        this.weight = weight;
        this.height = height;
    }

    public double prodArea(){
        System.out.print("\tArea: "+getHeight()*getLength());
        return  this.height*this.length;
    }

    public double prodVolume(){
        System.out.print("\tVolume: "+getHeight()*getLength()*getWidth());
        return this.height*this.length*this.width;
    }

    public double prodDensity(){
        System.out.print("\tDensity: "+getHeight()*getLength()*getWidth()*getWeight());
        return this.height*this.length*this.width*this.weight;
    }

    @Override
    public boolean motherBoardSet() {
        return true;
    }

    @Override
    public int ramConfig() {
        return this.ramConfig;
    }

    @Override
    public int romConfig() {
        return this.romConfig;
    }

    @Override
    public String intelConfig() {
        return this.intelConfig;
    }

    @Override
    public String getStorageType() {
        return this.getStorageType;
    }

    @Override
    public String version() {
        return this.version;
    }

    @Override
    public String systemOS() {
        return this.systemOS;
    }

    @Override
    public boolean internetSetUp() {
        return this.internetSetUp;
    }

    public int getWidth() { return width; }

    public void setWidth(int width) { this.width = width; }

    public int getLength() { return length; }

    public void setLength(int length) { this.length = length; }

    public double getWeight() { return weight; }

    public void setWeight(double weight) { this.weight = weight; }

    public int getHeight() { return height; }

    public void setHeight(int height) { this.height = height; }
}
