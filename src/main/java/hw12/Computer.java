package hw12;

public class Computer {
    private String model;
    private String speed;

    public Computer(String model, String speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }


    public void printComputer() {
        System.out.println("Computer{" +
                "model='" + model + '\'' +
                ", speed='" + speed + '\'' +
                '}');
    }

    public void printComputer2() {
        System.out.println("Keyboard{" +
                "model='" + model + '\'' +
                ", speed='" + speed + '\'' +
                '}');
    }

    public void printComputer3() {
        System.out.println("Monitor{" +
                "model='" + model + '\'' +
                ", speed='" + speed + '\'' +
                '}');
    }
    public void printComputer4() {
        System.out.println("Mouse{" +
                "model='" + model + '\'' +
                ", speed='" + speed + '\'' +
                '}');
    }
    public void printComputer5() {
        System.out.println("Speakers{" +
                "model='" + model + '\'' +
                ", speed='" + speed + '\'' +
                '}');
    }

}
