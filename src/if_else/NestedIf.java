package if_else;

public class NestedIf {
    public static void main(String[] args) {
        String citizen="Ru";
        int age=16;
        if (age>=16){
            if (citizen.equals("Kg")){
                System.out.println("Get a passport");
            }else {
                System.out.println("гражданин эмессин");
            }
        }else {
            System.out.println("жашын жете элек");
        }
    }
}
