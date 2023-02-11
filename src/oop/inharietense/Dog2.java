package oop.inharietense;

public class Dog2 extends Dog{

    public double weight;


    public Dog2(String name, int age, int id, String breed) {
        super(name, age, id, breed);
    }

    public Dog2(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }
}
