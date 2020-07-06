package hw11;

import java.util.Arrays;

public class HardDrive {
    private String memoryCapacity;
    private Computer model;
    private String[] parts;

    public HardDrive() {
    }

    public HardDrive(String memoryCapacity, Computer model, String[] parts) {
        this.memoryCapacity = memoryCapacity;
        this.model = model;
        this.parts = parts;
    }

    public String getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(String memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public Computer getModel() {
        return model;
    }

    public void setModel(Computer model) { this.model = model; }

    public String[] getParts() {
        return parts;
    }

    public void setParts(String[] parts) { this.parts = parts;
    }



    public void printHardDrive() {
        System.out.println("HardDrive{" +
                "memoryCapacity='" + memoryCapacity + '\'' +
                ", model=" + model +
                ", parts=" + Arrays.toString(parts) +
                '}');
    }
}


