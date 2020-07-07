package HW11;

public class MyApp {
    public static void main(String[] args) {
        Address orlando = new Address("123 Test St", "Orlando", "FL", 32819);
        //orlando.getAddress();
        Address california = new Address("255 Labor St", "San Francisco", "CA", 300300);
        //california.getAddress();

       String[] dep = {"IT", "Management", "CallCenter", "Accountant"};
       Company google = new Company("Google", dep, orlando);
        System.out.println("------------First Company--------------");
       google.getCompanyInfo();
       String[] dep1 = {"IS", "IT", "Management", "QA"};
       Company apple = new Company("Apple", dep1, california);
        System.out.println("---------------Second Company--------------");
       apple.getCompanyInfo();
    }
}
