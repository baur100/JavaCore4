package hw11;

public class appMain {

    public static void main(String[] args) {

        String[] features = {"mouse", "keyboard", "cable"};
        int[] priceRanges= {34,56,332,233};
        Computer model = new Computer("NEXT2000");
        HardDrive capacity = new HardDrive("254GB");




        OS windows = new OS("NEXT2000", "254GB", features, model);
        OS mac = new OS ("Mac", "500GB", features, model);



        System.out.println("--------------OS----------------");
        windows.printOS();
        mac.printOS();

        Price fixedPrice = new Price(234, 700, priceRanges, capacity);
        Price flexiblePrice = new Price (455,444,priceRanges, capacity );


        System.out.println("--------------Price---------------");
        fixedPrice.printPrice();
        flexiblePrice.printPrice();

    }
}
