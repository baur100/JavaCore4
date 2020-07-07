package l12a;

    public abstract class Fruit {
        protected String name;

    public Fruit(String name) {
        this.name = name;
    }
    protected void printFruitName(){
        System.out.println(this.name);
    }
}
