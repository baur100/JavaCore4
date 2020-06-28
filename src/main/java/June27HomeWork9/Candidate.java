package June27HomeWork9;

public class Candidate {
    public String firstName;
    public String lastName;
    public String qualification;
    public double yrsOfExp;
    public double payPerHr;

    public void candidateDetails(){
        System.out.println("\n"+firstName+" "+lastName+" with "+yrsOfExp+" of experience, "+qualification+" expects "+payPerHr+" pay per hour");
    }


    public double candidateAnnualSalary(double pPH){
        double annualSalary = pPH*40*52;
        return annualSalary;
    }


}
