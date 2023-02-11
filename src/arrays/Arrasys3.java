package arrays;

import javax.jws.soap.SOAPBinding;
import java.util.Arrays;

public class Arrasys3 {
    public static void main(String[] args) {
       String[]name={"Samat","Azamat","Aidin","Molmol"};
       for (String i:name){
           System.out.println(i+"\t");
       }

        int n=name.length;
        String temp;
        for (int i=0;i<n/2;i++){
            temp=name[n-i-1];
            name[n-i-1]=name[i];
            temp=name[i];

        }

        for (int i=0;i<name.length;i++){
            System.out.print(name[i]+"\t");
        }
        System.out.println();

    }
}
