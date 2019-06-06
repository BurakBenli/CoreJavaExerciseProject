package javacore.exercise.lesson11;

public class stringsDemo {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";



        System.out.println(mesaj);
        System.out.println("Mesajın uzunlugu " + mesaj.length());
        System.out.println("5.Eleman " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakter = new char[5];
        mesaj.getChars(0,5,karakter,0);
        System.out.println(karakter);
        System.out.println(mesaj.indexOf('a'));



    }
}
