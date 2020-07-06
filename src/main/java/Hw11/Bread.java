package Hw11;

public class Bread {
    private String name;
    private String[] ingredients;
    private String crust;
    private Recipe recipe;

    public Bread(String name, String[] ingredients, String crust, Recipe recipe) {
        this.name = name;
        this.ingredients = ingredients;
        this.crust = crust;
        this.recipe = recipe;

    }

    public Bread() {
    }


    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }


    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public void printInfo() {
        System.out.println("This bread is called " + this.name);
        System.out.println("It is cooked from the following ingredients");
        for (String i : this.ingredients) {
            System.out.print((i) + " , ");}
            System.out.println("\nIt has " + this.crust + " crust");

//        System.out.println(this.address1());
        recipe.printRecipe();
//        System.out.println(this.recipe.getFlour());
//        System.out.println(this.recipe.getStarter());
//        System.out.println(this.recipe.getCookingProcess());
//        System.out.println(this.recipe.getCookingTime());
//        System.out.println(this.recipe.getTemp());
//        System.out.println(this.recipe.getCookingTime());
    }
}