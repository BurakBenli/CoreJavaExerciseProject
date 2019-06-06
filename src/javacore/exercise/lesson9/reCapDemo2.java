package javacore.exercise.lesson9;

public class reCapDemo2 {
    public static void main(String[] args) {

        double[] myList = {11.8,7.5,9.6,4.5};
        double total = 0;
        double maxValue = myList[0];

        for (double number:myList){
            if(maxValue < number){
                maxValue = number;
            }
            total = total + number;
            System.out.println(number);
        }

        System.out.println("Total  " + total);
        System.out.println("Max Value  " + maxValue);
    }
}
