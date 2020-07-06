package l12;

public /*final*/ class Teacher extends Person{
    private String subject;

    public Teacher(String name, String lastName, Address address, College college, String subject) {
        super(name,lastName,address,college);
        this.subject = subject;
    }

    public void printTeacher() {
        System.out.println("Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subject='" + subject + '\'' +
                '}');
        this.address.printAddress();
        this.college.printCollege();
    }
}
