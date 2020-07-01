package hw10;

public class Computer {
    private int model;
    private int madeInYear;
    private String CPU;

    public Computer() {}


    public Computer (int model, int madeInYear, String CPU) {

        this.model = model;
        this.madeInYear = madeInYear;
        this.CPU = CPU;

    }

    public void printData() {
        System.out.println("Computer model is " + model + "\n"
                + "it was made in" + madeInYear + " and it has CPU " + CPU);

    }


    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        if (model == 2.000) {
            System.out.println(model);
        } else {
            System.out.println("wrong model");
        }
    }


    public int getMadeInYear() {
        return madeInYear;
    }

    public void setMadeInYear(int madeInYear){
        if (madeInYear > 2019) {
            System.out.println(madeInYear);
        } else {
            System.out.println("outdated");
        }

    }


    public String getCPU(){
        return CPU;
    }


    public void setCPU(String CPU) {
        if (CPU == "Intel") {
            System.out.println(CPU);
        } else {
            System.out.println("Invalid CPU");
        }
    }


}
