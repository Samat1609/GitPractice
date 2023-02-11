package codingbat;

import java.util.Arrays;

public class SwapEnds {
    public static void main(String[] args) {
        int []nums={1,2,3,4};
        SwapEnds ob = new SwapEnds();
        System.out.println(Arrays.toString(ob.swapEnds(nums)));
    }


    public int[] swapEnds(int[] nums) {
        if (nums.length>1){
            return new int[]{nums[nums.length-1],nums[nums.length/2-1],nums[nums.length/2],nums[0]};
        }else {
            return nums;
        }
    }
}
