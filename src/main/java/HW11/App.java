package HW11;

public class App {
    public static void main(String[] args) {
        Date amyBirthday = new Date("August", 03, 1989);
        Date victorBday = new Date("May", 26, 1991);

        Friend amy = new Friend();
        amy.setName("Amy B.");
        amy.setDate(amyBirthday);
        amy.setHobbies(new String[]{"Card games", "Shopping"});

        amy.printFriendInfo();

        System.out.println("*************");

        Friend victor = new Friend("Victor K.", victorBday, new String []{"Table tennis", "Camping", "Fishing"});

        victor.printFriendInfo();

        System.out.println("*************");

        Date hire1 = new Date ("March", 01, 2018);
        Date hire2 = new Date();
        hire2.setMonth("January");
        hire2.setDay(15);
        hire2.setYear(2012);

        Family status1 = new Family("Widowed", 3);
        Family status2 = new Family();
        status2.setMaritalStatus("Married");
        status2.setChildren(0);

        String [] awards1 = {"License 128-M", "Winner of The Butcher 2020 Cup"};

        Employee emp1 = new Employee("Andrew Kruger", hire1, status1, awards1);

        emp1.printInfo();

        System.out.println("*************");

        Employee emp2 = new Employee();
        emp2.setName("Valera Holostyak");
        emp2.setHireDate(hire2);
        emp2.setFamilyStatus(status2);
        emp2.setAwards(new String[]{"Master of a Chainsaw 2008", "K-6 LIC"});

        emp2.printInfo();



    }
}
