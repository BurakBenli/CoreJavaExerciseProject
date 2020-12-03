package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeforeJava8ListSearch {
    public static void main(String[] args) {

        List<String> lines = Arrays.asList("Renault","Kia","Honda","Porsche");
/*        for (String line:lines){
            System.out.println(line);
        }
*/
        List<String> resultList = getFilterOutput(lines,"Honda");
        for (String resultLine : resultList){
            System.out.println(resultLine);
        }


    }

    public static List<String> getFilterOutput(List<String> lines,String filter){
        List<String> result = new ArrayList<>();
        for (String line : lines){
            if (!filter.equals(line)){
                result.add(line);
            }
        }
        return result;
    }
}
