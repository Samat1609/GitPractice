package arrays;

public class Arrays10 {
    public static void main(String[] args) {
        int[]nums={12,3,4,5,-9};
        int[]nums2={12,3,4,5,-9};

        int[]nums3=nums;
        System.out.println(nums==nums2);
        System.out.println(nums.equals(nums2));
        System.out.println(nums3==nums);
        System.out.println(nums3.equals(nums));
        int[]array={1,2,8,-9,100,4,8};
        maxmin(array);




    }
    public static void maxmin(int[] array){
        int max=array[0];
        int min=array[0];
        for (int i=0;i<array.length;i++){
            if (max<array[i]){
                max=array[i];
            }if (min>array[i]){
                min=array[i];
            }
        }
        System.out.println("Max :"+max+"\n"+"Min :"+min);

    }
}

