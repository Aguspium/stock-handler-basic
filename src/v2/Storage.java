package v2;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static final List<Product> products = new ArrayList<>();


    public static List<Product> getProducts() {
        return products;
    }

    public static void addElement(Identificable element) {
        if (element instanceof Product) {
            products.add((Product) element);
        }
    }


    public static Integer generateId(){
        if (products.isEmpty()) {
            return 1;
        }
        Integer i = products.getLast().getId() + 1;
        for (Product product : products) {
            if (product.getId().equals(i)) {
                i++;
            }
        }
        return i;
    }

}
