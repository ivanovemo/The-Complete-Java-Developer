import java.util.Random;

public class Fun2DArrays {
    public static void main(String[] args) {
        int[][] my2DArray = new int[2][3];

        fill2dArray(my2DArray);
        print2DArray(my2DArray);
        System.out.println();
        twice2DArray(my2DArray);
        print2DArray(my2DArray);
    }

    public static void fill2dArray(int[][] twoDArray) {
        Random rand = new Random();

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = rand.nextInt(100);
            }
        }
    }

    public static void print2DArray(int[][] twoDArray) {
        for (int[] arr : twoDArray) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void twice2DArray(int[][] twoDArray) {
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] *= 2;
            }
        }
    }
}
