package application;
import java.util.Scanner;
import generics.ArrayList;

//IMPORTANT:we’reNOT using Java’s ArrayList but our own version.
public class BookShelfArrayList{
    //declare an ArrayList of Books
    ArrayList<Book> list;
    final int capacity = 2;
    // this is the capacity of the array
    // Constructor
    public BookShelfArrayList() {
        //create the blank ArrayList to store the books
        list = new ArrayList<>();

        // now input 3 books into the ArrayList
        for (int index=0; index < 3; index++){
            addABook();
        }//end for

            System.out.println("");
            System.out.println("The books are: ");
            displayBooks();

            //delete the 3rd book and display
            removeBook();
            System.out.println("After removal, the books are: ");
            displayBooks();
        // }end constructor
    }
    public void addABook() {
        Scanner scan = new Scanner(System.in);
        Book aBook = null;
        String title, author;
        int year;

        System.out.println("Input the name of the book: ");
        title = scan.nextLine();
        System.out.println("Input the author of the book: ");
        author = scan.nextLine();
        System.out.println("Input the year of the books release: ");
        year = scan.nextInt();
        scan.nextLine();

        aBook.setTitle(title);
        aBook.setAuthor(author);
        aBook.setYear(year);

        list.add(aBook);

        //ADD CODE - insert code for inputting book details,
        // creating aBook and then inserting this new book into the arrayList.
        // note that to keep the code simple, you do not need to check
        // to see if the book already exists in the array

    }//end addABook

    public void displayBooks(){
        // ADD CODE - input code to display all books
        for(int i = 0; i < capacity; i++){
            System.out.println(list.toString());
        }
    }//end display

    public void removeBook(){
        // ADD CODE - remove the last book
    }

    public static void main(String[] args) {
        new BookShelfArrayList();
    }//end main
}//end BookShelfArrayList
