package v2;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Bife de lomo");
        product.setPrice(500.0);
        product.setCategory(Category.CARNES);

        product.addNutrient(new Nutrient("Proteínas", 25.0));
        product.addNutrient(new Nutrient("Vitaminas", 253.0));


        product.addAttribute("Peso", "1kg");
        product.addAttribute("Origen", "Argentina");

        Storage.addElement(product);


        for (Product p : Storage.getProducts()) {
            System.out.println("Nombre: " + p.getName());
            System.out.println("Precio: " + p.getPrice());
            System.out.println("Categoría: " + p.getCategory());
            System.out.println("Atributos: ");

            for (String key : p.getAttributes().keySet()) {
                System.out.println(key + ": " + p.getAttributes().get(key));
            }

            System.out.println("Nutrientes: ");
            for (Nutrient n : p.getNutrients()) {
                System.out.println(n.getName() + ": " + n.getAmount());
            }
        }

    }

}
