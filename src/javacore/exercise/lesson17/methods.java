package javacore.exercise.lesson17;

public class methods {
    public static void main(String[] args) {

        sayiBulmaca();

    }


    public static void sayiBulmaca(){

        int[] sayilar = new int[]{1,3,5,7,9};

        int aranacaklar =5 ;

        boolean varMi = false;


        for (int sayi : sayilar){
            if(sayi == aranacaklar){
                System.out.println("Aranacak Sayi Bulundu !!");
                System.out.println("Bulunan Sayi :  " + sayi );
                varMi = true;
                break;
            }
        }

        if (varMi){
            System.out.println("Sayı Mevcuttur");
        }else{
            System.out.println("Sayı mevcut değildir !!");
        }

    }

}
