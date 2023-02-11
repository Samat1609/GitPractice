package oop.abstraction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoMain {
    public static void main(String[] args) {

        Car mers = new Car("Mersedes", 4, "white");
        System.out.println(mers.getName());
        System.out.println(mers.getName() + " " + mers.hong() + "\n " + mers.breaking() +
                "\n" + mers.driving());

        Moto bmw = new Moto("bmw", 2, "black");
        System.out.println(bmw.hong()+ +bmw.getWeels()+"\n"+bmw.breaking()+"\n"+bmw.accelering());

        Tesla tesla=new Tesla("Tesla",4,"black");
        System.out.println(tesla.refuel()+"\n"+tesla.driving());


        List<Vechicle>listOfVechicle=new ArrayList<>();
        listOfVechicle.add(mers);
        listOfVechicle.add(bmw);
        listOfVechicle.add(tesla);

        Map<String,Integer>map=new HashMap<>();
        for (int i=0;i< listOfVechicle.size();i++){
            map.put(listOfVechicle.get(i).getName(),listOfVechicle.get(i).getWeels());
        }

;        for (int i=0;i< listOfVechicle.size();i++){
            if (listOfVechicle.get(i).getWeels()==2){
                listOfVechicle.remove(i);
            }
        }
        System.out.println(listOfVechicle);


    }
}
