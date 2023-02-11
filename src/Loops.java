import java.awt.font.FontRenderContext;

public class Loops {
    public static void main(String[] args) {
        String str="the";
        Loops ob=new Loops();
        System.out.println(name1(str));

    }

    public static String name1(String str){
        String vb="";
        for (int i=0;i<str.length();i++){
            vb=vb+str.charAt(i)+str.charAt(i);

        }
        return vb;

    }
}


