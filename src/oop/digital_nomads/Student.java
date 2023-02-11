package oop.digital_nomads;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {
    public int id;
    public String name;
    private int age;

    public Student(){

    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String  learnJava(){
        return "learning";
    }
}
