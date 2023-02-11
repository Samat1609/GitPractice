package arrays;

import java.util.Arrays;

public class Arrays9 {
    public static void main(String[] args) {
        int[][][]nums={{{23,45},{23,45,67}},{{12,34,56},{58,67,100},{47,59,23,34,59}}};
        System.out.println(Arrays.deepToString(nums));
        for (int i=0;i< nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                for (int k=0;k<nums[i][j].length;k++){
                    System.out.print(nums[i][j][k]+" ");
                }
                System.out.println();
            }

        }
    }
}
