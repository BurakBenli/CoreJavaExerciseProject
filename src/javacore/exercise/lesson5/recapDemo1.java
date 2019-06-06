package javacore.exercise.lesson5;

public class recapDemo1 {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 245;
        int sayi3 = 2244;
        int enBuyukDeger = sayi1;

        if(enBuyukDeger < sayi2){
            enBuyukDeger = sayi2;
        }

        if(enBuyukDeger < sayi3){
            enBuyukDeger = sayi3;
        }


        System.out.println("En Büyük Değer" + enBuyukDeger);

    }
}
