package Platforma;

import java.util.Scanner;

public class Pozitive {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        if (num>0){
            System.out.println("Положительный");
        }else{
            System.out.println("Отрицательный");
        }
    }
}
