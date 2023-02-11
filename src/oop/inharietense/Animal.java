package oop.inharietense;

public class Animal {

    public  String name;
    protected int age;
    private int id;

    public Animal(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String voice(){
        return  "aaaaaaaa";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

