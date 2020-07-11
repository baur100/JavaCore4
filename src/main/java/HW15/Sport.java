package HW15;


import java.util.List;

public class Sport {
    private String type;
    private List<Day> day;

    public Sport(String type, List <Day> day) {
        this.type = type;
        this.day = day;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Day> getDay() {
        return day;
    }

    public void setDay(List<Day> day) {
        this.day = day;
    }
}
