package oop.inharietense;

public class Dog extends Animal {

    public String breed;
    public Dog(String name, int age, int id) {
        super(name, age, id);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public Dog(String name, int age, int id, String breed) {
        super(name, age, id);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +" : "+getId()+" "+
                ", breed='" + breed + '\'' +
                '}';
    }
}
