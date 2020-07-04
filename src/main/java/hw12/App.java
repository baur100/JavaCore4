package hw12;
public class App {

  public static void main(String[] args) {
    China china = new China("Red");
    china.printCountryInfo();
    china.sayHello();
    System.out.println("***********************************");
    Korea korea =  new Korea("Kimchi");
    korea.printCountryInfo();
    korea.setFood("Bulgogi");
    korea.printCountryInfo();
    System.out.println("***********************************");
    Busan busan =new Busan("Seafood",true);
    busan.setName("Busan");
    busan.printCountryInfo();
    System.out.println("***********************************");
    Seoul seoul = new Seoul("Capital Style Kimchi", false, "Han");
    seoul.setName("Seoul");
    seoul.printCountryInfo();


  }


}
