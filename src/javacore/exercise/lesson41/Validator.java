package javacore.exercise.lesson41;

public class Validator {
    public <T extends IEntity> void validator(T entity){
        Validator validator = new Validator();

        Customer customer = new Customer();
        Product product = new Product();
        
        validator.validator(customer);
        validator.validator(product);

    }
}
