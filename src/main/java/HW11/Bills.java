package HW11;

public class Bills {
    private int billid;
    private String description;
    private int billamount;


    public Bills(int billid, String description, int billamount) {
        this.billid = billid;
        this.description = description;
        this.billamount = billamount;
    }

    public Bills() {

    }

    public int getBillid() {
        return billid;
    }

    public void setBillid(int billid) {
        this.billid = billid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBillamount() {
        return billamount;
    }

    public void setBillamount(int billamount) {
        this.billamount = billamount;
    }

    public void printBillInfo(){
        System.out.println("Bill amount is " + this.getBillamount());
        System.out.println("Bill description is " + this.getDescription());
        System.out.println("Bill ID is " + this.getBillid());

    }
}
