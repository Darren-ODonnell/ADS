import dataStructures.LinkedList;

public class Driver {

    public Driver(){
        LinkedList<Book> books = new LinkedList<>();
        Book book = new Book("HP","JKR", 2000);
        books.add(book);
        Book book2 = new Book("HP2","JKR", 2002);
        books.add(book2);
        Book book3  = new Book("HP3","JKR", 2004);
        books.add(book3);

        System.out.println(books.toString());

        books.remove();

        System.out.println(books.toString());

    }

    public static void main(String[] args) {
        new Driver();
    }
}
