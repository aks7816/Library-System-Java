public class Book {
    //Here I am creating the attributes
    private String title;
    private String firstName;
    private String lastName;

    public Book(){

    }

    //This is my constructor
    public Book(String title, String firstName, String lastName){

        this.title = title;
        this.firstName  = firstName;
        this.lastName = lastName;

    }
    //Below are my methods
    public String getTitle(){
        return title;
    }

    public String getAuthorFirstName(){
        return firstName;
    }

    public String getAuthorLastName(){
        return lastName;
    }

    public String toString(){

        String val  = title + " , " + lastName + " , " + firstName ;
        return val;
    }

}
