package oop.practice;

public class Dog extends Animals{
    String breed;

    public Dog(String name, int age, int id, String breed) {
        super(name, age, id);
        this.breed = breed;
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + getId() +
                '}';
    }

}
