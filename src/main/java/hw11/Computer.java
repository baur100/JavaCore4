package hw11;

import java.util.Arrays;

public class Computer {

    private String model;

    public Computer(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void printComputer(){
        System.out.println(this.model);
    }
}
