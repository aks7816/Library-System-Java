public class CatalogItem {

    //Here I am creating my attributes
    String id;
    boolean availability;
    Book myBook;

    //Here is my constructor
    public CatalogItem(Book book, String id, boolean availability){
        this.myBook = book;
        this.id = id;
        this.availability = availability;
    }
    //Here are my methods
    public Book getBook(){
        return myBook;
    }

    public String getId(){
        return id;
    }

    public boolean isAvailable(){
        return availability;
    }

    public void setAvailable(){
        availability = true;
    }

    public void unavailable(){
        availability = false;
    }
}

