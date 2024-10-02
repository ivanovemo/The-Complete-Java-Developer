public class StringMethods1 {
    public static void main(String[] args) {
        String name1 = "Johhn Baugh";
        String name2 = "Johhn Baugh";
        String name3 = "Rob Percival";
        String myName = "Emil Ivanov";

        for (int i = 0; i < name1.length(); i++) {
            System.out.print(name1.charAt(i) + " ");
        }

        System.out.println();

        if (name1.equals(name2)) {
            System.out.println("Names are equal.");
        } else {
            System.out.println("Names aren't equal");
        }

        if (name1.compareTo(name3) > 0) {
            System.out.println("Name1 > Name3");
        } else {
            System.out.println("Name 1 <= 3");
        }

        System.out.println("Comparing for the lecture challenge:");
        if (myName.compareTo(name1) > 0) {
            System.out.println(myName + " is greater than " + name1);
        } else {
            System.out.println(myName + " is less than or equal to " + name1);
        }
    }
}
