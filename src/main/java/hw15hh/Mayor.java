package hw15hh;

public class Mayor {
    private String name;

    public Mayor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void printMayor () {
        System.out.println(toString());
    }
}
