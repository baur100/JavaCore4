package HW12;

import java.util.Arrays;

public class ManualQA extends ItSpecialist {

    protected int age;
    protected String[] responsibilities;

    public ManualQA(String name, String lastName, String position, int age, String [] responsibilities) {
        super(name, lastName, position);
        this.age = age;
        this.responsibilities = responsibilities;

    }

    public ManualQA() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int city) {
        this.age = age;
    }

    public String[] getResponsibilities() {
        return responsibilities;
    }

        public void setResponsibilities (String[]responsibilities){
            this.responsibilities = responsibilities;
        }

        public void printManuaQAInfo() {

        super.printItSpecialistInfo();

            System.out.println("\nManualQA: " + "\nAge: " + age + "\nResponsibilities: " + Arrays.toString(responsibilities));
        }
}
