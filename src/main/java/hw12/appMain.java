package hw12;

import java.security.Key;

public class appMain {
    public static void main(String[] args) {

            Computer dell = new Computer("NBHG", "234MH");
            Computer mac =  new Computer ("JBV089", "234MH");

            dell.printComputer();
            mac.printComputer();

            Keyboard assus = new Keyboard ("HBYV23", "34NM");
            Keyboard samsung = new Keyboard ("HBB76", "34NM");

            assus.printComputer();
            samsung.printComputer();

            Monitor panasonic = new Monitor ("NHG98", "123MH");
            Monitor sony = new Monitor ("JHG123", "124MH");

            panasonic.printComputer();
            sony.printComputer();

            Mouse microsoft = new Mouse ("156", "34M");
            Mouse motorolla = new Mouse ("45J", "23M");

            microsoft.printComputer();
            motorolla.printComputer();

            Speakers logitech = new Speakers ("NEXT","45MH");
            Speakers sanyo = new Speakers ("BEST123", "65MH");

            logitech.printComputer();
            samsung.printComputer();


    }

}
