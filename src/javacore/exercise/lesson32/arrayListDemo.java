package javacore.exercise.lesson32;

import java.util.ArrayList;

public class arrayListDemo {
    public static void main(String[] args) {

        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(4);
        sayilar.add("Ankara");

        System.out.println(sayilar.size());

        System.out.println(sayilar.get(2));

        sayilar.set(0,99);

        System.out.println(sayilar.get(0));

       // sayilar.clear();

        System.out.println(sayilar.size());
        System.out.println("****************");
        for (Object sayi : sayilar){
            System.out.println(sayi);
        }


    }
}
