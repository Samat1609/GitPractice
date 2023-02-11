package artist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Artist begish=new Reper("Begish","reper");
        Artist atabekov=new Singer("Atabekov","singer");

        Scanner scanner=new Scanner(System .in);
        System.out.println("Выберите композиции");
        String question= scanner.nextLine();

        List<String>atabekovsSong=new ArrayList<>();
        atabekovsSong.add("Кечки Бишкек");
        atabekovsSong.add("Сурдотбочу");
        atabekovsSong.add("Жалынам");

        List<String>begihsSong=new ArrayList<>();
        begihsSong.add("Сагынамын");
        begihsSong.add("Кайдасын");
        begihsSong.add("Суйом сени");


    }
}
