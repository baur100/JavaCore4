package HW12;

public class Produce {
    protected String name;
    protected Bestbydate bestby;

    public Produce (String name, Bestbydate bestby){
        this.name = name;
        this.bestby = bestby;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getName (){
        return name;
    }

    public void setBestby (Bestbydate bestby){
        this.bestby = bestby;
    }

    public Bestbydate getBestby() {
        return bestby;
    }

    public void printProduceInfo (){
        System.out.println(this.name);
        bestby.printDate();
    }

}
