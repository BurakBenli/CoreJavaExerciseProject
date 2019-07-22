package javacore.exercise.lesson18;

public class classes {
    public static void main(String[] args) {

        //classes demos

        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi1);


        int[] sayilar = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};

        sayilar2 = sayilar;

        sayilar[0] = 10;
        System.out.println(sayilar2[0]);






    }
}
