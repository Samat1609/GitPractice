package arrays;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int[][] nums = new int[2][3];
        nums[0][0] = 23;
        nums[0][1] = 67;
        nums[0][2] = 2;
        nums[1][0] = 63;
        nums[1][1] = 100;
        nums[1][2] = 23;

        int[][] vb = {nums[0]};
        System.out.println(Arrays.deepToString(vb));


        System.out.println("____________");
        System.out.println(Arrays.deepToString(nums));
        System.out.println(nums[0][2]);
        System.out.println(nums[1][0]);
        Arrays.sort(nums, 0, 1);
        System.out.println(Arrays.deepToString(nums));
        Arrays.sort(nums[0]);
        System.out.println(Arrays.deepToString(nums));


        int [][]numbers=new int[3][2];
        numbers[0][0]=12;
        numbers[0][1]=1;
        numbers[1][0]=34;
        numbers[1][1]=3;
        numbers[2][0]=4;
        numbers[2][1]=100;
        System.out.println(Arrays.deepToString(numbers));

        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++){
                System.out.print(numbers[i][j]+"\t");
            }
            System.out.println();
        }

        }

    }








