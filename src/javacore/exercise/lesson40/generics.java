package javacore.exercise.lesson40;

import java.util.ArrayList;

public class generics {
    public static void main(String[] args) {

        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("Bursa");

        MyList<Customer> myList = new MyList<Customer>();
        myList.add(new Customer());


    }
}
