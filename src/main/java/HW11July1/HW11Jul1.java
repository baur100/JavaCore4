package HW11July1;

public class HW11Jul1 {

    public static void main(String[] args) {

        Professor prof1 = new Professor();
        Courses c1 = new Courses();
        Student stud1 = new Student();


    String[] co1 = {"English","Grammar","Poetry","Prose","Botany", "Zoology", "Philosophy", "Sociology", "Psychology", "Chemistry", "Fitness", "Music", "Fashion"};

    //        Class
        Courses c2 = new Courses(co1,"all",false,1500.80,70,"Qwerty");
//        c2.printInfo();
        String[] coursesHandled1 = {"English","Grammar","Poetry","Prose"};


//        Class
        Professor prof2 = new Professor("Peter","Paul",coursesHandled1,true,c2);
        System.out.println("\nProfessor Details: \n");
        prof2.printProfInfo();

        String[] courseList1 = {"Grammar","Sociology","Music","Philosophy","Psychology"};
//        Class
        Student stud2 = new Student("John","Morisson",courseList1,1,4500.500,true,c2);
        System.out.println("\nStudent Details: \n");
        stud2.printStudInfo();
    }
}
