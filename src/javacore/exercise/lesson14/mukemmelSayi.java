package javacore.exercise.lesson14;

public class mukemmelSayi {
    public static void main(String[] args) {

        // 6 --> 1,2,3 1+2+3=6

        int number = 6 ;
        int total = 0;


        for (int i=1;i<number;i++){
            if(number % i == 0){
                total = total + i;
            }
        }

        System.out.println("Total Sayı : " + total);

        if (total == number){
            System.out.println("Mükemmel Sayıdır");
        }else{
            System.out.println("Mükemmel Sayı Değildir");
        }


    }
}
