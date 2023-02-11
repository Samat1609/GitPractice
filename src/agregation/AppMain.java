package agregation;

public class AppMain {
    public static void main(String[] args) {

        Battery battery=new Battery(12);
        HeadFhone headFhone=new HeadFhone("right","left");

       Fhone fhone=new Fhone(12345,"Nokia","6300",12.5,headFhone);
        System.out.println(fhone);

        Fhone fhone1=new Fhone(123,"Samsung","1100",10.4,battery);
        System.out.println(fhone1);

        System.out.println(fhone.battery.charging());


    }
}
