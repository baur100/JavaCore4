package HW13Jul6;

public class ComputerShowRoom {
    public static void main(String[] args) {
        Desktop d1 = new Desktop(true,8,1024,"pentium 7","HardDrive","latest","Linux",true,1599.00);

        Laptop l1 = new Laptop(true,16,2048,"pentium four","Solid State Drive","latest","Unix",true,1599.99);
        l1.setHeight(10); l1.setLength(18); l1.setWidth(1); l1.setWeight(1.5);
        System.out.println("");
        l1.prodArea();
        System.out.println("");
        l1.prodVolume();
        System.out.println("");
        l1.prodDensity();

        Tablet t1 = new Tablet(true,6,256,"latest","Solid State Drive","latest","iOS",true,599.99);
        t1.setHeight(8); t1.setLength(12); t1.setWidth(1); t1.setWeight(0.9);
        System.out.println("");
        t1.prodArea();
        System.out.println("");
        t1.prodVolume();
        System.out.println("");
        t1.prodDensity();

        MobilePhone mp1 = new MobilePhone(true,4,120,"latest","Solid State Drive","latest","Windows",true,799.99);
        mp1.setHeight(4); mp1.setLength(8); mp1.setWidth(1); mp1.setWeight(0.5);
        System.out.println("");
        mp1.prodArea();
        System.out.println("");
        mp1.prodVolume();
        System.out.println("");
        mp1.prodDensity();

        SystemConfig[] sysConfig = {d1,l1,t1,mp1};
        System.out.println("\n foreach loop");

        for (SystemConfig array :sysConfig) {
            System.out.println(array.prodArea());
            System.out.println(array.prodVolume());
            System.out.println(array.prodDensity());
        }



    }
}
