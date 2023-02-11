package arrays;

import java.util.Arrays;

public class Arrays5 {
    public static void main(String[] args) {

        String[][] str={{"Samat","Aibek","Molmol"},{"Talgat","Fatima"},{"Azamat","Salamat"}};
        System.out.println(Arrays.deepToString(str));

        System.out.println(str[1][0]);

        for (int i=0;i< str.length;i++){
            for (int j=0;j<str[i].length;j++)
            System.out.println(str[i][j]);
        }
        System.out.println();
    }
}
