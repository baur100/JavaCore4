package Hw10;

public class Cookie {
    private String name;
    private String ingredients;
    private String taste;
    int callories;

    public Cookie(String name, String ingredients, String taste, int callories) {
        this.name = name;
        this.ingredients = ingredients;
        this.taste = taste;
        this.callories = callories;

    }

    public Cookie() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setTaste(String taste) {

        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getTaste() {
        return taste;
    }

    public void setCallories(int callories) {
        this.callories = callories;
    }

    public void printOut() {
        System.out.println("This is  " + name + " cookie" + "\n" + name + "  contains following ingredients " + ingredients +
                "\nThis cookie has  " + taste + " taste" + "\nThere is " + callories + " callories" + " in 1 cookie");
    }
}



