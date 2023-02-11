package samat;

public class Example6 {
    public static void main(String[] args) {
        int[]arrays={2,4,5,6,9};
        System.out.println(sumOfArrays(arrays));
    }
    public static int sumOfArrays(int[]a){
        int count=0;
        for (int i=0;i<a.length;i++){
            count=count+a[i];
        }
        return count;
    }
}
