package Homework15;

public class MyApp {
    public static void main(String[] args) {
        Clock wallClock = new Clock("citizen", "A123", 20);
        wallClock.BatteryStandard();
        RemoteController roku = new RemoteController("Roku", "TV", "Android");
        roku.BatteryStandard();
    }
}
