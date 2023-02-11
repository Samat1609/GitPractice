package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {
        HashSet set1=new HashSet<>();
        set1.add(22);
        set1.add(true);
        set1.add("SAMAT");
         HashSet<Character>set2=new HashSet<>();
         set2.add('a');
         set2.add('b');
         set2.add('e');
         set2.add('c');
         set2.add('d');
         set2.add('w');
        System.out.println(set2);

        LinkedHashSet<String>set3=new LinkedHashSet<>();
        set3.add("SAMAT");
        set3.add("djdj");
        set3.add("blue");
        set3.add("dkdk");
        System.out.println(set3);

        TreeSet<Integer>set4=new TreeSet<>();
        set4.add(12);
        set4.add(54);
        set4.add(40);
        set4.add(2);
        System.out.println(set4);

        Set<Float>num=new HashSet<>();
        num.add(12.3f);
        num.add(34.4f);
        num.add(2.5f);
        System.out.println(num);
        System.out.println(num.size());
        System.out.println(num.contains(12.3f));







    }
}
