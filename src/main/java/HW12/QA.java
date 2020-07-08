package HW12;

public class QA extends Employee{
    private String team;

    public QA(String name, String lastName, String job, String team) {
        super(name, lastName, job);
        this.team = team;
    }
    public void getQaInfo(){
        System.out.println("Student name= " + name + "\nStudent last name= " + lastName + "\nJob= " + job + "\nTeam Name = " + team);
    }
}
