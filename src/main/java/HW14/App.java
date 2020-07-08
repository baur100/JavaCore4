package HW14;

public class App {
    public static void main(String[] args) {
        Doctor drjohn=new Doctor(1, "Salvatore", "Ferragamo", "10 Regent St", "Pediatrics");
        System.out.println("\n First Doctor's Information:");
        drjohn.printinfo();

        Doctor drellen=new Doctor(3, "Ellen", "Cornwell", "8 Jasmine Ave", "Labor & Delivery");
        System.out.println("\n Second Doctor's Information:");
        drjohn.printinfo();

        Nurse nursemary= new Nurse(2, "Mary", "Cooper", "105 Princeton Dr", "Surgery");
        System.out.println("\nFirst Nurse's Information:");
        nursemary.printinfo();

        Nurse nursesally= new Nurse(5, "Sally", "Fields", "43 Camarillo Dr", "Dentistry");
        System.out.println("\nFirst Nurse's Information:");
        nursesally.printinfo();


        Janitor paul=new Janitor(13, "Paul", "Smith", "45 Adams Blvd", "First Floor");
        System.out.println("\nFirst Janitor's Information:");
        paul.printinfo();

        Janitor christopher=new Janitor(13, "Christopher", "Warman", "4 Alexandria Ave", "Equipment");
        System.out.println("\nSecond Janitor's Information:");
        paul.printinfo();

    }
}
