package June27HomeWork9;

public class HomeWork9June27 {
    public static void main(String[] args) {

        JobSearchWebsite job1 = new JobSearchWebsite();
        job1.jobType = "Software Engineer";
        job1.jobLevel = "Senior";
        job1.expectedExp = 6;
        job1.companyName = "ABC";
        job1.payPerHr = 80.90;

        JobSearchWebsite job2 = new JobSearchWebsite();
        job2.jobType = "Business Analyst";
        job2.jobLevel = "Junior";
        job2.expectedExp = 1;
        job2.companyName = "XYZ";
        job2.payPerHr = 30.50;

        System.out.println("\n\nJobs available: ");
        job1.jobRequirement();
        job2.jobRequirement();


        Candidate c1 = new Candidate();
        c1.firstName = "Nadia";
        c1.lastName = "Jack";
        c1.qualification = "MSc.";
        c1.yrsOfExp = 7;
        c1.payPerHr = 90.89;
        c1.candidateDetails();
        System.out.println("\n\nThe annual salary for "+c1.firstName+" "+c1.lastName+" is "+c1.candidateAnnualSalary(c1.payPerHr));

        Candidate c2 = new Candidate();
        c2.firstName = "Shane";
        c2.lastName = "John";
        c2.qualification = "MBA";
        c2.yrsOfExp = 1;
        c2.payPerHr = 35.89;
        c2.candidateDetails();
        System.out.println("\n\nThe annual salary for "+c2.firstName+" "+c2.lastName+" is "+c2.candidateAnnualSalary(c1.payPerHr));

        Certification cert1 = new Certification();
        cert1.certificationName="Sun Microsoft certification";
        cert1.levelForCertification="Basic Level";
        cert1.passingScore = 85;
        cert1.certificationFee = 450;
        cert1.certificationDetails();

        Certification cert2 = new Certification();
        cert2.certificationName="Six sigma certification";
        cert2.levelForCertification="Advanced Level";
        cert2.passingScore = 80;
        cert2.certificationFee = 350;
        cert2.certificationDetails();

        Training train1 = new Training();
        train1.trainingName = "Software";
        train1.trainingLevel = "Basic Level";
        train1.trainingType = "Basic";
        train1.trainingSpan = 8;
        train1.trainingFee = 1199;
        train1.trainingDetails();

        Training train2 = new Training();
        train2.trainingName = "Business";
        train2.trainingLevel = "Basic Level";
        train2.trainingType = "Six sigma";
        train2.trainingSpan = 4;
        train2.trainingFee = 199;
        train2.trainingDetails();

    }
}
