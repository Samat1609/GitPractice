package homeWork;

import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите доллар");
        int dollar= scanner.nextInt();
        System.out.println(kurs(dollar,83));
    }
    public static int kurs(int dollar,int som){
        return dollar*som;
    }





}

