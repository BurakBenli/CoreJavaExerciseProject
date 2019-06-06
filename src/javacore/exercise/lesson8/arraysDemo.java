package javacore.exercise.lesson8;

public class arraysDemo {
    public static void main(String[] args) {

        //Arrays DEMO

        String ogrenci1 = "Burak";
        String ogrenci2 = "Furkan";
        String ogrenci3 = "Hüseyin";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("-----------------------------------");

        String[] ogrenciler = new String[3];

        ogrenciler[0] = "Burak";
        ogrenciler[1] = "Furkan";
        ogrenciler[2] = "Hüseyin";

        for (int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }


        System.out.println("!-----------------------------------!");

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }



    }
}
