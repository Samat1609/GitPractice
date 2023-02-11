package Platforma;

import java.util.Scanner;
import java.lang.Math;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();
        int resultMax=Math.max(num,Math.max(num2,num3));
        System.out.println("Максимальное число "+resultMax);
        int resultMin=Math.min(num,Math.min(num2,num3));
        System.out.println("Минимальное число "+resultMin);
    }
}
