package javacore.exercise.lesson17;

public class methods2 {
    public static void main(String[] args) {

        ekle();
        sil();
        guncelle();
        int yeniDeger = topla();
        String yeniSehirVer = sehirVer();
        int toplam = topla2(1,3,5,6,7,8,9,1);
        System.out.println(toplam);

    }

    public static void ekle(){
        System.out.println("Eklendi..");
    }

    public static void sil(){
        System.out.println("Silindi..");
    }

    public static void guncelle(){
        System.out.println("Güncelledi..");
    }

    public static int topla(){
        return 5;
    }

    public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

    public static String sehirVer(){
        return "Ankara";
    }


}
