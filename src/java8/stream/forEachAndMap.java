package java8.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class forEachAndMap {
    public static void main(String[] args) {

        //for Each And Map Exercise
        Map<String,Integer> items = new HashMap<>();
        items.put("A",10);
        items.put("B",11);
        items.put("C",12);
        items.put("D",13);
        items.put("E",14);

        /*
        for (Map.Entry<String,Integer> entry :items.entrySet()){
            System.out.println("Items : " + entry.getKey() + "   Count  "+ entry.getValue());
        }
        */

        //tems.forEach((k,v)-> System.out.println("Item : " + k + " Count " + v));

        items.forEach((k,v)->{
            System.out.println("Item : " + k + " Count : " + v);
            if("E".equals(k)){
                System.out.println("Hello E");
            }
        });

        //filter
        List<String> citys = new ArrayList<>();
        citys.add("İstanbul");
        citys.add("Çanakkale");
        citys.add("İzmir");
        citys.add("Çorum");
        citys.add("Malatya");
        citys.add("Ankara");

        citys.stream().filter(c->c.contains("Ankara")).forEach(System.out::println);

    }
}
