package oop.exception;

import java.util.Scanner;

public class Person1 {
    public static void main(String[] args) {


        int age = 16;
        int denver=7;
        do {
            System.out.println("Can get a passport");
        }while (denver>age);

        int num=0;

        Scanner scanner=new Scanner(System.in);
        int num3= scanner.nextInt();


        try {
            int[]nums=new int[3];
            System.out.println(nums[num3]);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Samat Abdraev");






    }
}
