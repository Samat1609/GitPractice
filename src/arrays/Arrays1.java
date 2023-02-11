package arrays;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {


        int[] num = new int[2];
        num[0]=21;
        num[1]=56;
        int[] num2={23,45,67};
        String [] name={"Samat","Azamat","Melis","Molmol"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.binarySearch(name,"Samat"));


        System.out.println("__________________");
        System.out.println(Arrays.toString(name));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println(num2[2]);
        System.out.println(num[1]);
        System.out.println(Arrays.toString(num));

        char[] vb={'a','d','f','b'};
        Arrays.sort(vb);
        System.out.println(Arrays.toString(vb));
        System.out.println(Arrays.binarySearch(vb,'f'));



    }
}
