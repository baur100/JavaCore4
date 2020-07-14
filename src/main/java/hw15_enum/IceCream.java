package hw15_enum;

//Create 2 Enums
//    Create 2 classes
//    - first will have field with type enum
//    - second - field as ArrayList<enum.type>

import java.util.List;

public class IceCream {
  private String name;
  private double price;
  private Flavor flavor;
  private List<Size> size;
  //I Can't understand the enum - list part.
  // I watched the video but not sure why the teacher had to add the value to the list when he had a enum class with values.

  public IceCream(String name, double price, Flavor flavor, Size size) {
    this.name = name;
    this.price = price;
    this.flavor = flavor;
    this.size = size;
  }
}
