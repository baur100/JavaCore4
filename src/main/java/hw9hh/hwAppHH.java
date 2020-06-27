package hw9hh;

public class hwAppHH {
    public static void main(String[] args) {
        Child steven = new Child();
        steven.firstName = "Steven";
        steven.lastName = "Wong";
        steven.age = 8;
        steven.grade = "3rd";
        steven.intro("P.S. 100");

        System.out.println("*******************************************");

        Child julia = new Child();
        julia.firstName = "Julia";
        julia.lastName = "Simone";
        julia.age = 15;
        julia.grade = "10th";
        julia.intro("Clinton High School");

        System.out.println("*******************************************");

        Tea sencha = new Tea();
        sencha.name = "First Flush Sencha";
        sencha.type = "Green Tea";
        sencha.brewColor = "light green";
        sencha.origin = "Japan";
        sencha.firstSip();
        sencha.enjoyment();

        System.out.println("*******************************************");

        Tea longJing = new Tea();
        longJing.name = "Dragon Well";
        longJing.type = "Green Tea";
        longJing.brewColor = "light green";
        longJing.origin = "Zhejiang China";
        longJing.firstSip();
        longJing.enjoyment();

        System.out.println("*******************************************");

        Vegetable broccoli = new Vegetable();
        broccoli.name = "Broccoli";
        broccoli.color = "Green";
        broccoli.cutUpSize = "small florets";
        System.out.println(broccoli.name);
        broccoli.cook("Chicken");

        System.out.println("*******************************************");

        Vegetable yellowSquash = new Vegetable();
        yellowSquash.name = "Summer Squash";
        yellowSquash.color = "Yellow";
        yellowSquash.cutUpSize = "diced chunks";
        System.out.println(yellowSquash.name);
        yellowSquash.cook("Zucchini");

        System.out.println("*******************************************");

        Phone onePlus = new Phone();
        onePlus.type = "Android";
        onePlus.brand = "a OnePlus";
        onePlus.model = "7 Pro";
        onePlus.os = "OS 10";
        onePlus.owner("Steven");

        System.out.println("*******************************************");

        Phone xr = new Phone();
        xr.type = "Apple";
        xr.brand = "an iPhone";
        xr.model = "XR";
        xr.os = "iOS 13";
        xr.owner("Julia");
    }
}
