package arrays;

import java.util.Arrays;

public class Arrays7 {
    public static void main(String[] args) {

        int[][] nums=new int[3][2];
        nums[0][0]=12;
        nums[0][1]=21;
        nums[1][0]=34;
        nums[1][1]=356;
        nums[2][0]=56;
        nums[2][1]=89;
        System.out.println(Arrays.deepToString(nums));
        System.out.println(nums[0][1]);

        int[][] num={{12,34,100},{24,8}};
        System.out.println(num[0][2]);
        System.out.println(num[1][1]);

        int[][][]numbers={{{12,34,100},{12,56}},{{21,90},{234,80}}};
        System.out.println(numbers[0][1][1]);
        int[][][]number={{{12,34},{100,100,34}},{{45,67,87},{12,34,56}},{{12,34}}};
        System.out.println(number[1][1][2]);
        System.out.println(Arrays.deepToString(number));
        System.out.println(number[2][0][1]);
        for (int i=0;i< number.length;i++){
            for (int j=0;j<number[i].length;j++){
                for (int k=0;k<number[i][j].length;k++){
                    System.out.print(number[i][j][k]+" ");
                }
                System.out.println();
            }
        }
    }
}
