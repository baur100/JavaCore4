package HM10;

public class House {
    private int streetNumbers;
    private String streetName;
    private int aptNumber;

    public House(int streetNumbers,String streetName,int aptNumber){
        this.streetNumbers = streetNumbers;
        this.streetName=streetName;
        this.aptNumber=aptNumber;
    }
    public void printInfo(){
        System.out.println("My street number is "+ streetNumbers + "\n" + "My street name is "+streetName + "\n" + "My apr number is " + aptNumber);
    }
    public void setStreetNumbers(int streetNumbers){
        this.streetNumbers=streetNumbers;
    }
    public int getStreetNumbers(){
        return streetNumbers;
    }
    public void setStreetName(String streetName){
        this.streetName=streetName;
    }
    public String getStreetName(){
        return streetName;
    }
    public void setAptNumber(int aptNumber){
        this.aptNumber=aptNumber;
    }
    public int getAptNumber(){
        return aptNumber;
    }
}

