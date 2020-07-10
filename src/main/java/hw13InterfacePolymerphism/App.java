package hw13InterfacePolymerphism;

public class App {
    public static void main(String[] args) {
        FlowerBox note = new Peony("Peony Inc", "Russia", "White", 15, 70);
        note.FlowerBoxNote();

        FlowerBox note1 = new Rose("Amore", "Italy", "Pink", 25, 100);
        note1.FlowerBoxNote();

        FlowerBox size = new Peony("Peony Inc", "Russia", "White", 15, 70);
        size.FlowerBoxSize();

        FlowerBox size1 = new Rose("Amore", "Italy", "Pink", 25, 100);
        size1.FlowerBoxSize();

        }
    }


// Create an interface and 2 classes which implements it
//Create 2 objects of each class
//Assign one object to interface type