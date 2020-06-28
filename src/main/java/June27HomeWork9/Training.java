package June27HomeWork9;

public class Training {
    public String trainingName;
    public String trainingLevel;
    public String trainingType;
    public double trainingSpan;
    public double trainingFee;

    public void trainingDetails(){
        System.out.println("\nThe "+trainingLevel+" for "+trainingType+" "+trainingName+" for a span of "+trainingSpan+" weeks is "+trainingFee);
    }
}
