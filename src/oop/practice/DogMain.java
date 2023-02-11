package oop.practice;

public class DogMain {
    public static void main(String[] args) {


        Animals animals = new Animals("rex", 3, 12345);
        System.out.println(animals);
        System.out.println(animals.getId());

        Dog dog = new Dog("mumu", 4, 123, "pit-bull");
        System.out.println(dog);
        System.out.println(dog.getId());
        System.out.println(dog.breed);
        System.out.println();
        Dog dog2=new Dog("xaski",4,"buldok");
        System.out.println(dog2);
    }
}
