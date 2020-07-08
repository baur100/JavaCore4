package HW13;

public class App {
    public static void main(String[] args) {
        Shopping grocery = new Shopping("grocery");
        grocery.monday();
        grocery.tuesday();

        System.out.println("**************");

        Shopping clothes = new Shopping("new clothes");
        clothes.friday();
        clothes.saturday();

        System.out.println("**************");
        Sport jogging = new Sport("jogging", 6, true);
        jogging.tuesday();
        jogging.monday();

        System.out.println("**************");

        Sport yoga = new Sport("yoga", 9, false);
        yoga.friday();
        yoga.thursday();

        System.out.println("**************");

        ToDoList shoppingForBday = new Shopping("Birthday shopping");
        shoppingForBday.friday();
        shoppingForBday.wednesday();
    }
}
