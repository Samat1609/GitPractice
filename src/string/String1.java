package string;


import javax.jws.soap.SOAPBinding;
import java.util.Locale;
import java.util.Random;

public class String1 {
    public static void main(String[] args) {

        Random random=new Random();
        int vb= random.nextInt(4);
        System.out.println(vb);
        String name="Samat";
        String name1=new String("Samat");
        System.out.println(name+"\n"+name1);

        String word="Nomads";
        System.out.println(word.length());
        System.out.println(word.indexOf('s'));
        String phrase="Salanamayhjbhjjhb";
        //            0123456789012345678
        System.out.println(phrase.indexOf("fly"));
        System.out.println(phrase.indexOf("I"));

        System.out.println(phrase.charAt(13));
        System.out.println(phrase.charAt(2));

        System.out.println(word.concat(phrase));
        System.out.println(word.indexOf('m',3));

        System.out.println(name.substring(1,3));
        System.out.println(word.substring(3));

//        String vb="SALAMAT";
        String vb1="SAlamat";
//        System.out.println(vb.equalsIgnoreCase(vb1));

        int hello="Samat".indexOf('m');
        System.out.println(hello);

        String str="BISHkek312";
        System.out.println(str.equalsIgnoreCase(String.valueOf(true)));

        System.out.println("_______________");

        String str2=str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();



        String mv=String.valueOf(12);
        String mv1=String.valueOf('e');
        String mv2=String.valueOf(false);

















    }
}
