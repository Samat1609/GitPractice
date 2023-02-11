package arrays;

public class Arrays4 {
    public static void main(String[] args) {

        int[]nums={12,34,7,100,199,243};
        int vb= nums.length;
        for (int i=0;i<vb/2;i++){
            nums[vb-i-1]=nums[i];


        }
        for (int i=0;i< nums.length;i++){
            System.out.println(nums[i]);
        }


    }
}
