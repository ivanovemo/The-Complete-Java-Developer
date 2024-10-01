import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        char gender;

        System.out.print("Age: ");
        age = keyboard.nextInt();

        System.out.print("Gender: ");
        gender = keyboard.next().charAt(0);

        if (age >= 19 && gender == 'M') {
            System.out.println("You can join the fraternity.");
        } else {
            System.out.println("Sorry, you cannot join the fraternity.");
        }
    }
}