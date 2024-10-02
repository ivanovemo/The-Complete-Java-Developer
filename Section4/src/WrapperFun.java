import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();

        myArrayList.add(new Integer(10));
        myArrayList.add(new Integer(22));

        myArrayList.add(50);
        myArrayList.add(60);

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

        String someValue = "450";
        int numericValue = Integer.parseInt(someValue);
        numericValue += 10;
        System.out.println(numericValue);

        String someDouble = "3.14159";
        double doubleValue = Double.parseDouble(someDouble);
        System.out.println(doubleValue);
    }
}
