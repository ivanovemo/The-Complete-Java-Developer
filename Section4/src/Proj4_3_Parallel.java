import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String name;
        int age;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a name: ");
            name = keyboard.nextLine();

            System.out.print("Enter an age: ");
            age = keyboard.nextInt();

            //consume new line
            keyboard.nextLine();

            names.add(name);
            ages.add(age);
            System.out.println();
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " is " +
                    ages.get(i) + " years old.");
        }
    }
}
