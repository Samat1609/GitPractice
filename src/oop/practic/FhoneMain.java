package oop.practic;

public class FhoneMain {
    public static void main(String[] args) {
        Fhone samsung = new Fhone(707298949,"Samsung",405.55);

        Fhone nokia=new Fhone(709796609,"Nokia",345.56);


        Fhone katel=new Fhone(550717393,"Katel",345.55);


        System.out.println("Samsung :\n"+samsung.getNumber()+"\n"+samsung.getModel()+"\n"+samsung.getWeight());
        System.out.println();
        System.out.println("Nokia :"+"\n"+nokia.getNumber()+"\n"+nokia.getModel()+"\n"+nokia.getWeight());
        System.out.println();
        System.out.println("Katel :"+"\n"+katel.getNumber()+"\n"+katel.getModel()+"\n"+katel.getWeight());

        System.out.println(samsung.receiveCall("Samat"));
        System.out.println(nokia.receiveCall("Muras"));
        System.out.println(katel.receiveCall("Aidin"));

        System.out.println(samsung.getNumber());
        System.out.println(nokia.getNumber(nokia.getNumber()));
        System.out.println(katel.getNumber(katel.getNumber()));

        System.out.println(samsung.receiceCall("Samat", samsung.getNumber()));
        System.out.println(nokia.receiceCall("Muras", nokia.getNumber()));
        System.out.println(katel.receiceCall("Aidin", katel.getNumber()));


    }
}
