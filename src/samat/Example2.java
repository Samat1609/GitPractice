package samat;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        // Delete duplicates Words in String
        String words = "I like coding coding every morning";
        // Find the sum of number in String
        String findSum = "Hello 1 World 2 I 3 am 4 John";

        // Delete  duplicates numbers in Array
        int[] numbers1 = {9, 6, 7, 21, 32, 1, 3, 4, 54, 9, 4, 6, 1, 3, 4, 54};
        System.out.println(Arrays.toString(deleteDublicats(numbers1)));

        System.out.println(deleteDublicateWords(words));


    }
    public static int[] deleteDublicats(int[]nums) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int temp = 0;
        int[] arr = new int[set.size()];
        for (int i: set){
            arr[temp++]=i;
        }
        return arr;
    }
    public static String deleteDublicateWords(String words){
        String []str=words.split(" ");
        Set<String>sets=new LinkedHashSet<>();
        sets.addAll(Arrays.asList(str));
        String sd="";
        for (String i: sets){
            sd=sd+i+" ";

        }
        return sd;
    }





    }


