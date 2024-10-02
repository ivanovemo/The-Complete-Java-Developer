public class CircleDemo {
    public static void main(String[] args) {
        Circle first = new Circle();
        Circle second = new Circle(5);
        Circle third = new Circle(12.75);

        printCircleData(first);
        printCircleData(second);
        printCircleData(third);
    }

    public static void printCircleData(Circle circle) {
        System.out.println("r = " + circle.getRadius());
        System.out.println("C = " + String.format("%.2f", circle.circumference()));
        System.out.println("A = " + String.format("%.2f", circle.area()));
        System.out.println();
    }
}
