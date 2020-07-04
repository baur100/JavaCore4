package Example.Spare2;
public class BirthdayParty {
    private String name;
    private String lastName;
    private int age;
    private String[] partyBasics;
    private Address address;


    public BirthdayParty(String name, String lastName, int age, String[] partyBasics, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.partyBasics = partyBasics;
        this.address = address;
    }


    public BirthdayParty() {
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

    public String[] getPartyBasics() {
        return partyBasics;
    }

    public void setPartyBasics(String[] partyBasics) {
        this.partyBasics = partyBasics;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void printBirthdayInfo(){
        System.out.println("Name = " + name + " Last Name = " + lastName +
                "Age = " + age);
        for (String v:this.partyBasics){
            System.out.println(v);
        }
        this.address.printAddress();
    }

}

