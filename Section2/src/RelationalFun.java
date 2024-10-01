public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 24;
        int yourAge = 20;
        int bobsAge = 20;
        String myName = "Emil";
        String yourName = "Someone";

        int currentAge = myAge;

        System.out.println("myBool is:" + myBool);
        System.out.println("yourBool is:" + yourBool);

        //relational operations
        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAge?: " + ageComparison);

        ageComparison = yourAge > bobsAge;
        System.out.println("myAge > bobsAge?: " + ageComparison);

        ageComparison = yourAge == bobsAge;
        System.out.println("myAge = bobsAge?: " + ageComparison);

        boolean nameComparison = myName.equals(yourName);
        System.out.println("Do names match? " + nameComparison);

        boolean isMyAgeGreaterOrEqual = myAge >= 21;
        System.out.print("Is my age greaten than or equal to 21? " + isMyAgeGreaterOrEqual);
    }
}
