package hw9;

import javax.sound.midi.Soundbank;

public class App {

    public static void main(String[] args) {


        System.out.println("-----------CellPhone-------------------------");

        CellPhone nokia = new CellPhone();
        CellPhone motorola = new CellPhone();

        motorola.signal = "LTE";
        motorola.operationSoftware = "Android";

        nokia.signal ="GSM";
        nokia.operationSoftware ="Linux";

        System.out.println("This phone signal works on " + motorola.signal);
        System.out.println("And it's operates on "+motorola.operationSoftware);
        System.out.println("This phone works only on "+nokia.signal);
        System.out.println("And it's operates on "+nokia.operationSoftware);

        System.out.println("-------------Computer-------------------------");

        Computer dell = new Computer();
        Computer mac = new Computer();

        dell.model = "GM 213";
        dell.madeInYear = "2020";

        mac.model = "Air";
        mac.madeInYear = "2019";
        System.out.println("This PC is "+dell.model);
        System.out.println("and it was made on "+dell.madeInYear);
        System.out.println("This PC is "+mac.model);
        System.out.println("and it was made on "+dell.madeInYear);

        System.out.println("-------------Monitor-------------------------");

        Monitor sony = new Monitor();
        Monitor asus =  new Monitor();

        sony.size = "121 inc";
        sony.price = "200 $";

        asus.size = "134 inc";
        asus.price = "400 $";

        System.out.println("This monitor has size "+ sony.size);
        System.out.println("and its price is "+sony.price);
        System.out.println("This monitor has size "+ asus.size);
        System.out.println("and its price is "+asus.price);

        System.out.println("-------------WashingMachine--------------------");

        WashingMachine philips = new WashingMachine();
        WashingMachine delonghi = new WashingMachine();

        philips.capacity = "12 L";
        philips.programs = "Automatic";

        delonghi.capacity = "13 L";
        delonghi.programs = "Manual";

        System.out.println("This machine has capacity of " + philips.capacity);
        System.out.println("and its operates on "+ philips.programs +" program");
        System.out.println("This machine has capacity of " + delonghi.capacity);
        System.out.println("and its operates on "+ delonghi.programs +" program");

    }

}
