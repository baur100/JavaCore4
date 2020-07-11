package hw11;

public class Lesson{
    Time startTime;
    Time endTime;
    Student [] students;

    public Lesson(){}

    public Lesson(Time startTime, Time endTime, Student[] students) {
        setStartTime(startTime);
        setEndTime(endTime);
        setStudents(students);
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void printInfo(){
        System.out.println("Lesson:");
        System.out.print("Start: ");
        this.startTime.printInfo();
        System.out.print("End: ");
        this.endTime.printInfo();
        System.out.println("Group of students: ");
        for(Student st: students){
            st.printInfo();
        }
    }
}

