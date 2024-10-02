public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream myIceCream = new IceCream("Chocolate", 3, 2);
        IceCream yourIceCream = new IceCream("Strawberry", 2, 1);

        myIceCream.addTopping("nuts");
        myIceCream.addTopping("cherries");

        yourIceCream.addTopping("sprinkles");

        printIceCream(myIceCream);
        printIceCream(yourIceCream);
    }

    public static void printIceCream(IceCream icecream) {
        System.out.println(icecream.getName());
        System.out.println("Cost: $" +icecream.getCost());
        System.out.println("Topped with:");
        icecream.printToppings();
        System.out.println();
    }
}
