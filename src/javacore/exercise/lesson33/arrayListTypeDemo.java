package javacore.exercise.lesson33;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListTypeDemo {
    public static void main(String[] args) {

        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("Eskişehir");
        sehirler.add("Aydın");


        sehirler.remove("İstanbul");
        Collections.sort(sehirler);

        for (String sehir : sehirler){
            System.out.println(sehir);
        }

    }
}
