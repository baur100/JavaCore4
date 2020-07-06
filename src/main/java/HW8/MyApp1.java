package HW8;

public class MyApp1 {
    public static void main(String[] args) {
        Student anastasiia = new Student();
        anastasiia.firstName = "anastasiia";
        anastasiia.lastName = "bakhareva";
        anastasiia.major = "IT";
        anastasiia.myNameIs();
        System.out.println(anastasiia.major);

        Pet patrick = new Pet();
        patrick.name = "Patrick";
        patrick.dateOfBirth = 5;
        patrick.color = "Blush";
        patrick.isMyPet();
        System.out.println(patrick.name);

        Parents mom = new Parents();
        mom.mName = "Natalia";
        mom.mCity = "Tutayev";

        Parents dad = new Parents();
        dad.dName = "Igor";
        dad.dCity = "Danilov";

        mom.MyMomIsFrom();
        dad.MyDadIsFrom();

        PlaceOfBirth russia = new PlaceOfBirth();
        russia.cityName = "Tutayev";
        russia.country = "Russia";
        russia.dateOfBirth = 1992;
        russia.iWasBorn();
        System.out.println(russia.country);
    }
}
