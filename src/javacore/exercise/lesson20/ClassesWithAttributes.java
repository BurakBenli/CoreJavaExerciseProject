package javacore.exercise.lesson20;

public class ClassesWithAttributes {
    public static void main(String[] args) {

        Product product = new Product(1,"Laptop","Asus Laptop",3000,2);
        Product product1 = new Product();
        product.setName("Laptop");
        System.out.println(product.getName());
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        product1.setId(1);
        product1.setDescription("Asus Laptop");
        product1.setPrice(5000);
        product1.setStockAmount(3);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        product.getName();
    }
}
