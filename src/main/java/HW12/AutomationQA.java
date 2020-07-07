package HW12;

public class AutomationQA extends ItSpecialist{

  protected String city;

    public AutomationQA() {}

    public AutomationQA(String name, String lastName, String position, String city) {
        super(name, lastName, position);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
