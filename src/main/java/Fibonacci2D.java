import java.util.Arrays;

public class Fibonacci2D {


    private static final int[][] array =new int[5][5];

    public static void main(String[] args) {
        array[0][0]=1;
        array[0][1]=1;
        array[1][0]=1;
        array[1][1]=1;
        long bTime = System.nanoTime();
        System.out.println(fibonacci2D(array.length-1, array[array.length-1].length-1));
        for (int[] a : array) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println("Total time = " + (System.nanoTime() - bTime) / 1_000_000d);
    }
    private static int fibonacci2D(int i, int j) {
        if (i==0||i==1||j==0||j==1){
            return 1;
        }
        if (array[i][j]!=0) {
            return array[i][j];
        }
        array[i][j]=fibonacci2D(i-1,j)+fibonacci2D(i,j-1);
        return array[i][j];
    }

}
