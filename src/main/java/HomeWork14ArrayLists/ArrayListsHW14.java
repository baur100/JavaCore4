package HomeWork14ArrayLists;

import java.util.List;
import java.util.ArrayList;

/*
Create 3 ArrayList - String, Integer and some Custom class
Add 4+ elements to each List
excersize methods add/set/remove/get/foreach and etc
*/
public class ArrayListsHW14 {
    public static void main(String[] args) {

        ArrayList<String> candidateList = new ArrayList<String>();
        ArrayList<Integer> ageList = new ArrayList<Integer>();

        candidateList.add("Anna");
        ageList.add(29);
        candidateList.add("Peter");
        ageList.add(30);
        candidateList.add("Paul");
        ageList.add(35);
        candidateList.add("Tom");
        ageList.add(39);
        candidateList.add("Ben");
        ageList.add(23);
        candidateList.add("Christina");
        ageList.add(26);
        candidateList.add("Shiela");
        ageList.add(28);
        System.out.print(candidateList);
        System.out.println("\t"+candidateList.size());
        System.out.print(ageList);
        System.out.println("\t"+ageList.size());
        candidateList.set(3,"Thomas");
        ageList.set(3,32);
        System.out.print(candidateList);
        System.out.println("\t"+candidateList.size());
        System.out.print(ageList);
        System.out.println("\t"+ageList.size());
        candidateList.remove(6);
        System.out.print(candidateList);
        System.out.println("\t"+candidateList.size());
        System.out.print(ageList);
        System.out.println("\t"+ageList.size());

        PetDetails dog1 = new PetDetails("Tommy","Dog","dogBreed1",2,"Pedigree","bone","Milk","dogHouse","Pet Bed","Medium");
        PetDetails dog2 = new PetDetails("Jimmy","Dog","dogBreed2",3,"DogFood","bone","Milk","dogDen","Pet Bed","Medium");
        PetDetails dog3 = new PetDetails("Bonny","Dog","dogBreed3",4,"ChewyBone","bone","Milk","petHouse","Pet Bed","Medium");
        PetDetails dog4 = new PetDetails("Bushy","Dog","dogBreed4",1,"DogFood2","bone","Milk","dogHouse3","Pet Bed","Medium");
        PetDetails dog5 = new PetDetails("Doggi","Dog","dogBreed5",5,"DogFood3","bone","Milk","dogHouse2","Pet Bed","Medium");

        List<PetDetails> petList = new ArrayList<PetDetails>();
        System.out.println("\t"+petList.size());
        petList.add(dog1);
        petList.add(dog2);
        petList.add(dog3);
        petList.add(dog4);
        petList.add(dog5);

        PetDetails cat1 = new PetDetails("Cathie","Cat","CatBreed1",6,"CatFood1","Fish Biscuit","Milk","Cat House","Pet Bed","Small");
        PetDetails bird1 = new PetDetails("Shilly","Parrot","American Parrot",2,"BirdGrain1","Carrot Chip","Juice","Bird Cage","Bird Swing Bed","Large");

        petList.add(cat1);
        petList.add(bird1);

        for (PetDetails pd :petList) {
            System.out.print(pd.getPetName()+"\t:");
            System.out.println("\t"+pd.getPetType());
        }
            System.out.println(petList.size());
            System.out.println(petList.contains(dog1));


        Person people1 = new Person("123 ABCD","Milpitas","CA",45345,true,"Peter","Paul",23,4500.35,dog1);
        Person people2 = new Person("456 ETEY","San Jose","CA",42435,true,"Austin","Gerber",33,3200.35,cat1);
        Person people3 = new Person("789 KGKG","Santa Clara","CA",65887,true,"Casper","Cherish",43,6300.35,bird1);
        Person people4 = new Person("912 HDFG","San Diego","CA",98787,true,"Christy","Paul",40,8300.35,dog3);
        Person people5 = new Person("345 BCNM","Fremont","CA",98706,true,"Nadia","Khaled",37,1200.35,dog4);
        Person people6 = new Person("5657 rwte","Pleasontan","CA",97306,true,"Asha","Qwerty",31,2200.35,dog2);
        Person people7 = new Person("765 tert","Dublin","CA",53453,true,"Shiela","Chandlior",38,2200.35,dog5);
        Person people8 = new Person("765 tert","Dublin","CA",53453,true,"Shiela","Chandlior",38,2200.35,dog5);


        List<Person> people = new ArrayList<Person>();
        System.out.println("\t"+people.size());

        people.add(people1);
        people.add(people2);
        people.add(people3);
        people.add(people4);
        people.add(people5);
        people.add(people6);
        people.add(people7);
        people.add(people8);


        for (Person per :people) {
            System.out.println("\t"+per.getFirstName()+" "+per.getLastName()+", "+per.getPersonAge()+" old, has set a budget of $"+per.getPetBudget()+"\t");
        }

        System.out.println(people.size());
        System.out.println(people.contains("San"));
        System.out.println(people.contains(dog5));
        System.out.println(people.contains(people8));

    }

}
