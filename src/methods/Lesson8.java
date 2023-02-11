package methods;

import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу");
        String word= scanner.nextLine();
        palindrom(word);
    }

    public static void palindrom(String word){
        StringBuilder str=new StringBuilder(word);
        String vb=str.reverse().toString();

        if (vb.equals(word)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Ne palindrom");
        }
    }
}
