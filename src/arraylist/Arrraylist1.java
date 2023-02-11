package arraylist;

import java.util.ArrayList;

public class Arrraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(356);
        System.out.println(nums);
        ArrayList<Integer>num=new ArrayList<>();
        num.add(100);
        num.add(101);
        num.add(78);
        num.add(2,111);
        System.out.println(num);
        num.set(2,222);
        for (Integer i : num){
            System.out.println(i);
        }
        System.out.println(num.get(2));

        System.out.println();
        num.add(nums.get(1));
        System.out.println(num);
        num.addAll(nums);
        System.out.println(num);
        System.out.println(num.get(3));
        int a=num.remove(3);
        System.out.println(a);
        System.out.println(num);
        System.out.println(num.isEmpty());
        System.out.println(num.contains(100));
    }
}
