package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NewJava8ListSearchExample {
    public static void main(String[] args) {

        List<String> lines = Arrays.asList("Renault","Kia","Honda","Porsche");
        List<String> resultList =  lines.stream().filter(line-> !"Honda".equals(line)).collect(Collectors.toList());
        resultList.forEach(System.out::println);

    }
}
