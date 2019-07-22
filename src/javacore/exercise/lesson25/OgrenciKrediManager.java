package javacore.exercise.lesson25;

public class OgrenciKrediManager extends BaseKrediManager {
    public double hesapla(double tutar){
        System.out.println("Ogrenci Kredi Değeri ");
        return tutar * 1.10;
    }
}
