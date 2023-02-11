package oop.animals;

public class Animals {
    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animals(String name) {
        this.name = name;
    }

    public Animals(int age) {
        this.age = age;
    }

    String name;
    int age;

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String voice(){
        return  "Voice voice";

    }
}
