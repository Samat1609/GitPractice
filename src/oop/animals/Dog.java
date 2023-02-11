package oop.animals;

public class Dog {
    String name;
    int age;
    double height;
    char gender;


    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age) {
        this.age = age;
    }

    public static int run(int age){
        return age;
    }
    public void sleep(String name){
        System.out.println("Name : "+name);
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public String toString1() {
        return "Dog{" +
                "age=" + age +
                '}';
    }
}
