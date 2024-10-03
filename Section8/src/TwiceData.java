import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner infile;
        PrintWriter pw;

        try {
            infile = new Scanner(new File("Section8/nums.txt"));
            pw = new PrintWriter("Section8/twice_nums.txt");

            int inputNum;

            while (infile.hasNext()) {
                inputNum = infile.nextInt();
                inputNum *= 2;
                pw.println(inputNum);
            }

            infile.close();
            pw.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
