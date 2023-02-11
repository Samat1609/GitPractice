package oop.acter;

import java.util.*;

public class ArtistMain {
    public static void main(String[] args) {
        Artist artist=new Artist("Атабеков");

        ArrayList<String> sings=new ArrayList<>();
        sings.add("Сени суйом");
        sings.add("Кызганамын");
        sings.add("Кечки Бишкек");


        Scanner scanner =new Scanner(System.in);
        String rep= scanner.nextLine();

        Map<String,String>name_sings=new HashMap<>();
        name_sings.put(artist.name, String.valueOf(sings));




    }
}
