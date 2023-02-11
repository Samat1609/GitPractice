package arraylist;

import java.util.ArrayList;

public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> vb = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Samat");
        StringBuilder sb2 = new StringBuilder("Sagmat");
        StringBuilder sb3 = new StringBuilder("Samhhat");
        StringBuilder sb4 = new StringBuilder("Samg at");
        StringBuilder sb5 = new StringBuilder("Samatggg");
        vb.add(sb1);
        vb.add(sb2);
        vb.add(sb3);
        vb.add(sb4);
        vb.add(sb5);
        for (int i = 0; i < vb.size(); i++) {
            vb.get(i).append("^^^^^^^^^");
        }
        for (StringBuilder i : vb) {
            System.out.println(i);
        }
        ArrayList<String>nm=new ArrayList<>();
        nm.add("dkdk");
        nm.add("fgfgf");
        nm.add("ererere");
        ArrayList<String>name=new ArrayList<>(nm);
        System.out.println(name);
        System.out.println(name.get(1));
        name.remove(0);
        System.out.println(name);
        System.out.println(name.isEmpty());
        System.out.println(name.contains("fkkffk"));


    }
}
