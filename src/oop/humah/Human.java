package oop.humah;


public class Human {
    public Human(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Human(int age) {
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
    }

    protected int id;
    public  String name;
    public int age;


    public String read(){
        return "reading";
    }



}
