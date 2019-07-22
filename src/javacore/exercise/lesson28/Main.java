package javacore.exercise.lesson28;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new OracleCusomerDal());
        customerManager.add();


    }
}
