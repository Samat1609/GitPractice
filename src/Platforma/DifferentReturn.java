package Platforma;

import java.util.Scanner;

public class DifferentReturn {
    public static void main(String[] args) {
        DifferentReturn ob=new DifferentReturn();
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        System.out.println(ob.sum(a,b));
        System.out.println(ob.divice(a,b));
        System.out.println(ob.multiply(a,b));
        System.out.println(ob.subtract(a,b));

    }
    public int sum(int a,int b){
        return a+b;
    }
    public int divice(int a,int b){
        return a/b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int subtract(int a,int b){
        return a-b;
    }

}
