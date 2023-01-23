public class Main {
    public static void main(String[] args) {
        Book bok1 = new Book("DJ Khaled", 999, true);
        System.out.println(bok1.name);
        System.out.println("The book printed above costs $" + bok1.price);
        System.out.println(bok1.topSeller ? "This is a top selling book!" : "This is not a very popular book");
    }
}