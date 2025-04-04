package section_11_Iterative_statement_loops.nested_loops;
// Nested Loops - loop inside loop
/*

 */
public class Example_01 {
    public static void main(String[] args) {
        for (int i=0; i<3; i++){ // outer loop
            for (int j=0; j<3; j++){ // inner loop

                // 1. print all pair element
//                System.out.printf("(%d,%d)",i,j);

                // 2. print common element like (0,0) (0,1) etc
//                if (i == j){
//                    System.out.printf("(%d,%d)",i,j);
//                }

                // 3. print except common element
                if (i != j){
                    System.out.printf("(%d,%d)",i,j);
                }
            }
            System.out.println();
        }
    }
}
