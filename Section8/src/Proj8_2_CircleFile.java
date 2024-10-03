import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circleList = new ArrayList<>();

        fillArrayList(circleList);
        printCircles(circleList);
    }

    private static void fillArrayList(ArrayList<Circle> circleAl) {
        Scanner infile;

        try {
            infile = new Scanner(new File("Section8/circle_data.txt"));
            Circle temp;
            double radius;

            while (infile.hasNext()) {
                radius = infile.nextDouble();
                temp = new Circle(radius);
                circleAl.add(temp);
            }

            infile.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("Error accessing file!");
        }
    }

    private static void printCircles(ArrayList<Circle> circleAl) {
        PrintWriter pw;

        try {
            pw = new PrintWriter("Section8/circles_output.txt");

            for (Circle c : circleAl) {
                System.out.println("Radius: " + c.getRadius());
                System.out.println("Circumference: " + c.circumference());
                System.out.println("Area: " + c.area());
                System.out.println();

                pw.println("Radius: " + c.getRadius());
                pw.println("Circumference: " + c.circumference());
                pw.println("Area: " + c.area());
                pw.println();
            }

            pw.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("Couldn't access file.");
        }
    }
}
