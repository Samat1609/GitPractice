package arrays;

import java.util.Arrays;

public class Arrays8 {
    public static void main(String[] args) {

        String[][][] names=new String[2][3][3];
        names[0][0][0]="Samat";
        names[0][0][1]="Aidin";
        names[0][0][2]="Muras";
        names[0][1][0]="Nazira";
        names[0][1][1]="Molmol";
        names[0][1][2]="Melis";
        names[0][2][0]="Salamat";
        names[0][2][1]="Aman";
        names[0][2][2]="Kanat";
        names[1][0][0]="Aizada";
        names[1][0][1]="Nurida";
        names[1][0][2]="Meerimai";
        names[1][1][0]="Jazira";
        names[1][1][1]="Ajarka";
        names[1][1][2]="Meder";
        names[1][2][0]="Aruna";
        names[1][2][1]="Mairambek";
        names[1][2][2]="Kantemir";
        for (int i=0;i< names.length;i++){
            for (int j=0;j<names[i].length;j++){
                for (int k=0;k<names[i][j].length;k++){
                    System.out.print(names[i][j][k]+", ");
                }
                System.out.println();
            }
        }
    }
}
