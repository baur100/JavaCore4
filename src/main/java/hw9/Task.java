package hw9;

public class Task {
    private String [] workers;
    private  String name;

    public Task(String[] workers, String name) {
        this.workers = workers;
        this.name = name;
    }

    public String[] getWorkers() {
        return workers;
    }

    public void setWorkers(String[] workers) {
        this.workers = workers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printNow(){
        System.out.println("Name ="+name);
        for(String workers:this.workers){
            System.out.println(workers);
        }
    }

}
