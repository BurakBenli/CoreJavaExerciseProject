package javacore.exercise.lesson23;

public class InheritanceDemo {
    public static void main(String[] args) {

        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.Hesapla();

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());

    }
}
