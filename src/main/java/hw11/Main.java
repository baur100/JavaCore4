package hw11;

public class Main {
    public static void main(String []args){
        Time start = new Time(10,00);
        Time end = new Time(11,00);
        Student [] students = new Student[3];
        students[0] = new Student("Veronica","Bykova","123456789");
        students[1] = new Student("John", "Johnson","987654321");
        students[2] = new Student("Louis","Peterson","159357456");
        //one object of each class
        Lesson lesson = new Lesson(start,end,students);
        Travel travel = new Travel(start, students);
        lesson.printInfo();
        System.out.println();
        System.out.println("Travel");
        travel.printInfo();
        System.out.println();

        start = new Time(15,30);
        end = new Time(18,30);
        Student [] students2 = new Student[5];
        students2[0] = students[0];
        students2[1] = students[1];
        students2[2] = students[2];
        students2[3] = new Student("Philip","Blackman","777888999");
        students2[4] = new Student("Sarah", "Wilson", "134679258");
        //second object of each class
        Lesson lesson2 = new Lesson(start,end,students2);
        Travel travel2 = new Travel(start, students2);
        lesson2.printInfo();
        System.out.println();
        System.out.println("Travel");
        travel2.printInfo();
        System.out.println();
    }
}
