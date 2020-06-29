package hw9;



public class Hw9 {
    public static void main(String[] args) {

        Flower rose = new Flower();
        rose.name = "Rose";
        rose.color = "Red";
        rose.scent = "Sweet";

        rose.hello("Rose");

        Flower peony = new Flower();
        peony.name = "Peony";
        peony.color = "Pink";
        peony.scent = "Dewy";

        peony.hello("Peony");

        Dog coco = new Dog();
        coco.nickname = "Coco";
        coco.breed = "English terrier";
        coco.owner = "Lucy Loflin";
        coco.age = 1;

        coco.hi("Coco");

        Dog buddy = new Dog();
        buddy.nickname = "Buddy";
        buddy.breed = "German sheppard";
        buddy.owner = "Aaron Lenovski";
        buddy.age = 2;

        buddy.hi("Buddy");

        Butterfly machaon = new Butterfly();
        machaon.specie = "Machaon";
        machaon.coloring = "golden and blue";

        machaon.hihi("Machaon");

        Butterfly monarch = new Butterfly();
        monarch.specie = "Monarch";
        monarch.coloring = "orange and brown";

        monarch.hihi("Monarch");

        Book threeMusketeers = new Book();
        threeMusketeers.title = "Three Musketeers";
        threeMusketeers.author = "Alexandre Dumas";
        threeMusketeers.genre = "historical novel";

        threeMusketeers.helloo("Three Musketeers");

        Book sherlockHolmes = new Book();
        sherlockHolmes.title = "Sherlock Holmes";
        sherlockHolmes.author = "Arthur Conan Doyle";
        sherlockHolmes.genre = "crime fiction";

        sherlockHolmes.helloo("Sherlock Holmes");

    }
}









