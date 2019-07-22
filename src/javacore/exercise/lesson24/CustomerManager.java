package javacore.exercise.lesson24;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }

    public void add(){
//        System.out.println("Veri Tabanına Müşteri Eklendi..");
        this.logger.log("Log mesajı Database");
    }
}
