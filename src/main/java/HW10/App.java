package HW10;

public class App {

    public static void main(String[] args) {
        Country UnitedStates = new Country("United States", 200000000, "English");
        UnitedStates.printInfo();
        Country Mexico = new Country();
        Mexico.setCountryName("Mexico");
        Mexico.setLanguage("Spanish");
        Mexico.setPopulation(30000000);
        System.out.println("Country name: " + Mexico.getCountryName());
        System.out.println("Official Language us: " + Mexico.getLanguage());
        System.out.println("Current popolation is: " + Mexico.getPopulation());

        System.out.println("************************");

        Planet Venus = new Planet("Venus", 2, 0);
        Venus.printInfo();
        Planet Jupiter = new Planet();
        System.out.println(Venus.toString());

        Jupiter.setPlanetName("Jupiter");
        Jupiter.setNumberOfMoons(17);
        Jupiter.setOrbitOrder(5);

        System.out.println("Planet name " + Jupiter.getPlanetName());
        System.out.println("Number of Moons " + Jupiter.getNumberOfMoons());
        System.out.println("Planet order is: " + Jupiter.getOrbitOrder());


        System.out.println("************************");

        Student Charlie = new Student("Charlie", 'A', "Java");
        Charlie.printInfo();

        Student Diana = new Student();
        Diana.setCourse("Javascript");
        Diana.setGrade('B');
        Diana.setStudentName("Diana");
        System.out.println("Course name is " + Diana.getCourse());
        System.out.println("Student name is " + Diana.getStudentName());
        System.out.println("Class Grade is " + Diana.getGrade());
        System.out.println(Diana.toString());


        System.out.println("************************");

        Vegetable Lettuce = new Vegetable("lettuce", 20, "green");
        Lettuce.printInfo();
        Vegetable Carrot = new Vegetable();
        Carrot.setVegetableName("Carrot");
        Carrot.setCalories(30);
        Carrot.setVeggieColor("orange");
        System.out.println("Veggie name is " + Carrot.getVegetableName());
        System.out.println("Veggie calories is " + Carrot.getCalories());
        System.out.println("Veggie color is " +Carrot.GetVeggieColor());


    }
}
