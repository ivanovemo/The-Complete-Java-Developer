import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String adjective;
        String girlName;
        String secondAdjective;
        String occupation;
        String place;
        String pieceOfClothing;
        String hobby;
        String thirdAdjective;
        String anotherOccupation;
        String boyName;
        String manName;

        System.out.print("Enter an adjective: ");
        adjective = keyboard.nextLine();

        System.out.print("Enter girl's name: ");
        girlName = keyboard.nextLine();

        System.out.print("Enter another adjective: ");
        secondAdjective = keyboard.nextLine();

        System.out.print("Enter an occupation: ");
        occupation = keyboard.nextLine();

        System.out.print("Enter the name of a place: ");
        place = keyboard.nextLine();

        System.out.print("Enter the name of a piece of clothing: ");
        pieceOfClothing = keyboard.nextLine();

        System.out.print("Enter the name of a hobby: ");
        hobby = keyboard.nextLine();

        System.out.print("Enter another adjective: ");
        thirdAdjective = keyboard.nextLine();

        System.out.print("Enter another occupation: ");
        anotherOccupation = keyboard.nextLine();

        System.out.print("Enter a boy's name: ");
        boyName = keyboard.nextLine();

        System.out.print("Enter a man's name: ");
        manName = keyboard.nextLine();

        System.out.println("There once was a " + adjective + " girl named " + girlName + " who was a " + secondAdjective + " " + occupation + " in the Kingdom of " + place + ".\nShe loved to wear " + pieceOfClothing + " and go to " + hobby + ". She wanted to marry the " + thirdAdjective + " " + anotherOccupation + " named " + boyName + " but her father, king " + manName + " forbid her from seeing him.");
    }
}
