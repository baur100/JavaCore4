package hw11hh;

import l11.Student;

public class Apphw11hh {
    public static void main(String[] args) {
        Supplies ps100Supplies = new Supplies("Pencils", 50);
        String [] ps100Teachers = {"Ms. Finklestein", "Mr. Rosenthal", "Mrs. Jones", "Ms. Donovan"};
        School ps100 = new School("Coney Island", "P.S. 100", ps100Supplies, ps100Teachers);
        ps100.printSchoolInfo();

        System.out.println("******************************************");

        Supplies ps20Supplies = new Supplies ("Notebooks", 10);
        String [] ps20Teachers = {"Ms. Leathers", "Ms. Charles", "Ms. Saez", "Mr. Hampton"};
        School ps20 = new School("Clinton Hill", "P.S. 20", ps20Supplies, ps20Teachers);

        String [] teachers = ps20.getTeachers();
        for (String names : teachers) {
            System.out.println(names);
        }

        ps20.printSchoolInfo();

        System.out.println("******************************************");

        String[] ps20Students = {"Francesca", "Linda", "Steven", "Josh", "Alexander"};
        Teacher class216Teacher = new Teacher ("Melanie", "Leathers", 45, true);
        Classroom class216 = new Classroom("3-216", ps20Students, class216Teacher, 2);

        class216.printClassroom();

        System.out.println("******************************************");

        String[] fitStudents = {"Jose", "Maryann", "Jen", "Kosta", "Yelena"};
        Teacher fitTeacher = new Teacher("Paul", "Milton", 33, false);
        Classroom room505 = new Classroom("Design Class", fitStudents, fitTeacher, 5);

        room505.printClassroom();

    }
}
