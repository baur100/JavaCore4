package HW12;

public class Manager extends Employee{
    private String schedule;

    public Manager(String name, String lastName, String job, String schedule) {
        super(name, lastName, job);
        this.schedule = schedule;
    }
    public void getManagerInfo(){
        System.out.println("Manager name= " + name + "\nManager last name= " + lastName + "\nJob= " + job + "\nSchedule = " + schedule);
    }
}
