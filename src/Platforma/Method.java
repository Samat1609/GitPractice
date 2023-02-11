package Platforma;

import javax.jws.soap.SOAPBinding;

public class Method {
    public static void main(String[] args) {
        Method ob=new Method();
        System.out.println(square(5,10));
        System.out.println(ob.perimetr(6,10));

    }
    public static String square(int vs, int sh){
        int area=vs*sh;
        return "The square is : "+area;
    }
    public String perimetr(int vs,int sh){
        int perimetr=2*(vs+sh);
        return "The perimetr is : "+perimetr;
    }
}
