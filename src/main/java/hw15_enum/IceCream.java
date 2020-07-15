package hw15_enum;



import java.util.List;

public class IceCream {
  private String name;
  private double price;
  private Flavor flavor;
  private List<Size> size;

  public IceCream(String name, double price, Flavor flavor, List<Size> size) {
    this.name = name;
    this.price = price;
    this.flavor = flavor;
    this.size = size;
  }
  public void printIceCream(){
    System.out.println("The Ice cream information: "+
        "\nName: " +name+
        "\nPrice: $" +price+
        "\nFlavor: " +flavor+
        "\nSize: "+size);
    System.out.println("***************************");

  }

}
