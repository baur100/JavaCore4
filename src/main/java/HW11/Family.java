package HW11;

public class Family {
    private String maritalStatus;
    private int children;

    public Family (String maritalStatus, int children){
        this.maritalStatus = maritalStatus;
        this.children = children;
    }

    public Family (){}

    public void setMaritalStatus (String maritalStatus){
        this.maritalStatus = maritalStatus;
    }

    public void setChildren (int children){
        this.children = children;
    }

    public String getMaritalStatus (){
        return maritalStatus;
    }

    public int getChildren (){
        return children;
    }

    public void getInfo (){
        System.out.println("Marital Status: " + maritalStatus +
                "\nChildren: " + children);
    }
}
