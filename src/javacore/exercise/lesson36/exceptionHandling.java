package javacore.exercise.lesson36;

public class exceptionHandling {
    public static void main(String[] args) {


        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[4]);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Hatası : " +e);
        }catch (Exception e){
            System.out.println("Loglandı : " +e);
        }
        finally {
            System.out.println("Her zaman çalışır");
        }



    }
}
