package javacore.exercise.lesson25;

public class Overriding {
    public static void main(String[] args) {

        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        System.out.println(ogretmenKrediManager.hesapla(1000));

        System.out.println("*****************");

        BaseKrediManager[] baseKrediManagers = new BaseKrediManager[]{new TarımKrediManager(),new OgretmenKrediManager(),new OgrenciKrediManager()};

        for(BaseKrediManager krediManager:baseKrediManagers){
            System.out.println(krediManager.hesapla(1000));
        }

    }
}
