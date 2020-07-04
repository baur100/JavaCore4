package HW11;

public class Friend {
    private String name;
    private Date bday;
    private String [] hobbies;

    public Friend (){}

    public Friend (String name, Date date, String [] hobbies){
        this.name = name;
        this.bday = date;
        this.hobbies = hobbies;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setDate(Date date) {
        this.bday = date;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return bday;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void printFriendInfo () {
        System.out.println(name +
                "\nBirthday: ");
        this.bday.printDate();
        System.out.println("Favourites:");
        for (String v : hobbies) {
            System.out.println(v);
        }
    }
}
