public class DirectionFun {
    public enum Direction {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    public static void main(String[] args) {
        Direction direction = Direction.NORTH;

        System.out.println(printMessage(direction));
    }

    public static String printMessage(Direction direction) {
        return "You are traveling " + direction.toString().toLowerCase() + "!";
    }
}
