package oop.interface2;

public interface Fly {

    int COUNT = 3000;

    String fly();

    default String averageHigth(int meter) {
        if (meter > COUNT) {
            return "Average high";
        }else{
            return "Lowfly";
        }



    }
    static String flyIn(){
        return "Fly in";
    }
}
