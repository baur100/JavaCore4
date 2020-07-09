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
            System.out.println("This dancer's name is " + name + " " + lastName + " age  " + age +
                    "\nFavorite dance style is " + dance +
                    "\nTeacher's name is " + teacher +
                    "\n " + name + " " + lastName + "' address is ");
            this.address.printAddress();

        }
    }


