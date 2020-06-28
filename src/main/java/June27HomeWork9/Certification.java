package June27HomeWork9;

public class Certification {
    public String certificationName;
    public String levelForCertification;
    public double passingScore;
    public double certificationFee;

    public void certificationDetails(){
        System.out.println("\nThe passing score of the "+certificationName+", "+levelForCertification+" worth $"+certificationFee+" is "+passingScore);
    }

}
