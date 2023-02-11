package oop.movie;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Acter {

    public String name;
    protected int age;
    public ArrayList<String>filmlists=new ArrayList<>();
    public Map<String,Integer>nameage=new LinkedHashMap<>();

    public Acter(String name, int age, ArrayList<String> filmlists) {
        this.name = name;
        this.age = age;
        this.filmlists = filmlists;
    }

    public Acter(ArrayList<String> filmlists, Map<String, Integer> nameage) {
        this.filmlists = filmlists;
        this.nameage = nameage;
    }
    public String acters(){
        return this.name+" "+filmlists;
    }

    @Override
    public String toString() {
        return "Acter{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", filmlists=" + filmlists +
                ", nameage=" + nameage +
                '}';
    }
}

