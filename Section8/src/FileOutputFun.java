import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {
    public static void main(String[] args) {

        try {
            PrintWriter pw = new PrintWriter("Section8/output.txt");

            pw.println("Hello there!");
            pw.println("My name is Emil Ivanov!");
            pw.close();
        }
        catch (FileNotFoundException ex) {

        }
    }
}
