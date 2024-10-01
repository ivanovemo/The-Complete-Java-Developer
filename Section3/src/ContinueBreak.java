public class ContinueBreak {
    public static void main(String[] args) {
        int count = 0;

        while (count < 10) {

            if (count == 5) {
                count++;
                continue;
            }

            System.out.print(count + "\t");

            count++;
        }

        System.out.println();

        int count2 = 0;
        while (count2 < 10) {

            if (count2 == 5) {
                count2++;
                break;
            }

            System.out.print(count2 + "\t");

            count2++;
        }
    }
}
