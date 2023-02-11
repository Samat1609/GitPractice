package codingbat;

public class Sum2 {
    public static void main(String[] args) {
        int []nums={1,2,3};
        Sum2 ob=new Sum2();
        System.out.println(ob.sum2(nums));
    }

    public int sum2(int[] nums) {
        int res=nums[0]+nums[1];
        return res;


    }
}
