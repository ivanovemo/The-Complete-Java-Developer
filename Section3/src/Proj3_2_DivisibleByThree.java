import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = keyboard.nextInt();

        if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3");
            System.out.println("Result: " + number / 3);
        } else {
            System.out.println(number + " is NOT divisible by 3");
        }
    }
}
