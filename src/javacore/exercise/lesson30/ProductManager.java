package javacore.exercise.lesson30;

public class ProductManager {
    public void add(Product product){
        ProductValidator productValidator = new ProductValidator();
        if(productValidator.isValid(product)){
            System.out.println("Veritabanına Eklendi");
        }else{
            System.out.println("Veritabanına Eklenemedi !!");
        }
    }
}
