package oop.practice;

public class Animals {

    public String name;
    protected int age;
    private int id;

    public Animals(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  static void voice(){
        System.out.println("aaaaaaa");
    }public String sleep(){
        return "uuuuuuwww";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
