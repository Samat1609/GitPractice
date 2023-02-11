package string;

public class Switch2 {
    public static void main(String[] args) {
        String str="ZOOM link";
        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());

        //replace

        System.out.println(str.replace('O','D'));

        StringBuilder name=new StringBuilder("Lenovo");
        name.append(2005);
        name.append('e');
        System.out.println(name);
    }
}
