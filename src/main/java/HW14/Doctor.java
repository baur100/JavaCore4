package HW14;

public class Doctor extends Hospitalstaff{
    private String doctorspecialty;

    //public Hospitalstaff(int id, String firstname, String lastname, String address)
    public Doctor(int id, String firstname, String lastname, String address, String doctorspecialty){
        super(id, firstname, lastname, address);
        this.doctorspecialty=doctorspecialty;

    }
}
