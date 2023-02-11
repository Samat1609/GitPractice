package codingbat;

import java.util.Arrays;

public class MakeLast {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6};
        System.out.println(Arrays.toString(makeLast(nums)));
    }


    public static  int[] makeLast(int[] nums) {
        int [] vb=new int[nums.length*2];
        vb[nums.length*2-1]=nums[nums.length-1];
        return vb;
    }
}
