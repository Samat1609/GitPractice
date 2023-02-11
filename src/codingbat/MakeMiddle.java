package codingbat;

import java.util.Arrays;

public class MakeMiddle {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3,4,6,8};
        MakeMiddle ob=new MakeMiddle();
        System.out.println(Arrays.toString(ob.makeMiddle(nums)));
    }


    public int[] makeMiddle(int[] nums) {
        return new int[]{nums[nums.length/2 - 1], nums[nums.length/2]};
//      return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }
    }


