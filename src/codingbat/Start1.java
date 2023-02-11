package codingbat;

import java.util.Arrays;

public class Start1 {
    public static void main(String[] args) {
        Start1 ob=new Start1();
        int[]a={7,5};
        int[]b={7,5};
        System.out.println(Arrays.toString(ob.biggerTwo(a,b)));

    }

    public int[] biggerTwo(int[] a, int[] b) {
        if (a[0]+a[1]> b[0]+b[1]){
            return a;
        }else if (a[0]+a[1]==b[0]+b[1]){
            return a;
        }else {
            return b;
        }
    }

}
