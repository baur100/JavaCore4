package hw19;

public class AgreeCultural {
    private String nameOfCulture;
    private int fieldNumbers;

    public AgreeCultural(String nameOfCulture, int fieldNumbers) {
        this.nameOfCulture = nameOfCulture;
        this.fieldNumbers = fieldNumbers;
    }

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public void setNameOfCulture(String nameOfCulture) {
        this.nameOfCulture = nameOfCulture;
    }

    public int getFieldNumbers() {
        return fieldNumbers;
    }

    public void setFieldNumbers(int fieldNumbers) {
        this.fieldNumbers = fieldNumbers;
    }

    public void printAgreeInfo(){
        System.out.println("Farm Name: " + nameOfCulture +
                "Field #: " + fieldNumbers);
    }
}
