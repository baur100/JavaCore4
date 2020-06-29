package HW8;

public class Job {

    public String JobName;
    public double HourlyRate;

    public void JobDescription(boolean IsPositionOpen){
        System.out.println("Position Title: " + JobName + " pay rate is: " + HourlyRate + " Per hour. " + "Is position open? " + IsPositionOpen);

    }
}
