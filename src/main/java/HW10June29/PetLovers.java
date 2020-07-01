package HW10June29;

public class PetLovers {
    private String firstName;
    private String lastName;
    private String petRequired;
    private double petCostBudget;

    public PetLovers(){}

    public PetLovers(String firstName, String lastName, String petRequired, double petCostBudget){
        this.firstName = firstName;
        this.lastName = lastName;
        this.petRequired = petRequired;
        this.petCostBudget = petCostBudget;
    }

    public PetLovers(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printInfo(){
        System.out.println("\nThe Customer "+firstName+" "+lastName+" is looking out for a "+petRequired+" worth $"+petCostBudget);
    }

    public void setFirstName(String firstName){ this.firstName = firstName; }
    public String getFirstName(){ return this.firstName; }

    public void setLastName(String lastName){ this.lastName = lastName; }
    public String getLastName(){ return this.lastName; }

    public void setPetRequired(String petRequired){ this.petRequired = petRequired; }
    public String getPetRequired(){ return this.petRequired; }

    public void setPetCostBudget(double petCostBudget){ this.petCostBudget = petCostBudget; }
    public double getPetCostBudget(){ return this.petCostBudget; }

    public void printDetails(){
        System.out.println("\nFirst Name: "+getFirstName()+"\nLast Name: "+getLastName()+"\nPet Type: "+getPetRequired()+"\nPet Budget: "+getPetCostBudget());
    }


}
