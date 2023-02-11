package oop.acter;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Artist {
    String name;
    ArrayList<String> sings = new ArrayList<>();
    Map<String, String> name_sings = new LinkedHashMap<>();
    Scanner scanner =new Scanner(System.in);
    String rep= scanner.nextLine();

    public Artist(ArrayList<String> sings, Map<String, String> name_sings) {
        this.sings = sings;
        this.name_sings = name_sings;
    }

    public Artist(String name) {
        this.name = name;
    }

   public void kompoziciya(){
        if (name.equals(rep)){
            System.out.println(name_sings);
        }
    }

    @Override
    public String toString() {
        return "Artist{" +
                "sings=" + sings +
                ", name_sings=" + name_sings +
                '}';
    }
}
