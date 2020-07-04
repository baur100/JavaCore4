package HW11;

public class Employee {
    private String name;
    private Date hireDate;
    private Family familyStatus;
    private String [] awards;

    public Employee (String name, Date hireDate, Family familyStatus, String[] awards){
        this.name = name;
        this.hireDate = hireDate;
        this.familyStatus = familyStatus;
        this.awards = awards;
    }

    public Employee(){}

    public String getName() {
        return name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public Family getFamilyStatus() {
        return familyStatus;
    }

    public String[] getAwards() {
        return awards;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setFamilyStatus(Family familyStatus) {
        this.familyStatus = familyStatus;
    }

    public void setAwards(String[] awards) {
        this.awards = awards;
    }

    public void printInfo (){
        System.out.println("Name: " + name);
        System.out.println("Hired on: ");
        this.hireDate.printDate();
        this.familyStatus.getInfo();
        System.out.println("Awards:");
        for (String v:awards){
            System.out.println(v);
        }

    }
}
