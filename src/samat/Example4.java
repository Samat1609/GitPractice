package samat;

public class Example4 {
    public static void main(String[] args) {
        sayHi(3);


    }
    private static void sayHi(int nums){
        System.out.println("Hi");
        if (nums<=1){
            return;
        }
        sayHi(nums-1);
    }


}
