package HW13;

public class Shopping implements ToDoList {
    private String type;

    public Shopping(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void monday () {
        System.out.println("No shopping on Monday. It's too much.");
    }

    public void tuesday (){
        System.out.println("Today is grocery day!");
    }

    public void wednesday(){
        System.out.println("No tasks on Wednesday. You have some empty space.");
    }

    public void thursday(){
        System.out.println("No shopping on Thursday.");
    }

    public void friday(){
        System.out.println("Friday's for chilling with friends.");
    }

    public void saturday(){
        System.out.println("It's time to walk to the mall and get some girly stuff:)");
    }

    public void sunday(){
        System.out.println("Time for yourself.");
    }
}
