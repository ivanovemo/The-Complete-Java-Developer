import java.util.Scanner;

public class Proj4_1_WorkingWithArrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] array = new int[5];
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter " + (i + 1) + " integer: ");
            array[i] = keyboard.nextInt();
        }

        for (int num : array) {
            System.out.println("Multiplied number in array: " + num * 2);
        }
    }
}
