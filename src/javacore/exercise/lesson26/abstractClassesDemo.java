package javacore.exercise.lesson26;

public class abstractClassesDemo {
    public static void main(String[] args) {

        WomonGameCalculator womonGameCalculator = new WomonGameCalculator();
        womonGameCalculator.hesapla();
        womonGameCalculator.gameOver();

        GameCalculator gameCalculator = new WomonGameCalculator();



    }
}
