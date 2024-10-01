import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.print("Enter a non-negative number to sum or negative to sum the current numbers: ");
        number = keyboard.nextInt();

        while (number >= 0) {
            sum += number;
            System.out.print("Enter a non-negative number to sum or negative to sum the current numbers: ");
            number = keyboard.nextInt();
        }

        System.out.println("Sum: " + sum);
    }
}
