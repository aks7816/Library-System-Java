import java.util.ArrayList;

public class Driver
{
    public static int testAdd()
    {
        Catalog catalog = new Catalog();
        int numErrors = 0;
        boolean status = false;
        boolean availabilityStatus = false;
        Book book = new Book("Harry Potter", "JK", "Rowling");
        String bookId = catalog.add(book);
        ArrayList< String > foundBooks = catalog.search("JK");

        if (foundBooks.size() != 1)
        {
            System.out.println("Error: search method should have found one book");
            numErrors++;
        }
        return numErrors;
    }


    public static int testcheckout(){

        Catalog catalog = new Catalog();
        int numErrors = 0;
        Book book = new Book("Harry Potter", "JK", "Rowling");
        String bookId = catalog.add(book);
        boolean success = catalog.checkout("1");
        boolean isavailable = catalog.myList.get(0).isAvailable();

        if (success && !isavailable)
        {

            return numErrors;
        }
        else {
            System.out.println("checkout should have been successful and book should be unavailable");
            numErrors++;
            return numErrors;
        }


    }


    public static int testcheckin(){

        Catalog catalog = new Catalog();
        int numErrors = 0;
        Book book = new Book("Harry Potter", "JK", "Rowling");
        String bookId = catalog.add(book);
        boolean success = catalog.checkin("2");

        if (!success)
        {

            return numErrors;
        }
        else {
            System.out.println("checkin should have been successful and book should be unavailable");
            numErrors++;
            return numErrors;
        }


    }


    public static int testSearch(){

        Catalog catalog = new Catalog();
        int numErrors = 0;
        Book book = new Book("Harry Potter", "JK", "Rowling");
        String bookId = catalog.add(book);
        ArrayList< String > foundBooks = catalog.search("JK");

        if (!foundBooks.isEmpty())
        {

            return numErrors;
        }
        else {
            System.out.println("The search term should have been found.");
            numErrors++;
            return numErrors;
        }


    }


    public static int testGetBook(){

        Catalog catalog = new Catalog();
        int numErrors = 0;
        Book book = new Book("Harry Potter", "JK", "Rowling");
        String bookId = catalog.add(book);
        Book checkBook = catalog.getBook("1");

        if (checkBook == book)
        {

            return numErrors;
        }
        else {
            System.out.println("The book should have been found.");
            numErrors++;
            return numErrors;
        }


    }


    public static int testRemove(){

        Catalog catalog = new Catalog();
        int numErrors = 0;
        Book book = new Book("Harry Potter", "JK", "Rowling");
        String bookId = catalog.add(book);
        boolean remove = catalog.remove("1");

        if (remove)
        {

            return numErrors;
        }
        else {
            System.out.println("The book should have been removed.");
            numErrors++;
            return numErrors;
        }


    }


    public static void main(String []args)
    {
        int numErrors = 0;
        numErrors += testAdd();
        numErrors += testcheckout();
        numErrors += testcheckin();
        numErrors += testSearch();
        numErrors += testGetBook();
        numErrors += testRemove();

        if (numErrors > 0)
        {
            System.out.println("Fix your errors");
        }
        else
        {
            System.out.println("No errors");
        }
    }
}

