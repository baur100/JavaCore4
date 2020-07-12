package l13;

public class App {
    public static void main(String[] args) {
        Name annaName = new Name("Anna", "Peters");
        Address annaAddress = new Address("112 Holy st", "Tompkins town","VA",14145,true);
        String[] subj = {"Math","Biology","French Poetry"};
        Student anna = new Student(annaName,annaAddress,"Math",subj);

        Name doraName = new Name("Doris","Anderson");
        Address doraAddress = new Address("12 Mad st","Swirl city","NJ",11445,true);
        Teacher doris = new Teacher(doraName,doraAddress,"Biology");

        Person[] teachersAndStudents = {anna, doris};
    }
}
