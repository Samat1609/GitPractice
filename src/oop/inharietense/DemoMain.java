package oop.inharietense;

public class DemoMain {
    public static void main(String[] args) {

        Animal animal=new Animal("Rex",3,12345);
        System.out.println(animal);
        Dog dog=new Dog("Laika",4,23456);
        System.out.println(dog);

        Dog dog1=new Dog("Fda",4,123456,"pitbull");
        System.out.println(dog1);
    }
}
