public class MethodOverloading {
    public static void main(String[] args) {
        int result = getResult(5);
        System.out.println(result);

        result = getResult(5, 4);
        System.out.println(result);

        result = getResult(5, "12");
        System.out.println(result);

        System.out.println(getResult("Emil", "Ivanov"));
    }

    public static int getResult(int num) {
        return num * 2;
    }

    public static int getResult(int num1, int num2) {
        return num1 * num2;
    }

    public static int getResult(int num, String value) {
        return num * Integer.parseInt(value);
    }

    public static String getResult(String text1, String text2) {
        return text1 + " " + text2;
    }
}
