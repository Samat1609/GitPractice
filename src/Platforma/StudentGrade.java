package Platforma;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите оценку");
        int mark= scanner.nextInt();
        if (mark>=80){
            System.out.println("A");
        }else if (mark>=60&&mark<80){
            System.out.println("B");
        }else if (mark>=40&&mark<60){
            System.out.println("C");
        }else {
            System.out.println("D");
        }
    }
}
