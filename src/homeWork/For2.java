package homeWork;

import java.util.Scanner;

public class For2 {
//    2. Есть переменная со значением “nomad”, и если пользователь введёт число,
//    то столько же раз буква “m” должна повторится в этом слове.
//    При чем слово должно распечататься полностью и даже с количеством повторяющихся символов.
//    Например: nommmad || nommmmmmmad

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите сумму");
        int num= scanner.nextInt();
        StringBuilder str=new StringBuilder("nomad");
        for (int i=0;i<num-1;i++){
            str.insert(2,'m');

        }
        System.out.println(str);
    }

}
