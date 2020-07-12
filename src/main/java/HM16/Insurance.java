package HM16;

public class Insurance {
    private InsuranceCompanies insurance;

    public Insurance(InsuranceCompanies insurance) {
        this.insurance = insurance;
    }

    public InsuranceCompanies getInsurance() {
        return insurance;
    }

    public void setInsurance(InsuranceCompanies insurance) {
        this.insurance = insurance;
    }
    protected void printInsurance(){
        System.out.println(this.insurance);
    }
}
