package arraylist;
import java.util.Arrays;
import java.util.List;

public class Arraylist4 {
    public static void main(String[] args) {
        Integer[] num = {1, 2, 3, 4, 5, 6, 7, 8};

        List<Integer> nums2 = Arrays.asList(num);
        System.out.println(nums2);
        System.out.println(nums2.get(3));
        nums2.set(0,10);
        System.out.println(nums2);
        nums2.remove('3');
        System.out.println(nums2);



    }
}