package hw13;

public class waterGlass implements waterBottle {
  private String material;
  private int size;
  private String shape;

  public waterGlass(String material, int size, String shape) {
    this.material = material;
    this.size = size;
    this.shape = shape;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String getShape() {
    return shape;
  }

  public void setShape(String shape) {
    this.shape = shape;
  }

  @Override
  public void fillUp() {
    System.out.println("The glass is full.");
  }

  @Override
  public void pourOut() {
    System.out.println("The glass is entirely empty.");
  }

  @Override
  public void getInfo() {
    System.out.println("This "+this.shape+ " shape of glass is made of "
        +this.material+ " and can hold " +this.size+ " ozs of liquid.");
  }
}
