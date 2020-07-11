package hw11;

public class Travel {
    Time departure;
    Student [] students;

    public Travel(){}

    public Travel(Time departure, Student[] students) {
        setDeparture(departure);
        setStudents(students);
    }

    public Time getDeparture() {
        return departure;
    }

    public void setDeparture(Time departure) {
        this.departure = departure;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void printInfo(){
        System.out.print("Departure:");
        this.departure.printInfo();
        System.out.println("Group of students: ");
        for(Student st: students){
            st.printInfo();
        }
    }
}
