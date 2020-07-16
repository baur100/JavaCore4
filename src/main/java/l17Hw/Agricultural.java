package l17Hw;

public class Agricultural {
    private String nameOfCulture;
    private int fieldArea;

    public Agricultural(String nameOfCulture, int fieldArea) {
        this.nameOfCulture = nameOfCulture;
        this.fieldArea = fieldArea;
    }

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public int getFieldArea() {
        return fieldArea;
    }
}
