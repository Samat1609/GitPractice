package homeWork;

import java.util.Arrays;

public class ArraysPlanet {
    public static void main(String[] args) {
        String [] planet=new String[8];
        planet[0]="Меркурий";
        planet[1]="Венера";
        planet[2]="Земля";
        planet[3]="Марс";
        planet[4]="Юпитер";
        planet[5]="Сатурн";
        planet[6]="Уран";
        planet[7]="Нептун";
        System.out.println(Arrays.toString(planet));

        planet[0]=planet[7];
        planet[7]="Меркурий";
        System.out.println(Arrays.toString(planet));

        StringBuilder name=new StringBuilder(planet[1]);
        String str=name.reverse().toString();
        System.out.println(str);


    }
}
