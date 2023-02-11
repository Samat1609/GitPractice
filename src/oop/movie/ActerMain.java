package oop.movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ActerMain {
    public static void main(String[] args) {

        ArrayList<String>filmlists=new ArrayList<>();
        filmlists.add("black");
        filmlists.add("red");
        filmlists.add("white");

        Acter bred=new Acter("Bred Pitt",58,filmlists);
        System.out.println(bred);

        Map<String,Integer>nameage=new HashMap<>();
        nameage.put("Samat",34);
        nameage.put("Muras",30);

        Acter acter=new Acter(filmlists,nameage);
        System.out.println(acter);
        System.out.println(bred.acters());

    }

}
