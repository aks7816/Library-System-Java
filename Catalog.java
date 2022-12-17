import java.util.ArrayList;
//I have imported ArrayList
//
public class Catalog {

    //Here are my attributes
    int num = 1;
    public ArrayList<CatalogItem> myList;
    String id;

    //Instantiating an empty array list
    public Catalog() {
        myList = new ArrayList<CatalogItem>();
    }

    //Below are my methods
    public String add(Book book){

        String id = String.valueOf(num);
        CatalogItem mycatalogitem = new CatalogItem(book, id, true);

        myList.add(mycatalogitem);
        num++;

        return mycatalogitem.id;
    }


    public boolean checkout(String id){

        boolean set = true;

        for (int x = 0; x < myList.size(); x++){
            if (id.equals(myList.get(x).getId())){
                if ((myList.get(x).isAvailable())){
                    myList.get(x).unavailable();
                    return set;
                }
            }
        }
        return false;
    }


    public boolean checkin(String id){

        for (int x = 0; x < myList.size(); x++){
            if (id.equals(myList.get(x).getId())) {
                if ((!myList.get(x).isAvailable())) {
                    myList.get(x).setAvailable();
                    return true;

                }
            }
        }
        return false;
    }

    public ArrayList<String> search(String searchTerm){
        ArrayList<String> newList  = new ArrayList<String>();

        for(int x = 0; x < myList.size(); x++){
            if (searchTerm.equals(myList.get(x).getBook().getTitle()) || searchTerm.equals(myList.get(x).getBook().getAuthorFirstName()) || searchTerm.equals(myList.get(x).getBook().getAuthorLastName())){
                newList.add(myList.get(x).getId());
            }
        }
        return newList;
    }


    public Book getBook(String id){

        for(int x =0; x < myList.size(); x++){
            if (id.equals(myList.get(x).getId())){
                return myList.get(x).myBook;
            }
        }
        return null;
    }


    public boolean remove(String id){

        boolean set = true;

        for(int x = 0; x < myList.size(); x++){
            if(id.equals(myList.get(x).getId())){
                if(myList.get(x).isAvailable()){
                    myList.remove(x);
                    set = true;
                }
                else{
                    set = false;
                }
            }
            else{
                set = false;
            }
        }
        return set;
    }
}
