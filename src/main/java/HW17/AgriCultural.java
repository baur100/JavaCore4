package HW17;

public class AgriCultural {
    private String field;

    public AgriCultural(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void printAgriCulture(){
        System.out.println(getField());
    }

}
