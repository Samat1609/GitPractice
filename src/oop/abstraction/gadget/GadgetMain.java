package oop.abstraction.gadget;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GadgetMain {
    public static void main(String[] args) {
        Nokia nokia=new Nokia("Nokia","1100",12345);
        Samsung samsung=new Samsung("Samsung","2200",234567);
        System.out.println(nokia);
        System.out.println(samsung);

        nokia.getmodel(nokia.getModel());
        samsung.getmodel(samsung.getModel());

        List<Gadget>gadgetList=new ArrayList<>();
        gadgetList.add(nokia);
        gadgetList.add(samsung);

        Map<String,String>map=new HashMap<>();
        for (int i=0;i< gadgetList.size();i++){
            map.put(gadgetList.get(i).getModel(),gadgetList.get(i).getMark());
            System.out.println(map);
        }
    }
}
