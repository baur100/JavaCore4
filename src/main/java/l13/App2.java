package l13;

public class App2 {
    public static void main(String[] args) {
        DesktopLight bonjour = new DesktopLight("Brandy","New Model", 50);

        bonjour.bulbStandard();
        bonjour.plugStandard();

        Bulb lamp = new DesktopLight("Suppper", "Ne x-1",25);

    }
}
