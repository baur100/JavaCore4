package hw11hh;

public class Teacher {
    private String name;
    private String lastName;
    private int age;
    private boolean isFemale;

    public Teacher(String name, String lastName, int age, boolean isFemale) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.isFemale = isFemale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean Female) {
        isFemale = Female;
    }

    @Override
    public String toString() {
        if(isFemale) {
            System.out.println("Female Teacher");
        } else {
            System.out.println("Male Teacher");
        }
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isFemale=" + isFemale +
                '}';
    }

    public void printTeacher() {
        System.out.println(toString());
    }
}
