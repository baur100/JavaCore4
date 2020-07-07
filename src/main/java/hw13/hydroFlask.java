package hw13;

public class hydroFlask implements waterBottle {
  String color;
  int size;
  String brand;

  public hydroFlask(String color, int size, String brand) {
    this.color = color;
    this.size = size;
    this.brand = brand;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  @Override
  public void fillUp() {
    System.out.println("The bottle is full.");
  }

  @Override
  public void pourOut() {
    System.out.println("The bottle is empty.");

  }

  @Override
  public void getInfo() {
    System.out.println("This "+this.color+ " color water bottle is "
        +this.size+ "oz " +
        this.brand +" brand product.");
  }
}
