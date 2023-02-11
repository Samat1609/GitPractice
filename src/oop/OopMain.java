package oop;

import java.util.HashMap;
import java.util.Map;

public class OopMain {
    public static void main(String[] args) {


        Person1 obj=new Person1();
        obj.name="Samat";
        obj.age=34;

        Person1 obj2=new Person1();
        obj2.name="Muras";
        obj2.age=30;

        Person1 obg3=new Person1();
        obg3.name="Melis";
        obg3.age=34;

        Person1 obj4=new Person1();
        obj4.name="Mirlan";
        obj4.age=31;

        Person1 obj5=new Person1();
        obj5.name="Aidin";
        obj5.age=1;

        Map<String,Integer>maps=new HashMap<>();
        maps.put(obj.name,obj.age);
        maps.put(obj2.name,obj2.age);
        maps.put(obg3.name,obg3.age);
        maps.put(obj4.name,obj4.age);
        maps.put(obj5.name,obj5.age);

        for (Map.Entry<String,Integer> i: maps.entrySet()){
            System.out.println(i.getKey()+" : "+i.getValue());
        }
        System.out.println(Person1.sleep(23));
    }

}
