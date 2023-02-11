package Platforma;

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the 5 numbers");
        int num= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();
        int num4= scanner.nextInt();
        int num5= scanner.nextInt();
        int resultOfSum=num+num2+num3+num4+num5;
        int average=(num+num2+num3+num4+num5)/5;
        System.out.println("The sum of 5 no is : "+resultOfSum+"\n"+"The Average is : "+average);




    }
}
