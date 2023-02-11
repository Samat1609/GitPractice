import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Draft1 {
    public static void main(String[] args) {

        // Sort Array without method sort
        int[] numbers = {9, 6, 7, 21, 32, 1, 3, 4, 54};
        System.out.println(Arrays.toString(sortedOfArrays(numbers)));

        //Delete  duplicates numbers in Array
        int[] numbers1 = {9, 6, 7, 21, 32, 1, 3, 4, 54, 9, 4, 6, 1, 3, 4, 54};

        System.out.println(Arrays.toString(deleteDublicats(numbers1)));

        // Delete duplicates Words in String
        String duplicateWords = "I like coding coding every morning";
        System.out.println(deleteDublicats(duplicateWords));

        // Find the sum of number in String
        String findSum = "Hello 1 World 2 I 3 am 4 John";


    }
    public static int[]sortedOfArrays(int[]a){
        for (int i=0;i< a.length;i++){
            for (int k=i+1;k<a.length;k++){
                int temp=0;
                if (a[i]>a[k]){
                    temp=a[i];
                    a[i]=a[k];
                    a[k]=temp;
                }
            }
        }
        return a;
    }
    public static int[]deleteDublicats(int[]a){
        Set<Integer>set=new HashSet<>();
        for (int i: a){
            set.add(i);
        }
        int[]arr=new int[set.size()];
        int temp=0;
        for (int k : set){
            arr[temp++]=k;
        }
        return arr;
    }
    public static String deleteDublicats(String str) {
        String[] word = str.split(" ");
        Set<String>stringSet=new LinkedHashSet<>();
        stringSet.addAll(Arrays.asList(word));
        String words="";
        for (String i: stringSet){
            words=words+i+" ";
        }
        return words;


    }

}

