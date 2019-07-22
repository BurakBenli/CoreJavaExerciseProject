package javacore.exercise.lesson35;

import java.util.HashMap;

public class hashMapDemo {
    public static void main(String[] args) {

        HashMap<String,String> sozluk = new HashMap<String,String>();

        sozluk.put("book","kitap");
        sozluk.put("car","araba");
        sozluk.put("computer","bilgisayar");

        System.out.println(sozluk.size());

        for (String item:sozluk.keySet()){
            System.out.println("Anahtar Listesi : " + item + "   Değer :" + sozluk.get(item));
        }

    //    System.out.println(sozluk);

        sozluk.remove("car");
        sozluk.clear();
        System.out.println(sozluk.get("car"));
        System.out.println(sozluk);
        System.out.println(sozluk.size());





    }
}
