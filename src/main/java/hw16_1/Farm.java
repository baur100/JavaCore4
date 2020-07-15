package hw16_1;

import java.util.HashMap;

public class Farm {
  private String name;
  private Address Address;
  private Cattle cattle;

  public Farm(String name, hw16_1.Address address, HashMap<Cattle, Integer> cattle) {
    this.name = name;
    Address = address;

  }

  public Cattle getCattle() {
    return cattle;
  }

  public void setCattle(Cattle cattle) {
    this.cattle = cattle;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public hw16_1.Address getAddress() {
    return Address;
  }

  public void setAddress(hw16_1.Address address) {
    Address = address;
  }



}
