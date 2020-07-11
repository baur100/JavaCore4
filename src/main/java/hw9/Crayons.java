package hw9;

public class Crayons {
    private int size;
    private String byCompany;
    private String [] colors;

    //default(empty) constructor
    public Crayons(){}

    //full constructor
    public Crayons(String []colors, String byCompany, int size) {
        setSize(size);
        setCompany(byCompany);
        setColors(colors);
    }

    public int getSize(){
        return this.size;
    }

    public String getCompany(){
        return this.byCompany;
    }

    public String getColors(){
        String colorsList = "";
        for(String col: colors){
            colorsList += col + " ";
        }
        return colorsList;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setCompany(String byCompany) {
        this.byCompany = byCompany;
    }

    public void setColors(String [] colors){
        this.colors = colors;
    }

    public int countColors(){
        return colors.length;
    }

    public void printInfo() {
        System.out.println("Crayons : byCompany \"" + byCompany + "\", size : " + size);
        System.out.println(getColors());
    }
}
