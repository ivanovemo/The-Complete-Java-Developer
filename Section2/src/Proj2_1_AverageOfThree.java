import java.util.Scanner;
public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        System.out.print("Please enter three numbers: ");

        num1 = keyboard.nextDouble();
        num2 = keyboard.nextDouble();
        num3 = keyboard.nextDouble();
        double average;

        keyboard.nextLine();

        average = (num1 + num2 + num3) / 3;

        System.out.print("Average is: " + average);
    }
}
