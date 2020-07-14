package hw16;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;
    private InsuranceCompanies insuranceAccepted;



    public Doctor(String name, String lastName, Position position, InsuranceCompanies insuranceAccepted) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.insuranceAccepted = insuranceAccepted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public InsuranceCompanies getInsuranceAccepted() {
        return insuranceAccepted;
    }

    public void setInsuranceAccepted(InsuranceCompanies insuranceAccepted) {
        this.insuranceAccepted = insuranceAccepted;
    }




    public void doctorPrint() {

        System.out.println(this.name+this.lastName+this.position+ " " +this.insuranceAccepted);

    }

}

