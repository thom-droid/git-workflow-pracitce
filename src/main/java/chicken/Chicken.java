package chicken;

import java.util.List;

public class Chicken {

    private String name;
    private Ingredient ingredient;
    private int price;

    private Sauce sauce;

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ingredient getIngredients() {
        return ingredient;
    }

    public void setIngredients(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
