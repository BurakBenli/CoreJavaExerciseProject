package javacore.exercise.lesson12;

public class miniProjeAsalSayı {
    public static void main(String[] args) {

        int number = 23;

        boolean isPrime = true;

        if (number==1){
            System.out.println("Asal sayı değildir!!");
        }

        if (number<1){
            System.out.println("Geçersiz Sayı!!");
        }

        for (int i=2;i<number;i++){
            if(number % i == 0){
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println("Sayı asaldır");
        }else{
            System.out.println("Sayı asal değildir");
        }



    }
}
