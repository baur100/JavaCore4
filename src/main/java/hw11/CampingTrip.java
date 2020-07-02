package hw11;

public class CampingTrip {

  private ShoppingList shoppingList;
  private String campSite;
  private String date;

  public CampingTrip(ShoppingList shoppingList, String campSite, String date) {
    this.shoppingList = shoppingList;
    this.campSite = campSite;
    this.date = date;
  }

  public CampingTrip() {
  }

  public ShoppingList getShoppingList() {
    return shoppingList;
  }

  public void setShoppingList(ShoppingList shoppingList) {
    this.shoppingList = shoppingList;
  }

  public String getCampSite() {
    return campSite;
  }

  public void setCampSite(String campSite) {
    this.campSite = campSite;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public void printCampingInto(){
    System.out.println("This is the camping trip information. \n\n"
        + "Location: " +this.campSite
    +"\nDate: " +this.date);

  }
}
