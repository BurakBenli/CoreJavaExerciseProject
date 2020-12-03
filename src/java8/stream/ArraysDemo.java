package java8.stream;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class ArraysDemo {
    public static void main(String[] args) {

        System.out.println("One Dimension Array");

        int[] intArray = {1,2,3,4,5,6,7,8};
        String intArrayString = Arrays.toString(intArray);
        System.out.println(intArrayString);
        System.out.println("Hello World!!");

        String[] stringArray = {"a","b","c","d","e","f"};
        boolean value = Arrays.asList(stringArray).contains("b");
        System.out.println(value);

        int[] intArray2 = {1,2,3,4,5,6,7,8};
        int[] intArray3 = {5,6,7,8,9};
        int[] combinedIntArray = ArrayUtils.addAll(intArray2,intArray3);
        for(int i=0;i<combinedIntArray.length ;i++){
            System.out.print(combinedIntArray[i]+",");
        }

        System.out.println("One Dimension Array");


        String[] stringArrays = {"a","b","c","d","e","f"};
        boolean b = Arrays.asList(stringArray).contains("c");
        System.out.println(b);

        //concatenate two arrays
        int[] numbers = {12,33,55,67,81,32,45};
        int[] numbers2 = {31,32,33,34,35,37,99};
        int[] combinedIntArray2 = ArrayUtils.addAll(numbers,numbers2);
        for (int i=0;i<=combinedIntArray.length;i++){
            System.out.print(combinedIntArray2[i]+" , ");
        }

        //remove arrray element
        int[] removedArray = ArrayUtils.removeElement(combinedIntArray2,33);
        System.out.println("Removed Array" + ArrayUtils.toString(removedArray));
    }
}
