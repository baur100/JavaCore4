package HW14;

public class App {
    public static void main(String[] args) {
        Doctor drjohn=new Doctor(1, "Salvatore", "Ferragamo", "10 Regent St", "Pediatrics");
        System.out.println("\nHere is the Doctor's Information:");
        drjohn.printinfo();
        Nurse nursemary= new Nurse(8, "Mary", "Cooper", "105 Princeton Dr", "Surgery");
        System.out.println("\nHere is the Nurse's Information:");
        nursemary.printinfo();
        Janitor paul=new Janitor(13, "Paul", "Smith", "45 Adams Blvd", "First Floor");
        System.out.println("\nHere is the Janitor's Information:");
        paul.printinfo();

    }
}
