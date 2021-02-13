package HW14;

public class Janitor extends Hospitalstaff {
    private String janitorarea;

    //public Hospitalstaff(int id, String firstname, String lastname, String address)

    public Janitor(int id, String firstname, String lastname, String address, String janitorarea){
        super(id, firstname, lastname, address);
        this.janitorarea=janitorarea;

    }

}
