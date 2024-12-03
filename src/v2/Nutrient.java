package v2;

public class Nutrient {
    private final String name;
    private final double amount;

    public Nutrient(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }
}
