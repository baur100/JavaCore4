package Hw12;

import java.util.Arrays;

public class Dancer extends Person {
        private String dance;
        public String teacher;

        public Dancer(String name, String lastName, Address address, int age, String dance, String teacher) {
            super(name,lastName,address,age);
            this.dance = dance;
            this.teacher = teacher;
        }

        public void printDancer() {
            System.out.println("Dancer{" +
                    "name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", dance =" + dance +
                    " , teacher " + teacher +   '}');
            this.address.printAddress();

        }
    }


