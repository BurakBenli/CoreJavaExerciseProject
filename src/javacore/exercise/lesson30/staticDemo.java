package javacore.exercise.lesson30;

public class staticDemo {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price=1000;
        product.name="Laptop";
        product.id=1;
        manager.add(product);



        DatabaseHelper.Crud.delete();


    }
}
