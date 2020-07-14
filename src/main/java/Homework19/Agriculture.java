package Homework19;

public class Agriculture {
    private String nameOfAgriculture;
    private int fieldNumber;

    public Agriculture(String nameOfAgriculture, int fieldNumber) {
        this.nameOfAgriculture = nameOfAgriculture;
        this.fieldNumber = fieldNumber;
    }

    public String getNameOfAgriculture() {
        return nameOfAgriculture;
    }

    public void setNameOfAgriculture(String nameOfAgriculture) {
        this.nameOfAgriculture = nameOfAgriculture;
    }

    public int getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }
}

