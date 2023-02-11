package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map2 {
    public static  void main(String[] args) {


        ArrayList<String>name=new ArrayList<>();
        name.add("jdj");
        name.add("fjfjf");
        Map<Integer,String>names=new HashMap<>();
        names.put(1, String.valueOf(name));
        System.out.println(names.entrySet());
        System.out.println(names.values());
        System.out.println(names.keySet());
        System.out.println(names.values());

        System.out.println(names);



    }
}
