public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle first = new Rectangle();

        Rectangle second = new Rectangle(5,10);

        System.out.println(Rectangle.getRectangles());

        Rectangle third;

        System.out.println("After third declared: " + Rectangle.getRectangles());

        third = new Rectangle(2.5, 4);

        System.out.println("After third instantiated: " + Rectangle.getRectangles());

        System.out.println("First rectangle area: " + first.area());
        System.out.println("Second rectangle area: " + second.area());
        System.out.println("Third rectangle area: " + third.area());
        System.out.println();
        System.out.println("First rectangle perimeter: " + first.perimeter());
        System.out.println("Second rectangle perimeter: " + second.perimeter());
        System.out.println("Third rectangle perimeter: " + third.perimeter());
    }
}
