package SpecialCharacters;

public class SpecialCharacters1 {
    public static void main(String[] args) {
        String fhone="Ifhome 13 pro";

        String fhone2="Samsung \tS22 Ultra";
        String fhone3="Samsung S22 Ultra";
        System.out.println(fhone2);
        System.out.println(fhone3);

        String vb="Samat\b fkfk";
        System.out.println(vb);

        String sd="Samat\nAbdarev";
        System.out.println(sd);

        System.out.println("fbfkjvbfkvjfb\nsamat");
        System.out.println("Samat\rAbdraev");

        System.out.println("Samat\fAbdarev");

        String vb4="molmol \fjfkffk";
        System.out.println(vb4);

        String  bn="I\'am tester";
        System.out.println(bn);

        System.out.println("Samat \"Abdraev\"");

        String  fg="Samat Abdraev-\"djvdjv\"";
        System.out.println(fg);


        System.out.println("New York 25\\7");

        byte er=12;
        short er1=131;
        er=(byte) er1;
        System.out.println(er1);


        int io=3456;
        long nm=489068490;
        io= (int) nm;
        System.out.println(io);

    }

}
