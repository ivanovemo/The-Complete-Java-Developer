public class BookDemo {
    public static void main(String[] args) {
        Book gameOfThrones = new Book("George Martin",
                "Game of Thrones", "Fantasy", 864);

        Book mathBook = new Book("James Steward", "" +
                "Calculus", "Math", 1392);

        Book javaBook = new Book("Joel Murach",
                "Murach's Java programming", "Programming", 800);

        gameOfThrones.printBookDetails();
        mathBook.printBookDetails();
        javaBook.printBookDetails();
    }
}
