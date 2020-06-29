package hw9;

public class App {

  public static void main(String[] args) {

burger amyBurger = new burger("Amy's ", "Brown Rye roll", "Prime Beef", 4.5);
amyBurger.addTopping1("Bacon", 1.5);
amyBurger.addTopping2("Avocado", 0.7);

    System.out.println("The total price for "+amyBurger.name +"burger is $" + amyBurger.totalPrice());

    System.out.println("************************************************************************");
    deluxeBurger amyDeluxe = new deluxeBurger();
    amyDeluxe.addTopping1("Bacon", 1.0);
    System.out.println("The total price for "+amyDeluxe.name +"burger is $" + amyDeluxe.totalPrice());


    System.out.println("************************************************************************");

    healthyBurger amyHealthyBurger = new healthyBurger();
    amyHealthyBurger.addHealthyTopping1("Tomato", 0.5);
    amyHealthyBurger.addHealthyTopping2("Grilled onion", 0.5);
    System.out.println(amyHealthyBurger.name + " burger is $" +amyHealthyBurger.totalPrice());

    System.out.println("************************************************************************");
    kidsBurger juniorBurger = new kidsBurger("Butter roll", "Fun size beef");
    juniorBurger.addComboMeal1("Chicken nuggets", 1.0);
    juniorBurger.addComboMeal2("Orange Juice", 1.0);
//    juniorBurger.addTopping1("tomato", 1.0);
//    juniorBurger.addTopping2("bacon", 1.0);
      System.out.println("Total price of "+ juniorBurger.name + " burger is $" +juniorBurger.totalPrice());


  }

}
