package HW15Jul10;

import Class15Jul10.Person;

import javax.security.auth.Subject;
import java.util.HashMap;
import java.util.Map;

/*
* Create 3 HashMap- <String,String>, <Integer,String> and custom classes <Class1,Class2>
add 4 elements to each hashmap
try methods  put/replace/remove/get/foreach
Create 2 Enums
Create 2 classes
- first will have field with type enum
- second - field as ArrayList<enum.type>
* */

public class HmWrk15 {
    public static void main(String[] args) {

//      HashMap ---- Class , Class
        HashMap<President,Country> classKey = new HashMap<President,Country>();

        President pcUSA = new President("Donald Trump",45);
        Country cUSA = new Country("United States");
        President pcInd = new President("Ram Nath Kovind",14);
        Country cInd = new Country("India");
        President pcChina = new President("Xi Jinping",7);
        Country cChina = new Country("China");
        President pcFnLd = new President("Sauli Niinistö",12);
        Country cFnLd = new Country("Finland");
        President pcBlgra = new President("Rumen Radev",5);
        Country cBlgra = new Country("Bulgaria");
        President pcPak = new President("Arif Alvi",13);
        Country cPak = new Country("Pakistan");
        President pcSKra = new President("Lee Myung Bak",10);
        Country cSKra = new Country("South Korea");
        President pcCpVrd = new President("Jorge Carlos Fonseca",4);
        Country cCpVrd = new Country("Cape Verde");
        President pcCuba = new President("Miguel Díaz-Canel",17);
        Country cCuba = new Country("Cuba");
        President pcEgypt = new President("Abdel Fattah el-Sisi",6);
        Country cEgypt = new Country("Egypt");

        President chk1 = new President("XYZ",01);
        Country c1 = new Country("QWERTY");
        President chk2 = new President("ABC",02);
        Country c2 = new Country("zyx");

        classKey.put(pcUSA,cUSA);
        classKey.put(pcInd,cInd);
        classKey.put(pcChina,cChina);
        classKey.put(pcFnLd,cFnLd);
        classKey.put(pcBlgra,cBlgra);
        classKey.put(pcPak,cPak);
        classKey.put(pcSKra,cSKra);
        classKey.put(pcCpVrd,cCpVrd);
        classKey.put(pcCuba,cCuba);
        classKey.put(pcEgypt,cEgypt);
        System.out.println("                CLASS                           ");

//        String , String --- HashMap
        HashMap<String,String> strKey = new HashMap<String,String>();
        strKey.put(pcUSA.getPresidentName(),cUSA.getCountryName());
        strKey.put(pcInd.getPresidentName(),cInd.getCountryName());
        strKey.put(pcChina.getPresidentName(),cChina.getCountryName());
        strKey.put(pcFnLd.getPresidentName(),cFnLd.getCountryName());
        strKey.put(pcBlgra.getPresidentName(),cBlgra.getCountryName());
        strKey.put(pcPak.getPresidentName(),cPak.getCountryName());
        strKey.put(pcSKra.getPresidentName(),cSKra.getCountryName());
        strKey.put(pcCpVrd.getPresidentName(),cCpVrd.getCountryName());
        strKey.put(pcCuba.getPresidentName(),cCuba.getCountryName());
        strKey.put(pcEgypt.getPresidentName(),cEgypt.getCountryName());

        System.out.print("\n"+strKey);
        System.out.println("\t"+strKey.size());
        System.out.println(strKey.containsKey("Ram Nath Kovind"));
        System.out.println(strKey.containsValue("Cuba"));
        System.out.print(strKey);
        System.out.println("\t"+strKey.size());
        strKey.put("XXXXX","YYYYY");
        System.out.print(strKey);
        System.out.println("\t"+strKey.size());
        strKey.put("XXXXX","XYZ");
        System.out.print(strKey);
        System.out.println("\t"+strKey.size());
        strKey.replace("XXXXX","WWWW");
        System.out.print(strKey);
        System.out.println("\t"+strKey.size());
        strKey.remove("XXXXX");
        System.out.print(strKey);
        System.out.println("\t"+strKey.size());

//        Integer , String ---- HashMap
        HashMap<Integer,String> intKey = new HashMap<Integer, String>();
        intKey.put(pcUSA.getNthPresident(),pcUSA.getPresidentName());
        intKey.put(pcInd.getNthPresident(),pcInd.getPresidentName());
        intKey.put(pcChina.getNthPresident(),pcChina.getPresidentName());
        intKey.put(pcFnLd.getNthPresident(),pcFnLd.getPresidentName());
        intKey.put(pcBlgra.getNthPresident(),pcBlgra.getPresidentName());
        intKey.put(pcPak.getNthPresident(),pcPak.getPresidentName());
        intKey.put(pcSKra.getNthPresident(),pcSKra.getPresidentName());
        intKey.put(pcCpVrd.getNthPresident(),pcCpVrd.getPresidentName());
        intKey.put(pcCuba.getNthPresident(),pcCuba.getPresidentName());
        intKey.put(pcEgypt.getNthPresident(),pcEgypt.getPresidentName());

        System.out.println("\n"+intKey);
        System.out.println("\t"+intKey.size());
        System.out.println(intKey.containsKey(14));
        System.out.println(intKey.containsValue("Rumen Radev"));
        System.out.print(intKey);
        System.out.println("\t"+intKey.size());
        intKey.put(chk1.getNthPresident(),chk1.getPresidentName());
        System.out.print(intKey);
        System.out.println("\t"+intKey.size());
        intKey.replace(chk1.getNthPresident(),chk2.getPresidentName());
        System.out.print(intKey);
        System.out.println("\t"+intKey.size());
        intKey.remove(chk1.getNthPresident(),chk1.getPresidentName());
        System.out.print(intKey);
        System.out.println("\t"+intKey.size());


        System.out.println("\n Print Key \n");
//        .keySet(); --> iterates through keys only and Prints only keys
        for (String key : strKey.keySet()) {
            System.out.println(key);
        }
        System.out.println("\n Print Values \n");
//        .values(); --> iterates through values only and Prints only values
        for (String val: intKey.values()) {
            System.out.println(val);
        }
        System.out.println("\nPrint Key and Values");
//        the below prints both values nad keys
        for (Map.Entry<String,String> pair:strKey.entrySet()) {
            System.out.println("Mr."+pair.getKey()+" "+Position.PRESIDENT+" of "+pair.getValue());
        }

        System.out.println("\n\n\t\t\t\t\t\t CHECK \t\t\t\t\t\t\t");
        Map<President,Country> pp = new HashMap<President,Country>();
        pp.put(new President("q",5),new Country("t"));
        System.out.println(pp.size());

/*
*       System.out.print("\n"+classKey);
        System.out.println("\t"+classKey.size());
        System.out.println(classKey.containsKey("Ram Nath Kovind"));
        System.out.println(classKey.containsValue("Cuba"));
        System.out.print(classKey);
        System.out.println("\t"+classKey.size());
        classKey.put(chk1,c1);
        System.out.print(classKey);
        System.out.println("\t"+classKey.size());
        classKey.put(chk2,c2);
        System.out.print(classKey);
        System.out.println("\t"+classKey.size());
        classKey.replace(chk1,c2);
        System.out.print(classKey);
        System.out.println("\t"+classKey.size());
        classKey.remove(chk1);
        System.out.print(classKey);
        System.out.println("\t"+classKey.size());

* */

    }
}
