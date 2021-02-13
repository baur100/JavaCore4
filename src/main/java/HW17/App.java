package HW17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        //Create a collection for these students and their schools
        Map<String, String> studentschool = new HashMap<String, String>();
        studentschool.put("John", "Harvard");
        studentschool.put("Dylan", "Princeton");
        studentschool.put("Annie", "Yale");
        studentschool.put("Ibrahim", "Columbia");

        System.out.println("\n*******************************Students and their Universities *************************");

        System.out.println("\nHere is the list of the students and their schools");
        System.out.println(studentschool);


        //Displays the school for the student "Dylan"
        System.out.println("\nWhich school does Dylan go to?");
        System.out.println(studentschool.get("Dylan"));

        //Removes the student "Annie" and her school
        System.out.println("\nHere is the new list without Annie");
        studentschool.remove("Annie");
        System.out.println(studentschool);

        //Replaces the student whose age is 5
        System.out.println("\nJohn is no longer going to Havard");
        studentschool.replace("John", "Berkeley");
        System.out.println(studentschool);

        //Final List of all the students

        System.out.println("\nHere is the final list of the students");
        for (String key:studentschool.keySet()){
            System.out.println(key);

        }

        System.out.println("\n*******************************School-Aged Kids **************************************");



        Map<Integer, String> agekids = new HashMap<Integer, String>();
        agekids.put(5, "Stella");
        agekids.put(7, "Karim");
        agekids.put(9, "Joseph");
        agekids.put(10, "David");

        System.out.println("\nHere is the list of the age of kids");
        System.out.println(agekids);

        //Displays the school for the kid who is 9
        System.out.println("\nWhich kid is 9 years old?");
        System.out.println(agekids.get(9));

        //Removes the student "Annie" and her school
        System.out.println("\nHere is the new list without the student who is 10");
        agekids.remove(10);
        System.out.println(agekids);

        //Replaces the student whose age is 5
        System.out.println("\nThere is a new student whose age is 5");
        agekids.replace(5, "Kelly");
        System.out.println(agekids);


        System.out.println("\n*******************************Homes and Cars Parked **************************************");



        Map<Homes, Cars> whodriveswhat = new HashMap<Homes, Cars>();
        Homes mansion=new Homes("Mansion");
        Homes condo=new Homes("Condo");
        Homes townhouse=new Homes("Townhouse");
        Homes villa=new Homes("Villa");

        Cars honda= new Cars("Honda");
        Cars bmw = new Cars("BMW");
        Cars mercedes = new Cars("Mercedes");
        Cars prius= new Cars("Prius");


        whodriveswhat.put(mansion, honda);
        whodriveswhat.put(condo, bmw);
        whodriveswhat.put(townhouse, mercedes);
        whodriveswhat.put(villa, prius);

        System.out.println("\nHere is the list of the homes and the cars that are parked inside");

        System.out.println(whodriveswhat.entrySet().toString());

        //Displays the car for the home Townhouse
        System.out.println("\nWhat car is parked in the Townhouse?");
        System.out.println(whodriveswhat.get(townhouse));


        //Removes the Villa home and its car
        System.out.println("\nHere is the new list without the villa");
        whodriveswhat.remove(villa);
        System.out.println(whodriveswhat);

        //Replaces the home Mansion with a Duplex
        Cars nissan= new Cars("Nissan");
        System.out.println("\nThere is a new car in the Mansion");
        whodriveswhat.replace(mansion, nissan);
        System.out.println(whodriveswhat);

        //List of all the homes with the cars inside
        System.out.println("\nFinal list of homes with their cars");

        for (Map.Entry<Homes, Cars> x: whodriveswhat.entrySet()){
            Homes h=x.getKey();
            Cars c=x.getValue();
            System.out.println(h.getType()+ "=>" + c.getBrand());



        }




        }
    }