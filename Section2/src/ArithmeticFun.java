public class ArithmeticFun {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        //e.g., BINARY operators
        int addition = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = b / a;
        int reminder = b % a;

        System.out.println("Addition is: " + addition);
        System.out.println("Difference is: " + difference);
        System.out.println("Product is: " + product);
        System.out.println("Quotient is: " + quotient);
        System.out.println("Quotient is: " + reminder);

        addition += 20; //result = result + 20
        System.out.println("Addition is: " + addition);

        //e.g., UNARY operators
        addition++; // ++addition;
        System.out.println("Addition is: " + addition);

        addition --; //--addition;
        System.out.println("Addition is: " + addition);

        //Challenge: Multiplication
        product *= 2;
        System.out.println("Product is: " + product);
    }
}
