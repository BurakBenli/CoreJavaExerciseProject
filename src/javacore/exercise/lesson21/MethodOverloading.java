package javacore.exercise.lesson21;

public class MethodOverloading {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.topla(2,3);
        System.out.println(sonuc);

        System.out.println(dortIslem.topla(3,4,5));


    }
}
