package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import static Platforma.IsOdd.name;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<String>name=new ArrayList<>();
        name.add("Samat");
        name.add("Muras");
        name.add(1,"Aidin");
        for (String i :name){
            System.out.println(name.get(Integer.parseInt(i)));
            }
        }
        }


