package Platforma;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1= scanner.nextInt();
        System.out.println("Enter the second number");
        int num2= scanner.nextInt();
        System.out.println("Enter the third number");
        int num3= scanner.nextInt();
        if (num1+num2==num3){
            System.out.println("The result is :  "+true);
        }else{
            System.out.println("The result is :  "+false);
        }


    }
}
