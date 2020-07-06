package HW14;

public class Nurse extends Hospitalstaff {
    private String nursedepartment;

    public Nurse(int id, String firstname, String lastname, String address, String nursedepartment){
        super(id, firstname, lastname, address);
        this.nursedepartment=nursedepartment;

    }
}
