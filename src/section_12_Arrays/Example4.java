package section_12_Arrays;
// 2D-Array -Addition of two Matrix
import java.util.Scanner;
public class Example4 {
    public static void additionOfMatrix(int A[][],int B[][], int C[][]){
        for (int i=0; i<A.length; i++){
            for (int j=0; j<A[i].length; j++){
                C[i][j] =A[i][j] + B[i][j];
            }
        }
    }
    public static void printMatrixArray(int A[][], int B[][], int C[][]){
        for (int i=0; i<A.length; i++){
            for (int j=0; j<A[i].length; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] A ={{1,2,3},{4,5,6},{7,8,9}};
        int[][] B ={{1,0,1},{0,1,0},{1,1,0}};
        int[][] C =new int[3][3];
//         call
        additionOfMatrix(A,B,C);
        printMatrixArray(A,B,C);
    }
}
