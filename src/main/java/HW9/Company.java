package HW9;

public class Company {
    private String nameOfCompany;
    private int year;
    private String type;

    public Company(String nameOfCompany, int year, String type){
        this.nameOfCompany = nameOfCompany;
        this.year = year;
        this.type = type;
    }

    public Company(){
    }

    public void setNameOfCompany(String nameOfCompany){
        this.nameOfCompany=nameOfCompany;
    }
    public String getNameOfCompany(){
        return nameOfCompany;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public void setType(String type){
        this.type=type;
    }

    public void printCompanyInfo(){
        System.out.println("Name of Company= " + nameOfCompany +"\nYear= " + year + "\nCompany Type= " + type);
    }

}
