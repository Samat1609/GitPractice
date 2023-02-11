package oop.acter;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Reper extends Artist {
    Scanner scanner = new Scanner(System.in);
    String rep = scanner.nextLine();


    public Reper(ArrayList<String> sings, Map<String, String> name_sings) {
        super(sings, name_sings);
    }
}
