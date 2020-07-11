package HomeWork14ArrayLists;

public class Person extends Address14 implements GroceryShop{

    private String firstName;
    private String lastName;
    private int personAge;
    private double petBudget;
    private PetDetails favPet;

    public Person(String addressLine, String city, String state, int zipCode, boolean isPrivate, String firstName, String lastName, int personAge, double petBudget/*, PetDetails favPet*/) {
        super(addressLine, city, state, zipCode, isPrivate);
        this.firstName = firstName;
        this.lastName = lastName;
        this.personAge = personAge;
        this.petBudget = petBudget;
    }



    public Person(String addressLine, String city, String state, int zipCode, boolean isPrivate, String firstName, String lastName, int personAge, double petBudget, PetDetails favPet) {
        super(addressLine, city, state, zipCode, isPrivate);
        this.firstName = firstName;
        this.lastName = lastName;
        this.personAge = personAge;
        this.petBudget = petBudget;
        this.favPet = favPet;
    }



    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPersonAge() {
        return this.personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public double getPetBudget() {
        return this.petBudget;
    }

    public void setPetBudget(double petBudget) {
        this.petBudget = petBudget;
    }

    @Override
    public String prfdFoodMaterials() {
        return null;
    }

    @Override
    public String prfdSnacks() {
        return null;
    }

    @Override
    public String prfdBeverages() {
        return null;
    }


}
