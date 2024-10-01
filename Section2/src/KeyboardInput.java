import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String name;
    String city;
    int age;
    int number;

    System.out.print("What is your name? ");
    name = keyboard.nextLine();

    System.out.print("What's your age? ");
    age = keyboard.nextInt();
    keyboard.nextLine(); //consume the new line

    System.out.print("What city do you live in? ");
    city = keyboard.nextLine();

    System.out.println("Hello, " + name + "!");
    System.out.println("Age is: " + age);
    System.out.println("City is: " + city);

    System.out.print("What's your real number to multiply: ");
    number = keyboard.nextInt() * 2;
    System.out.println("Result: " + number);
    }
}
