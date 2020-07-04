package hw10Constractors;



public class AppHW10 {
    public static void main(String[] args) {
      Pet sharik = new Pet ("frenchie", "black", "tuzik",5);
      sharik.setNickname("sharik");

//                     // Person

      Person jane = new Person("Jane", "Johns", 1950, sharik);
      jane.setName("Kate");
      jane.setLastName("Lee");
      jane.setYear(1990);

      Person richard = new Person ();
      richard.setName("Richard");
      richard.setLastName("Lewis");
      richard.setYear(1949);
      System.out.println(richard.toString());


      jane.credentials();
      System.out.println("**********");
      richard.credentials1();
      System.out.println("**********");

      System.out.println(richard.getYear()+jane.getYear());


//                          // Car

      Car toyota = new Car();
      toyota.setMake("Toyota");
      toyota.setModel("Prius");
      toyota.setYear(2020);

      Car prius = new Car ("Toyota",  "Prius",  2020);

      Car bmw = new Car();
      bmw.setMake("BMW");
      bmw.setModel("M6");
      bmw.setYear(2019);

//    Car bmw = new Car ("BMW",  "M6",  2019);

      prius.printInfo();
      System.out.println("*******");
      bmw.printInfo();
      System.out.println("********");


//                        //  Pet

      Pet miki = new Pet ("frenchie", "white", "Miki", 2);


      Pet lulu = new Pet ( "british",  "black",  "Lulu",  2);
      lulu.printInfo();
      System.out.println("*******");
      miki.printInfo();
      System.out.println("*********");
    }

  }





