package javacore.exercise.lesson12;

public class miniProjeAsalSayı {
    public static void main(String[] args) {

        int number = 3;

        int remeinder = number % 2 ;

    //    System.out.println(remeinder);

        boolean isPrime = true;

        if (number == 1){
            System.out.println("Sayı Asal Değildir !!");
            return;
        }

        if (number<1){
            System.out.println("Geçersiz Sayı !!");
        }


        for(int i=2;i<number;i++){
            if(number % i  == 0){
                isPrime = false;
            }
        }

        if (isPrime == true){
            System.out.println("Sayı asaldır");
        }else{
            System.out.println("Sayı Asal Değildir");
        }

    }
}
