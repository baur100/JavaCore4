package l11;

public class App {
    public static void main(String[] args) {
        Address office = new Address("125 Lincoln Pl","New York","NY",10015,false);
//        office.printAddress();

        Address dentalOffice = new Address();
        dentalOffice.setAddressLine("124 aaaaaaa");

        String[] subjs= {"Math","History","Sociology","ComputerScience"};
        Address toddAddress = new Address("34 Liberty ave", "Boston", "MA", 44444,true);
        Student todd = new Student("Todd","Simmons",subjs,"Biology",toddAddress);
        String[] arr = todd.getSubjects();
//        for (String v:arr){
//            System.out.println(v);
//        }
        todd.printInfo();

        String str = "Morrison";
        Student dora= new Student();
        dora.setLastName(str);
        dora.setMajor("Math");
        dora.setSubjects(new String[]{"History","Geometry","Math","Calculus"});
        dora.setName("Dora");
        dora.setAddress(new Address("76 Middle st", "Paterson","NJ",70894,true));

        dora.printInfo();
    }
}
