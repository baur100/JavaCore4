package HW11;

import org.w3c.dom.ls.LSOutput;

public class App {
    public static void main(String[] args) {

        //Bill 1
        Bills bill2019=new Bills();
        bill2019.setBillid(1);
        bill2019.setDescription("Salaries");
        bill2019.setBillamount(100000);
        System.out.println("\nBill 1");

        bill2019.printBillInfo();


        //Bill 2
        Bills bill2020=new Bills(2, "Utilities", 500000);
        System.out.println("\nBill 2");
        bill2020.printBillInfo();

        //Governor 1
        Governor governor1=new Governor();
        governor1.setGovernorid(8);
        governor1.setGovernorname("Newsome");
        System.out.println("\nGovernor 1");
        governor1.printGovernorInfo();


        Governor governor2=new Governor(5,"Schwarzenegger");
        System.out.println("\nGovernor 2");
        governor2.printGovernorInfo();

        //County 1
        String[] districtslist= {"Beverly Hills", "Santa Monica", "Malibu"};
        County countyB = new County(5, "Los Angeles", districtslist, new Bills(3,"Water", 1000));
        String[] list1=countyB.getDistricts();
        System.out.println("\nCounty 1");
        countyB.printCountyInfo();


        //County 2
        String[] districtslist2={"Escondido", "La Jolla"};
        County countyC= new County(6, "San Diego", districtslist2, new Bills(9, "Power", 54000));
        System.out.println("\nCounty 2");
        countyC.printCountyInfo();

        //State1
        String[] state1cities={"San Fran", "LA", "Sacramento"};
        State cali=new State(50, "California", 50000000,state1cities, new Governor(1, "Newsome"));
        System.out.println("\nState 1");
        cali.printStateInfo();

        //State2
        String[] state2cities={"Long Island", "Queens", "Bronx"};
        State ny=new State(1, "New York", 10000000, state2cities, new Governor(50, "Cuomo"));
        System.out.println("\nState 2");
        ny.printStateInfo();
    }





}
