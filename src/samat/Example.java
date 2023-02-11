package samat;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        // swap two numbers without using a temporary variable
        int numX = 10;
        int numY = 20;

      numX=numX+numY; //30
        numY=numX-numY;  // 10
        numX=numY+numY;  //
        System.out.println(numX+"\n"+numY);

        // reverse text without StringBuffer class
        String reverserText = "987654321";
        System.out.println(reverse(reverserText));

        // Sort Array without method sort
        int[] numbers = {9, 6, 7, 21, 32, 1, 3, 4, 54};
        System.out.println(Arrays.toString(sortOfArrays(numbers)));
        System.out.println(Arrays.toString(sortedOfArrays(numbers)));

        // Delete  duplicates numbers in Array
        int[] numbers1 = {9, 6, 7, 21, 32, 1, 3, 4, 54, 9, 4, 6, 1, 3, 4, 54};

    }
    public static String reverse(String word){
        String str="";
        for (int i=word.length()-1;i>=0;i--){
            str=str+word.charAt(i);
        }
        return str;
    }
    public static int[]sortOfArrays(int[] nums){
        for (int i=0;i< nums.length;i++){
            int temp;
            for (int n=i+1;n<nums.length;n++){
                if (nums[i]>nums[n]){
                    temp=nums[i];
                    nums[i]=nums[n];
                    nums[n]=temp;

                }
            }
        }
        return nums;
    }
    public static int[]sortedOfArrays(int[]nums2){
        for (int i=0;i< nums2.length;i++){
            for (int k=i+1;k< nums2.length;k++){
                int temporary;
                if (nums2[i]>nums2[k]){
                    temporary=nums2[i];
                    nums2[i]=nums2[k];
                    nums2[k]=temporary;
                }
            }
        }
        return nums2;
    }

    }














