package oop.agregation_compozition;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        char[]symbols={'q','e','y'};
        Keyboard keyboard=new Keyboard(symbols);
        TrackPad trackPad =new TrackPad("big");
        Monitor monitor=new Monitor("sd",12345);
        Laptop laptop=new Laptop("Asus",123,monitor,trackPad,keyboard);
        System.out.println(laptop);
        int[] number = {9, 6, 7, 21, 32, 1, 3, 4, 54};

        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < number.length - 1; i++) {
                if (number[i] > number[i + 1]) {
                    isSorted=false;

                    temp=number[i];
                    number[i]=number[i+1];
                    number[i+1]=temp;

                }


            }

        }
        System.out.println(Arrays.toString(number));
    }

}




