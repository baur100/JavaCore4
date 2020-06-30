package hw9hh;

public class Phone {
    public String type;
    public String brand;
    public String model;
    public String os;

    public void owner(String person) {
        System.out.println(person+" has an "+type+" phone" +
                "\nIt's "+brand+" "+model+" running on "+os);
    }
}
