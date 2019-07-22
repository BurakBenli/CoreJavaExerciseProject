package javacore.exercise.lesson34;

import java.util.ArrayList;

public class arrayListWithClass {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1,"Burak","Burak"));
        customers.add(new Customer(2,"Burak2","Burak2"));
        customers.add(new Customer(3,"Burak3","Burak3"));

        for (Customer customer : customers){
            System.out.println(customer.firstName);
        }


    }
}
