package HW12;

public class Bread extends Produce {
    private String flourSort;
    private boolean isGlutenFree;

    public Bread(String name, Bestbydate bestby, String flourSort, boolean isGlutenFree) {
        super(name, bestby);
        this.flourSort = flourSort;
        this.isGlutenFree = isGlutenFree;
    }

    public String getFlourSort() {
        return flourSort;
    }

    public void setFlourSort(String flourSort) {
        this.flourSort = flourSort;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }

    public void printBread (){
        printProduceInfo();
        System.out.println(flourSort + " flour \nGluten Free: ");
        if (isGlutenFree){
            System.out.println("YES");
        } else System.out.println("NO");

    }
}

