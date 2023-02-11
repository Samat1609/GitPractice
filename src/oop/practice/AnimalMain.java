package oop.practice;

import javax.jws.soap.SOAPBinding;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal=new Animal("Animal",34,12345);
        System.out.println(animal.name);
        System.out.println(animal.voice());
        Animal predator=new Predator("Predator",4,234);
        System.out.println(predator.voice());
        System.out.println(predator.getId());
        System.out.println();
        Tigr tigr=new Tigr("tigr",4,3456);
        System.out.println(tigr);
        System.out.println(tigr.eating());
        System.out.println(tigr.striped());
        Predator lion=new Lion("lion",45,4444);
        System.out.println(lion);
        System.out.println(lion.eating());
        System.out.println(lion);
    }
}
