package hw10;

public class AppHW10 {
    public static void main(String[] args) {
        PersonalData deejah = new PersonalData("Deejah", "Rios",23);
        deejah.printInfo();
        System.out.println("************************");
        deejah.setAge(30);
        System.out.println(deejah.getAge());
        System.out.println("************************");


        Pet kitty = new Pet("Cat", "Kitty", 2);
        kitty.petInfo();
        System.out.println("************************");
        kitty.setNumberOfPet(3);
        System.out.println(kitty.getNumberOfPet());
        System.out.println("************************");

        Workout workoutSession = new Workout("Weekly Workout", "Septermber", 4);
        workoutSession.printWorkoutInfo();
        System.out.println("************************");
        workoutSession.setSkipDays(9);
        System.out.println(workoutSession.getSkipDays());
        System.out.println("************************");

        DietInfo eatingHabit = new DietInfo("Beef","Supper", 1000);
        eatingHabit.printDietInfo();
        System.out.println("************************");
        eatingHabit.setCalories(1500);
        System.out.println(eatingHabit.getCalories());




    }
}
