package hw11;

import java.util.Arrays;

public class Computer {
    private String model;
    private HardDrive cpuType;
    private String[] accessories;

    public Computer() {
    }

    public Computer(String model, HardDrive cpuType, String[] accessories) {
        this.model = model;
        this.cpuType = cpuType;
        this.accessories = accessories;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public HardDrive getCpuType() {
        return cpuType;
    }

    public void setCpuType(HardDrive cpuType) {
        this.cpuType = cpuType;
    }

    public String[] getAccessories() {
        return accessories;
    }

    public void setAccessories(String[] accessories) {
        this.accessories = accessories;
    }

// option 1.
//    public void printInfo() {
//        System.out.println(this.model);
//        System.out.println(this.cpuType);
//        for (String v : this.accessories) {
//            System.out.println(v);
//        }
//    }

//option 2.
   public void printComputer(){
       System.out.println("Computer{" +
                "model='" + model + '\'' +
                ", cpuType=" + cpuType +
                ", accessories=" + Arrays.toString(accessories) +
                '}');
    }
}
