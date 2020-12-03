package java8.stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsAndFilterExamples {
    public static void main(String[] args) {

        //Streams And Filter Example

        List<String> lines = Arrays.asList("spring","node","java","maven");
        List<String> result = getFilterOutput(lines,"spring");
        for (String temp: result){
            System.out.println(temp);
        }
    }

    public static List<String> getFilterOutput(List<String> lines , String filter){
        List<String> result = new ArrayList<>();
        for (String line : lines){
            if (!"spring".equals(line)){
                result.add(line);
            }
        }
        return result;
    }
}
