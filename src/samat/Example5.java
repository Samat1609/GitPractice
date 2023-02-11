package samat;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example5 {
    public static void main(String[] args) {
        // swap two numbers without using a temporary variable
        int numX = 10;
        int numY = 20;

        numX=numY+numX;
        numY=numX-numY;
        numX=numY+numY;
        System.out.println(numX+"\n"+numY);

        // reverse text without StringBuffer class
        String reverserText = "987654321";
        System.out.println(reverse(reverserText));

        // Sort Array without method sort
        int[] numbers = {9, 6, 7, 21, 32, 1, 3, 4, 54};

        System.out.println(Arrays.toString(sorted(numbers)));

        // Delete  duplicates numbers in Array
        int[] numbers1 = {9, 6, 7, 21, 32, 1, 3, 4, 54, 9, 4, 6, 1, 3, 4, 54};

        System.out.println(Arrays.toString(delete(numbers1)));

        // Delete duplicates Words in String
        String duplicateWords = "I like coding coding every morning";

        System.out.println(dleteDublicats(duplicateWords));
    }
    public static String reverse(String str){
        String count="";
        for (int i=str.length()-1;i>=0;i--){
            count+=str.charAt(i);
        }
        return count;
    }
    public static int[]sorted(int[]nums){
        for (int i=0;i< nums.length;i++){
            for (int k=i+1;k< nums.length;k++){
                int temporary;
                if (nums[i]>nums[k]){
                    temporary=nums[i];
                    nums[i]=nums[k];
                    nums[k]=temporary;
                }
            }
        }
        return nums;
    }
    public static int[]delete(int[]a){
        Set<Integer>set=new HashSet<>();
        for (int i:a){
            set.add(i);
        }
        int []arr=new int[set.size()];
        int temp=0;
        for (int g:set){
            arr[temp++]=g;
        }
        return arr;
    }
    public static String dleteDublicats(String str){
        Set<String>stringSet=new LinkedHashSet<>();
        String[] words=str.split(" ");
        stringSet.addAll(Arrays.asList(words));
        String str2="";
            for (String k: stringSet){
                str2=str2+k+" ";
            }
            return str2;
        }


    }


