package Platforma;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num= scanner.nextInt();
        System.out.println("Enter the second number");
        int num2= scanner.nextInt();
        System.out.println(sum(num,num2));
    }
    public static int sum(int num,int num2){
        return num+num2;
    }
}
