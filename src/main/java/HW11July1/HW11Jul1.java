package HW11July1;

public class HW11Jul1 {

    public static void main(String[] args) {

        Professor prof1 = new Professor();
        Courses c1 = new Courses();
        Student stud1 = new Student();


    String[] co1 = {"English","Grammar","Poetry","Prose","Botany", "Zoology", "Philosophy", "Sociology", "Psychology", "Chemistry", "Fitness", "Music", "Fashion"};

    //        Class
        Courses c2 = new Courses(co1,"all",false,1500.80,70);
        c2.printInfo();
        String[] coursesHandled1 = {"English","Grammar","Poetry","Prose"};


//        Class
        Professor prof2 = new Professor("Peter","Paul",coursesHandled1,"QWERTY",c2);
        prof2.printInfo();
//        String studFirstName, String studLastName, String[] listOfCourses, int semesterNumber, double feeDue, Courses coursesEnrolled
        String[] courseList1 = {"Grammar","Sociology","Music","Philosophy","Psychology"};

//        Class
        Student stud2 = new Student("John","Morisson",courseList1,1,4500.500,c2);
        stud2.printInfo();




    }
}
