package exercise1;
public class Book {
    //instantiation   
    private String Title;
    private String Author;
    private String Publisher;
    private String ISBN;   
    private Integer Book_Count;
    
    public Book(){}
    //constructor with parameter
    public Book(String Title, String Author, String Publisher, String ISBN )
    {
        this.Title = Title;
        this.Author = Author;
        this.Publisher = Publisher;
        this.ISBN = ISBN;
        this.Book_Count = Book_Count++;
    }
    //display all info
    public void displayInfo()
    {
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("Publisher: " + Publisher);
        System.out.println("ISBN: " + ISBN);                
    }
    // set and get method
    public void setTitle(String Title){this.Title = Title;}
    public void setAuthor(String Author){this.Author = Author;}
    public void setPublisher(String Publisher){this.Publisher = Publisher;}
    public void setISBN(String ISBN){this.ISBN = ISBN;}
    public String getTitle(){return Title;}
    public String getAuthor(){return Author;}
    public String getPublisher(){return Publisher;}
    public String getISBN(){return ISBN;}
    //
    public Integer getBookCount(){return Book_Count;}
    
}
