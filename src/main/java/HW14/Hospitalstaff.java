package HW14;

public class Hospitalstaff {
    protected int id;
    protected String firstname;
    protected String lastname;
    protected String address;

    public Hospitalstaff(int id, String firstname, String lastname, String address) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void printinfo() {
        System.out.println("{" +
                "\nid=" + id +
                "\nfirstname='" + firstname + '\'' +
                "\nlastname='" + lastname + '\'' +
                "\naddress='" + address + '\'' +
                "\n*******************************}");
    }
}
