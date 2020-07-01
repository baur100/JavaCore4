package hw10;

public class App {

    public static void main(String[] args) {


        System.out.println("----------CellPhone---------------------");

        CellPhone nokia = new CellPhone("GSM", "Android", 150);
        nokia.printData();

        CellPhone sony = new CellPhone("LTE", "Linux", 400);
        sony.printData();


        System.out.println(nokia.getOperationSoftware());
        nokia.setOperationSoftware("Android");

        System.out.println(nokia.getPrice());
        nokia.setPrice(150);

        System.out.println(nokia.getSignal());
        nokia.setSignal("GSM");


        System.out.println(sony.getOperationSoftware());
        nokia.setOperationSoftware("Linux");

        System.out.println(sony.getPrice());
        nokia.setPrice(400);

        System.out.println(sony.getSignal());
        nokia.setSignal("LTE");


        System.out.println("----------Computer-----------------------");

        Computer dell = new Computer (2000, 2020, "Intel");
        dell.printData();

        Computer mac = new Computer(12, 2019, "Core");
        mac.printData();


        System.out.println(dell.getCPU());
        dell.setCPU("Intel");

        System.out.println(dell.getModel());
        dell.setModel(2000);

        System.out.println(dell.getMadeInYear());
        dell.setMadeInYear(2019);

        System.out.println(mac.getCPU());
        dell.setCPU("Core");

        System.out.println(mac.getModel());
        dell.setModel(12);

        System.out.println(mac.getMadeInYear());
        dell.setMadeInYear(2019);



        System.out.println("----------Monitor-------------------------");

        Monitor asus = new Monitor(30,250, 30);
        asus.printData();

        Monitor motorolla = new Monitor (50,600, 54 );
        motorolla.printData();


        asus.setInches(35);
        System.out.println(asus.getInches());

        asus.setSize(35);
        System.out.println(asus.getSize());

        asus.setPrice(270);
        System.out.println(asus.getPrice());

        motorolla.setInches(50);
        System.out.println(motorolla.getInches());

        asus.setSize(600);
        System.out.println(motorolla.getSize());

        asus.setPrice(54);
        System.out.println(motorolla.getPrice());




        System.out.println("----------WashingMachine------------------");

        WashingMachine philips = new WashingMachine(30, "Automatic", 300);
        philips.printData();

        WashingMachine indesit = new WashingMachine(40,"Semi", 400);
        indesit.printData();

        System.out.println(philips.getCapacity());
        philips.setCapacity(34);

        System.out.println(philips.getPrograms());
        philips.setPrograms("Automatic");

        System.out.println(philips.getPrice());
        philips.setPrice(230);

        System.out.println(indesit.getCapacity());
        philips.setCapacity(40);

        System.out.println(indesit.getPrograms());
        philips.setPrograms("Semi");

        System.out.println(indesit.getPrice());
        philips.setPrice(4000);

    }
}
