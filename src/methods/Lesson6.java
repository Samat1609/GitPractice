package methods;

public class Lesson6 {
    public static void main(String[] args) {
//        sleepIn(false, false) → true
//        sleepIn(true, false) → false
//        sleepIn(false, true) → true

        Lesson6 ob = new Lesson6();
        System.out.println(ob.sleepIn(true,false));

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday &&!vacation){
            return true;
        }else if (!weekday && vacation ){
            return true;
        }else{
            return false;
        }
    }


    }

