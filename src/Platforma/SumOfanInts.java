package Platforma;

import java.util.Scanner;

public class SumOfanInts {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        int num1=num/10;
        int num2=num%10;
        System.out.println(num1+"\n"+num2);
        int result=num1+num2;
        System.out.println("Сумма: "+result);
    }
}
