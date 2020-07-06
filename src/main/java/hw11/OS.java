package hw11;

import java.util.Arrays;

public class OS {
    private String name;
    private String capacity;
    private String [] features;
    private Computer model;

    public OS(String name, String capacity, String[] features, Computer model) {
        this.name = name;
        this.capacity = capacity;
        this.features = features;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String[] getFeatures() {
        return features;
    }

    public void setFeatures(String[] features) {
        this.features = features;
    }

    public Computer getModel() {
        return model;
    }

    public void setModel(Computer model) {
        this.model = model;
    }


    public void printOS() {
        System.out.println("OS{" +
                "name='" + name + '\'' +
                ", capacity='" + capacity + '\'' +
                ", features=" + Arrays.toString(features) +
              //  ", model=" + model +
                '}');

        this.model.printComputer();
    }
}
