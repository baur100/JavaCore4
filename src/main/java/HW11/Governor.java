package HW11;

public class Governor {
    private int governorid;
    private String governorname;

    public Governor(int governorid, String governorname) {
        this.governorid = governorid;
        this.governorname = governorname;
    }

    public Governor(){

    }


    public int getGovernorid() {
        return governorid;
    }

    public void setGovernorid(int governorid) {
        this.governorid = governorid;
    }

    public String getGovernorname() {
        return governorname;
    }

    public void setGovernorname(String governorname) {
        this.governorname = governorname;
    }

    public void printGovernorInfo(){
        System.out.println("This governor's id is " + this.getGovernorid());
        System.out.println("This governor's name is " + this.getGovernorname());


    }
}
