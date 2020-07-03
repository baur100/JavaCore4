package HW10;

public class Human {

    private String name;
    private String sex;
    private int year;

    public Human(String name, String sex, int year) {

        this.name = name;
        this.sex = sex;
        this.year = year;

    }


    public void setName() {

        this.name = name;
    }

    public void setSex() {

        this.sex = sex;
    }

    public void setYear() {

        this.year = year;
    }

    public String getName() {

        return name;

    }

    public String getSex() {

        return sex;
    }

    public int getYear() {

     return year;

}
     public void printOut() {

         System.out.println("Human's name= " + name + "\nHuman's sex= " + sex + "\nHuman's year= " + year);
     }

}
