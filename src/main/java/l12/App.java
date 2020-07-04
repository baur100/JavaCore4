package l12;

public class App {
    public static void main(String[] args) {
        Address studentAddress = new Address("112 Lincoln ave","Little Pony", "MO",12123,true);
        String[] subjects = {"Math","History","Yoga"};
        Address collegeAddress = new Address("85 Liberty st", "Boston","MO",12123,false);
        College bostonCollege = new College("Boston College", collegeAddress);
        Student peter = new Student("Peter","Samir",studentAddress,subjects,"Biology",bostonCollege);

        Address annaAddress = new Address("78 Huston ct","Boston","MO",21212,true);
        Teacher mrsDunkin = new Teacher("Anna","Dunkin",annaAddress,bostonCollege,"Biology");

        peter.printStudent();
        mrsDunkin.printTeacher();

        System.out.println(peter.getLastName());

    }
}
