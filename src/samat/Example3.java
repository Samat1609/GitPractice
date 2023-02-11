package samat;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example3 {
    public static void main(String[] args) {
        // swap two numbers without using a temporary variable
        int numX = 10;
        int numY = 20;

        numX=numX+numY;
        numY=numX-numY;
        numX=numY+numY;
        System.out.println("NumX "+numX+"\n"+"NumY "+numY);

        // reverse text without StringBuffer class
        String reverserText = "987654321";
        System.out.println(reverse(reverserText));

        // Sort Array without method sort
        int[] numbers = {9, 6, 7, 21, 32, 1, 3, 4, 54};
        System.out.println(Arrays.toString(sortOfArrays(numbers)));

        // Delete  duplicates numbers in Array
        int[] numbers1 = {9, 6, 7, 21, 32, 1, 3, 4, 54, 9, 4, 6, 1, 3, 4, 54};
        System.out.println(Arrays.toString(deleteDublicats(numbers1)));
    }
    public static String reverse(String words){
        String str="";
        for (int i=words.length()-1;i>=0;i--){
            str+=words.charAt(i);
        }
        return str;
    }
    public static int[]sortOfArrays(int[]nums){
        for (int i=0;i< nums.length;i++){
            int temporary=0;
            for (int k=i+1;k< nums.length;k++){
                if (nums[i]>nums[k]){
                    temporary=nums[i];
                    nums[i]=nums[k];
                    nums[k]=temporary;

                }
            }
        }
        return nums;
    }
    public static int[] deleteDublicats(int[]nums){
        Set<Integer>sets=new HashSet<>();
        for (int i=0;i< nums.length;i++){
            sets.add(nums[i]);
        }
        int temp=0;
        int []arr=new int[sets.size()];
        for (int i: sets){
            arr[temp++]=i;
        }
        return arr;
    }
}
