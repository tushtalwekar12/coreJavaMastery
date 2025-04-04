package section_12_Arrays;
// ta
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        int[][] A ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] B ={
                {1,0,1},
                {0,1,0},
                {1,1,0}
        };
        int[][] C =new int[3][3];

        for (int i=0; i<A.length; i++){
            for (int j=0; j<B.length; j++){
                for (int k=0; k<3; k++){
                    C[i][j] =A[i][j] + B[i][j];
                }
            }
        }


    }
}
