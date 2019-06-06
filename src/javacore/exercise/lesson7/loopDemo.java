package javacore.exercise.lesson7;

public class loopDemo {
    public static void main(String[] args) {

        // for loop
        for (int i=1;i<=10;i+=2){
            System.out.println(i);
        }

        System.out.println("For Döngüsü Bitti");


        // while loop

        int i =1;
        while (i<10){
            System.out.println(i);
            i++;
        }

        System.out.println("While Döngüsü Bitti");


        //do-while loop
        int j = 11;
        do {
            System.out.println(j);
            j++;
        }while (j<10);


        System.out.println("Do-While Döngüsü Bitti");





    }
}
