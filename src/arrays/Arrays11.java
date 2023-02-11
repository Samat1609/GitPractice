package arrays;

public class Arrays11 {
    public static void main(String[] args) {
        int[]nums={12,65,9,0,-8,5,10,56};
        sake(nums);

    }
    static void sake(int[]nums){
        int max=nums[0];
        int min=nums[0];
        for (int i=0;i<nums.length;i++){
            if (max<nums[i]){
                max=nums[i];
            }
            if (min>nums[i]){
                min=nums[i];
            }
        }
        System.out.println("Max : "+max+"\n"+"Min : "+min);
    }
}
