package javacore.exercise.lesson13;

public class sesliHarfler {
    public static void main(String[] args) {

        char harf = 'I';

        switch (harf){
            case 'A' :
            case 'E':
            case 'O':
            case 'U':
            System.out.println("Kalın Sesli Harf");
            break;

            default:
            System.out.println("İnce sesli harf ");


        }


    }
}
