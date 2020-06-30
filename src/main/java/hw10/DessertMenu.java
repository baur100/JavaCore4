package hw10;

public class DessertMenu {
  private String cakeName;
  private int cakePrice;
  private String cookieName;
  private int cookiePrice;
  private String icecreamName;
  private int icecreamPrice;

  public String getCakeName() {
    return cakeName;
  }

  public void setCakeName(String cakeName) {
    this.cakeName = cakeName;
  }

  public int getCakePrice() {
    return cakePrice;
  }

  public void setCakePrice(int cakePrice) {
    this.cakePrice = cakePrice;
  }

  public String getCookieName() {
    return cookieName;
  }

  public void setCookieName(String cookieName) {
    this.cookieName = cookieName;
  }

  public int getCookiePrice() {
    return cookiePrice;
  }

  public void setCookiePrice(int cookiePrice) {
    this.cookiePrice = cookiePrice;
  }

  public String getIcecreamName() {
    return icecreamName;
  }

  public void setIcecreamName(String icecreamName) {
    this.icecreamName = icecreamName;
  }

  public int getIcecreamPrice() {
    return icecreamPrice;
  }

  public void setIcecreamPrice(int icecreamPrice) {
    this.icecreamPrice = icecreamPrice;
  }

  public DessertMenu(String cakeName, int cakePrice, String cookieName, int cookiePrice,
      String icecreamName, int icecreamPrice) {
    this.cakeName = cakeName;
    this.cakePrice = cakePrice;
    this.cookieName = cookieName;
    this.cookiePrice = cookiePrice;
    this.icecreamName = icecreamName;
    this.icecreamPrice = icecreamPrice;
  }

  public DessertMenu(String cakeName, int cakePrice) {
    this.cakeName = cakeName;
    this.cakePrice = cakePrice;
  }
  public int calculatePrice(){
    int price = 0;
    if(this.cakeName!=null){
      price+=cakePrice;
    }
    if(this.cookieName!=null){
      price+=cookiePrice;
    }
    if(this.icecreamName!=null){
      price+=icecreamPrice;
    }
    return price;
    }

    public void orderDessert(){
      System.out.println("You have ordered "  + cakeName +", "+cookieName+", " +icecreamName );
      System.out.println("The total price is $" + calculatePrice());
    }
  }

