package v2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Product implements Identificable {

    private String name;
    private double price;
    private Category category;
    private final List<Nutrient> nutrients = new ArrayList<>();
    private final HashMap<String, String> attributes = new HashMap<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public HashMap<String, String> getAttributes() {
        return attributes;
    }

    public void addAttribute(String key, String value) {
        attributes.put(key, value);
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Nutrient> getNutrients() {
        return nutrients;
    }

    public void addNutrient(Nutrient nutrient) {
        nutrients.add(nutrient);
    }

}
