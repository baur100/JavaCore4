package Hw15;

public class Occupation {
    private String profession;
    private Education education;

    public Occupation(String profession, Education education) {
        this.profession = profession;
        this.education = education;
    }

    @Override

    public String toString() {
        return "\nOccupation:" + " " + profession + " " + education;
    }
}

