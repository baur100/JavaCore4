package Class11July1;

public class CW11Jul1 {
    public static void main(String[] args) {
        Address office = new Address("Office AddressLine1","San Jose","California",95031,false);
        office.printAddress();

        Address dentalOffice = new Address();
        dentalOffice.setAddressLine("124 ABCD");

        String[] subj = {"Math", "Hist", "Sociology","ComputerScience"};
        Address toddAdd = new Address("342 afsew","Boston","MC",32423,false);
        Student todd = new Student("Todd","Simons",subj,"Biology",toddAdd);

        System.out.println("arr");
        String[] arr = todd.getSubjects();
        for (String v:arr) { System.out.println(v); }

        String strLastName = "Morrison";
        Student dora = new Student();
        dora.setLastName(strLastName);
        dora.setMajor("Math");
        dora.setSubjects(new String[]{"History","Geometry","Algebra","Calculus"});
        dora.setFirstName("Dora");
        dora.setAddress(new Address("123 qwert St","Qwerty","TX",56740,true));
        System.out.println("Set");dora.printInfo();

    }


}
