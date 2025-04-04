package section_12_Arrays;
public class Example2 {
    public static void main(String[] args) {
        // How to access array element
        float[] lfNums =new float[5];
        System.out.println(lfNums[0]); //0.0 default value
        System.out.println(lfNums[1]);
        System.out.println(lfNums[2]);
        System.out.println(lfNums[3]);
        System.out.println(lfNums[4]);

        lfNums = new float[]{12.12f,13.13f,14.14f};
        System.out.println(lfNums[0]);
        System.out.println(lfNums[1]);
        System.out.println(lfNums[2]);

        System.out.println("print array from start through for loop :");
        // traversing array
        for (int i=0; i<lfNums.length; i++){
            System.out.println(lfNums[i]);
        }

        // print array from end
        System.out.println("print array from end through for loop : ");
        for (int i= lfNums.length-1; i>= 0; i--){
            System.out.println(lfNums[i]);
        }
    }
}

