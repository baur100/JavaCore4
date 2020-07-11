package l15Enums;

public class School {
    private String name;
    private SchoolType schoolType;

    public School(String name, SchoolType schoolType) {
        this.name = name;
        this.schoolType = schoolType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SchoolType getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(SchoolType schoolType) {
        this.schoolType = schoolType;
    }
}
