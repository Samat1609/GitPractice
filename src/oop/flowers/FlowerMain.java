package oop.flowers;

public class FlowerMain {
    public static void main(String[] args) {
        Plant object=new Plant("Flower","white");
        System.out.println(object);
        System.out.println(object.blossom());

        Roza roze=new Roza("Roza","red");
        System.out.println(roze);
        System.out.println(roze.blossom());

        Plant tulic=new Roza("Tulic","yellow");
        System.out.println(tulic);

        System.out.println();

        Plant roza1=new SpreyRoza("Sprayroza1","pink1");
        System.out.println(roza1);
        System.out.println(roza1.blossom());
        Roza roza2=new SpreyRoza("Spreyroza2","pink2");
        System.out.println(roza2);
        SpreyRoza roza3=new SpreyRoza("Spreyroza3","pink3");
        System.out.println(roza3);
        roza3.setColor("sisim");
        System.out.println(roza3);

        final String HOBBY="dance";


    }
}
