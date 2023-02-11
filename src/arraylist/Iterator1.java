package arraylist;

import java.util.*;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<String> capital = new ArrayList<>();
        capital.add("Bishkek");
        capital.add("Moskow");
        capital.add("Astana");
        System.out.println(capital);

        Iterator<String> iter = capital.iterator();
        while (iter.hasNext()) {
//            if (capital.size()-1=="Astana")
            System.out.println(iter.next());
        }



        String[] symbol = {"q", "w", "e", "r", "t"};
        List<String> list2 = Arrays.asList(symbol);
        Iterator<String> it = list2.iterator();
        while (it.hasNext()){
            if (list2.get(list2.size()-1) =="t"){
                list2.add("u");
            }
            System.out.println(it.next());
        }


    }
}
