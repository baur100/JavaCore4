package HM14;

import l14.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class AppCustom {
    public static void main(String[] args) {
        List<AirCompany> airCompany = new ArrayList<AirCompany>();
        AirCompany aa = new AirCompany("AA",1930) ;
        AirCompany united = new AirCompany("United",1926);
        AirCompany delta = new AirCompany("Delta",1925);
        airCompany.add(aa);
        airCompany.add(united);
        airCompany.add(delta);
        System.out.println("********ADD***************");
        airCompany.forEach(v-> System.out.println(v.getName()+"\n"+(v.getYearOfFound())));
        System.out.println("********REMOVED***************");
        airCompany.remove(2);
        for(AirCompany a : airCompany){
            System.out.println(a.getName());
            System.out.println(a.getYearOfFound());
        }
        System.out.println("********SET***************");
        airCompany.set(1,delta);
        for(AirCompany a : airCompany){
            System.out.println(a.getName());
            System.out.println(a.getYearOfFound());
        }
        System.out.println("********GET***************");
        airCompany.get(0);
        for(AirCompany a : airCompany){
            System.out.println(a.getName());
            System.out.println(a.getYearOfFound());
        }
        System.out.println("**********FOREACH************");
        for(AirCompany a : airCompany){
            System.out.println(a.getName());
            System.out.println(a.getYearOfFound());
        }
        System.out.println("***********************");
        System.out.println(airCompany.contains(aa));
        System.out.println(airCompany.contains(united));
        System.out.println(airCompany.contains(delta));
        System.out.println(airCompany.contains("Alaska"));

    }
}
