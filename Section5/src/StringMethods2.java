public class StringMethods2 {
    public static void main(String[] args) {
        String myName = "Emil Ivanov";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereIsB = myName.indexOf("I");

        String lastName = myName.substring(5);

        System.out.println("Upper is: " + upper);
        System.out.println("Lower is: " + lower);
        System.out.println("B is at index: " + whereIsB);
        System.out.println("Last name is: " + lastName);
    }
}
