package hw11;

import java.util.Arrays;

public class ShoppingList {
  private String[]groceryList;
  private String shopperName;


  public ShoppingList(String[] groceryList, String shopperName) {
    this.groceryList = groceryList;
    this.shopperName = shopperName;
  }

  public String[] getGroceryList() {
    return groceryList;
  }

  public void setGroceryList(String[] groceryList) {
    this.groceryList = groceryList;
  }

  public String getShopperName() {
    return shopperName;
  }

  public void setShopperName(String shopperName) {
    this.shopperName = shopperName;
  }


  public void printGroceryList(){
    System.out.println(shopperName+ " will be in charge for shopping. "
        +"\nAnd the items are: "+ Arrays.deepToString(this.groceryList));
  }
}
