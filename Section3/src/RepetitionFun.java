import java.util.Scanner;

public class RepetitionFun {
    public static void main(String[] args) {
//        int count = 0;

//        while (count < 10) {
//            System.out.println(count);
//            count++;
//        }

//        int count2 = 15;
//
//        do {
//            System.out.println(count2);
//            count2++;
//        }
//        while (count2 < 10);

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
        Scanner keyboard = new Scanner(System.in);
        int input;

        System.out.print("Enter a non-negative integer or negative to exit: ");
        input = keyboard.nextInt();

        while (input >= 0) {
            System.out.println("Input: " + input);
            System.out.print("Enter a non-negative integer or negative to exit: ");
            System.out.print("Or negative to exit: ");
            input = keyboard.nextInt();
        }

        System.out.println("Done!");
    }
}
