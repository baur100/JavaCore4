package HW11;

public class County {
    private int countyid;
    private String countyname;
    private String[] districts;
    private Bills billyear1;

    public County(int countyid, String countyname, String[] districts, Bills billyear1) {
        this.countyid = countyid;
        this.countyname = countyname;
        this.districts = districts;
        this.billyear1 = billyear1;
    }


    public County() {
    }

    public int getCountyid() {
        return countyid;
    }

    public void setCountyid(int countyid) {
        this.countyid = countyid;
    }

    public String getCountyname() {
        return countyname;
    }

    public void setCountyname(String countyname) {
        this.countyname = countyname;
    }

    public String[] getDistricts() {
        return districts;
    }

    public void setDistricts(String[] districts) {
        this.districts = districts;
    }

    public Bills getBillyear1() {
        return billyear1;
    }

    public void setBillyear1(Bills billyear1) {
        this.billyear1 = billyear1;
    }

    public void printCountyInfo(){
        System.out.println("The county id is " + this.getCountyid());
        System.out.println("the county name is " + this.getCountyname());
        System.out.println("The county districts are:");
        for (String v:this.getDistricts()             ) {
            System.out.println(v);
                    }
        this.billyear1.printBillInfo();


    }
}
