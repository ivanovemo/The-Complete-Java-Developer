public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House(3, 10, "blue");

//        myHouse.setNumStories(2);
//        myHouse.setNumWindows(6);
//        myHouse.setColor("red");

//        yourHouse.setNumStories(3);
//        yourHouse.setNumWindows(10);
//        yourHouse.setColor("blue");

//        System.out.println("Your house is: " + myHouse.getColor() +
//                " and has " + myHouse.getNumStories() + " stories and " +
//                myHouse.getNumWindows() + " windows.");

//        System.out.println("Your house is: " + yourHouse.getColor() +
//                " and has " + yourHouse.getNumStories() + " stories and " +
//                yourHouse.getNumWindows() + " windows.");

        printHouse(myHouse);
        printHouse(yourHouse);
    }

    public static void printHouse(House house) {
        System.out.println("Your house is: " + house.getColor() +
                " and has " + house.getNumStories() + " stories and " +
                house.getNumWindows() + " windows.");
    }
}
