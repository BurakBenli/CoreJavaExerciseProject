package javacore.exercise.lesson6;

public class switch_exercise {
    public static void main(String[] args) {

        //switch_blokları_demo

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel");
                break;
            case 'B':
                System.out.println("Çok Güzel Geçtiniz!!");
                break;
            case 'C':
                System.out.println("Geçtiniz");
                break;
            default:
                System.out.println("Gçersiz Not Girdiniz!!");
        }

    }
}
