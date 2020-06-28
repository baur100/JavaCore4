package June27HomeWork9;

public class JobSearchWebsite {
    public String jobType;
    public String jobLevel;
    public int expectedExp;
    public String companyName;
    public double payPerHr;

    public void jobRequirement(){
        System.out.println("\n"+jobType+", "+jobLevel+" with "+expectedExp+" is required at "+companyName+" for a pay of "+payPerHr);
    }

}
