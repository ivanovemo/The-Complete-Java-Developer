import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamesAges {
    public static void main(String[] args) {
        Scanner namesFile;
        Scanner agesFile;
        PrintWriter pw;

        try {
            namesFile = new Scanner(new File("Section8/student_names.txt"));
            agesFile = new Scanner(new File("Section8/student_ages.txt"));
            pw = new PrintWriter("Section8/names_ages.txt");

            String tempName;
            int tempAge;

            while (namesFile.hasNext()) {
                tempName = namesFile.nextLine();
                tempAge = agesFile.nextInt();

                pw.println(tempName + " is " + tempAge + " years old.");
            }

            pw.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
