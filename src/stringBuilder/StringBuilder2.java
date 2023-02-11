package stringBuilder;

public class StringBuilder2 {
    public static void main(String[] args) {
        // .tostring();
//        StringBuilder sb1=new StringBuilder("Hello");sb1.append(" World");
//        System.out.println(sb1.toString());
//
//        StringBuilder sb2=new StringBuilder(23);
//        System.out.println(sb2.toString());
//
//        // insert
//        StringBuilder sb3=new StringBuilder("Samat");
//        sb3.insert(2,'d');
//        System.out.println(sb3);
//
//        // replace
//        StringBuilder sb4=new StringBuilder("Hello");
//        sb4.replace(1,4,"dsfs");
//        System.out.println(sb4);
//
//        StringBuilder sb5=new StringBuilder("Samat");
//        System.out.println(sb5.indexOf("m"));
//        System.out.println(sb5);
//        String name=sb5.substring(1,3);
//        System.out.println(name);
//
//
//        StringBuffer sf=new StringBuffer();
//        sf.append(12);
//        sf.append(34);
//        System.out.println(sf);

        StringBuilder name=new StringBuilder("Samat");
        System.out.println(name.length());
        System.out.println(name.substring(3));
        name.append("takala");
        System.out.println(name.indexOf("t"));
        System.out.println(name.charAt(3));
    }
}
