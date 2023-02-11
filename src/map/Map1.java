package map;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        HashMap<Integer,String>fhonenumbers=new HashMap<>();
        fhonenumbers.put(+996,"Kg");
        fhonenumbers.put(+992,"Tj");
        fhonenumbers.put(+90,"Turkey");
        fhonenumbers.put(+1,"Usa");
        fhonenumbers.put(+7,"Ru");
        System.out.println(fhonenumbers);
        System.out.println(fhonenumbers.get(+1));

        LinkedHashMap<String,String>abrev=new LinkedHashMap<>();
        abrev.put("usa","United");
        abrev.put("ru","russia");
        abrev.put("kg","kyrgyz");
        System.out.println(abrev);

        TreeMap<Character,Integer>unicode=new TreeMap<>();
        unicode.put('a',65);
        unicode.put('q',81);
        unicode.put('`',34);
        System.out.println(unicode);

        TreeMap<String,Float>prices=new TreeMap<>();
        prices.put("apple",23.5f);
        prices.put("green",67.6f);
        prices.put("qwe",34.5f);
        prices.put("bloom",100.3f);
        System.out.println(prices);
        prices.replace("green",100.5f);
        prices.replace("apple",23.5f,111.2f);
        System.out.println(prices);
        System.out.println(prices.entrySet());
        System.out.println();
        System.out.println(prices.get("green"));
        System.out.println(prices.values());
        System.out.println(prices.keySet());
        System.out.println(prices.entrySet());
        System.out.println(prices.size());
        System.out.println(prices.containsKey("apple"));
        System.out.println(prices.containsValue(111.2f));
        System.out.println(prices.remove("green"));
        System.out.println(prices);
        Iterator<String>iterator=prices.keySet().iterator();
//        while (iterator.hasNext()){
//            String keys= iterator.next();
//            System.out.println(keys+": "+prices.get(keys));
//        }
        Iterator<Map.Entry<String,Float>>iter=prices.entrySet().iterator();
        while (iter.hasNext()){

        }

    }
}
