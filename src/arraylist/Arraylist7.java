package arraylist;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arraylist7 {
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(12);
        nums.add(1);
        nums.add(22);
        nums.add(100);
        nums.add(24);
        nums.add(5);
        System.out.println(nums);
        Iterator<Integer>iterator= nums.iterator();
        while (iterator.hasNext()){
            Integer i= iterator.next();
            if (i<10){
                iterator.remove();
            }
        }
        System.out.println(nums);


        }

    }
