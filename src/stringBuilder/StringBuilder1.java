package stringBuilder;

public class StringBuilder1 {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder();
        sb.append("1234567890123456");  //34
        sb.append("123456789012345678");
        System.out.println("Sb--> "+sb.capacity());

        StringBuilder sb1=new StringBuilder("Hello world!");  //28
        sb1.append(" Atbashy123456789");
        System.out.println("Sb1--> "+sb1.capacity());

        StringBuilder sb3=new StringBuilder(4);
        sb3.append("asd12");
        sb3.append("123456");
        //sb3.append("asd");
        //sb3.append("asdfq");  //22
        //sb3.append("123456789012");

        System.out.println("Sb3--> "+sb3.capacity());


    }
}
