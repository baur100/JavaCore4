package hw11;

public class App11 {
    public static void main(String[] args) {
Address office = new Address ("303 Adison Ave", "Los Angeles", "CA", 90210);
office.printAddress();

            // Employee

String [] petz = {"cat","dog", "fishes", "parot"};
String [] petzz = {"horse","cow", "eagle"};

Address helenAddress = new Address("111 Colone St", "San Francisco", "CA", 98765);
helenAddress.printAddress();

Employee helen = new Employee ();
     helen.setName("Helen");
     helen.setLastName("Luis");
     helen.setPets(new String [] {"cat", "dog", "parot", "fishes"});
     helen.setAddress(helenAddress);

String [] arr = helen.getPets();
for (String v: arr){
    System.out.println(v);
}
    helen.printInfo();
        System.out.println("*******");

Address peterAddress = new Address ("7614 Santa Monica Blvd", "Los Angeles", "CA", 90210);
peterAddress.printAddress();

Employee peter = new Employee ();
    peter.setName("Peter");
    peter.setLastName("Smith");
    peter.setPets(new String [] {"horse","cow", "eagle"});

    peter.printInfo();
            System.out.println("*******");

                // Student

        String [] carz = {"Toyota","RAM"};
        String [] carzz = {"Nissan","BMW"};

Address school = new Address ("23090 Pacific Ave", "Chicago", "IL",56034);
school.printAddress();

Address aliceAddress = new Address ("234 @3th St", "Chicago", "IL", 34679);
aliceAddress.printAddress();

Student alice = new Student ();
alice.setName("Alice");
alice.setLastName("White");
alice.setCars(new String [] {"Toyota", "RAM"});
alice.setAddress(aliceAddress);

String [] arrr = alice.getCars();
    for (String v: arrr){
        System.out.println(v);
    }
    alice.printInfo2();
            System.out.println("^^^^^^^^^");

        Address johnAddress = new Address ("90 Rose Ave", "Chicago", "IL", 90876);
        johnAddress.printAddress();

Student john = new Student ();
john.setName("John");
john.setLastName("Rocket");
john.setCars(new String [] {"Nissan", "BMW"});
john.setAddress(johnAddress);

john.printInfo2();
        System.out.println("^^^^^^^^");

        }
    }



// Create 2 classes
//Every class should contain at least one field - type of Array
//And At least one field - Custom Type (so obvious you should create more classes)
//create 2 objects of each class