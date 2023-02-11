package codingbat;

public class Double23 {
    public static void main(String[] args) {
        int []vb={2,2};
        Double23 ob=new Double23();
        System.out.println(ob.double23(vb));



    }
    public boolean double23(int[] nums) {
        return nums[0]==2 && nums[1]==2 || nums[0]==3 && nums[1]==3;

    }
}
