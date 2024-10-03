import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Samantha");
        names.add("Luther");
        names.add("Luke");
        names.add("Kyle");

        try {
            PrintWriter pw = new PrintWriter("Section8/names.txt");
            for (String name : names) {
                pw.println(name);
            }

            pw.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("Can't write to file!");
        }
    }
}
