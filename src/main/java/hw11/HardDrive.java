package hw11;

import java.util.Arrays;

public class HardDrive {


    private String capacity;

    public HardDrive(String capacity) {
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public void printHardDrive(){
        System.out.println(this.capacity);
    }
}


