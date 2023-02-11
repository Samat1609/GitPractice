package Platforma;

import java.util.Scanner;

public class Accept {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Years in college");
        int year= scanner.nextInt();
        System.out.println("Years of programming experience");
        int experience= scanner.nextInt();
        System.out.println("GPA");
        double mark= scanner.nextDouble();
        System.out.println(interwiew(year,experience,mark));

    }
    public static boolean interwiew(int year,int experience,double mark){
        if (year>4 && (experience>=2 || mark>3.5)){
            return true;
        }else{
            return false;
        }
    }
}
