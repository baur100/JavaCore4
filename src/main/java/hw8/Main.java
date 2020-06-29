package hw8;

public class Main {
    public static void main(String [] args){
        Figure square = new Figure();
        square.name = "Square";
        square.color = "Red";

        System.out.println(square.color + " " + square.name);
        square.changeColor("White");
        System.out.println(square.color + " " + square.name);
        square.presentation();

        Figure star = new Figure();
        star.name = "Star";
        star.color = "Gold";

        System.out.println(star.color + " " + star.name);
        star.changeColor("Green");
        System.out.println(star.color + " " + star.name);
        star.presentation();

        Furniture sofa = new Furniture();
        sofa.name = "Sofa";
        sofa.color = "Brown";
        sofa.material = "leather";

        System.out.println(sofa.color + " " + sofa.material + " " + sofa.name);
        System.out.println("Material: " + sofa.getMaterial());
        sofa.setColor("Black");
        System.out.println(sofa.color + " " + sofa.name);


        Furniture table = new Furniture();
        table.name = "Table";
        table.color = "White";
        table.material = "wooden";

        System.out.println(table.color + " " + table.material + " " + table.name);
        System.out.println("Material: " + table.getMaterial());
        table.setColor("Grey");
        System.out.println(table.color + " " + table.name);

        CellPhone iphone = new CellPhone();
        iphone.type = "iPhone";
        iphone.color = "White";
        iphone.model = "x";

        System.out.println(iphone.color + " " + iphone.type + " " + iphone.model);

        iphone.call();
        iphone.turnOn();

        CellPhone smartphone = new CellPhone();
        smartphone.type = "Smartphone";
        smartphone.color = "Black";
        smartphone.model = "Galaxy 7";

        System.out.println(smartphone.color + " " + smartphone.type + " " + smartphone.model);

        smartphone.call();
        smartphone.turnOn();

        Clothes dress = new Clothes();
        dress.type = "Dress";
        dress.color = "Blue";
        dress.size = "XS";

        dress.presentation();
        dress.changeSize("L");
        dress.presentation();

        Clothes skirt = new Clothes();
        skirt.type = "Skirt";
        skirt.color = "Green";
        skirt.size = "XS";

        skirt.presentation();
        skirt.changeSize("L");
        skirt.presentation();
    }
}
