package testbook;
import java.util.*;
public class TestBook {
    static Scanner s = new Scanner(System.in);
    static Book b = new Book(); 
    //user-defined method
        public static void WelcomeUser(Book[] book)
    {        
        System.out.println("Welcome to the library, what do you like to do?, type a number to select an option. ");
        System.out.println("1. Search for a book" + "\n" + "2. Add a book" + "\n" + "3. Delete a book" + "\n" + "4. Sort the library" + "\n" + "5. Exit the program");
        System.out.println("Option: ");
        int d = s.nextInt();
        switch(d)
                {
                    case 1: 
                        searchBook(book);
                        break;
                    case 2:
                        addBook(book);
                        break;
                    case 3:
                        deleteBook(book);
                        break;
                    case 4:
                        sortLibrary(book);
                    case 5:
                        System.exit(0);
                }
    }
        public static void addBook(Book[] book)
    {     
       int Tbook = book.length;
        for(int i = 0; i < book.length - 1; i++)
        {
            if(book[i] == null)
            {
                Tbook--;
            } else if(book[i].getTitle() == null){
                Tbook--;
            }
        }
        for(int i=0; i < 9; i++)
    {       
        String t, a, p, is;
        if(book[i] == null){
        System.out.print("Enter Title: "); 
        s.nextLine();
        t = s.nextLine();
        System.out.print("Enter Author: ");a = s.nextLine();
        System.out.print("Enter Publisher: "); p = s.nextLine();
        System.out.print("Enter ISBN: "); is = s.nextLine();
        book[i] = new Book(b.uiTitle(t), b.uiAuthor(a), b.uiPublisher(p), b.uiISBN(is));
        System.out.println("New book added at number: " + (i+1));
        book[i].displayInfo();
        //
        System.out.print("Do you want to add more?");
        String d1 = s.nextLine();
        if(d1.equalsIgnoreCase("yes"))
        {}else{break;}
        }
        else if(book[i].getTitle()== null){
        System.out.print("Enter Title: "); 
        s.nextLine();
        t = s.nextLine();
        System.out.print("Enter Author: ");a = s.nextLine();
        System.out.print("Enter Publisher: "); p = s.nextLine();
        System.out.print("Enter ISBN: "); is = s.nextLine();
        book[i] = new Book(b.uiTitle(t), b.uiAuthor(a), b.uiPublisher(p), b.uiISBN(is));
        System.out.println("New book added at number: " + (i+1));
        book[i].displayInfo();
        //
        System.out.print("Do you want to add more?");
        String d1 = s.nextLine();
        if(d1.equalsIgnoreCase("yes"))
        {}else{break;}
        }
        if(book[9] == null)
        {}
        else{System.out.println("Full");}
    }
       //
       System.out.println("New book is added!! System will arrange the library." + "\n");
       Rearrange(book);
   }
    //sorting method
        public static void sortLibrary(Book[] book){
            
        Scanner s = new Scanner(System.in);
        System.out.println("How do you want to sort your Library?");
        System.out.println("1.If by Title, Type 1");
        System.out.println("2.If by Author, Type 2");
        System.out.println("3.If by Publisher, Type 3");
        System.out.println("4.If by ISBN, Type 4");
        System.out.print("Your input: ");
        int t1 = s.nextInt();
        switch(t1)
                {
                    case 1: sortByTitle(book); break;
                    case 2: sortByAuthor(book); break;   
                    case 3: sortByPublisher(book); break;
                    case 4: sortByISBN(book); break;   
                }
    
    }
        public static void sortByTitle(Book[] book){
        int Tbook = book.length - 1;
        for(int i = 0; i < book.length - 1; i++)
        {
            if(book[i] == null)
            {
                Tbook--;
            } else if(book[i].getTitle() == null){
                Tbook--;
            }
        }
        System.out.println(Tbook);
        System.out.println("If ascending type 1, if descending type 2.");
        int t2 = s.nextInt();
        if(t2 == 1)
        {
        System.out.println("Sorted By Ascending: ");
        for(int i = 0; i < Tbook; i++){
            if( i <= 9){
                for(int j = i+1; j < Tbook; j++){
                    if(book[i].getTitle() == null){}
                    else{
                        if(book[i].getTitle().compareToIgnoreCase(book[j].getTitle()) > 0){
                            Book t = book[i];
                            book[i] = book[j];
                            book[j] = t;
                            if(book[i] == null){break;}
                        }
                        }    
                    }
                }
            if(book[i].getTitle() == null){}else{book[i].displayInfo(); System.out.println("");}
            }
            System.out.println("Returning to main menu...");
            WelcomeUser(book);
        }
        else
        {
            System.out.println("Sorted By Descending: ");
            for(int i = 0; i < Tbook; i++){
            if( i <= 9){
                for(int j = i+1; j < Tbook; j++){
                    if(book[i].getTitle() == null){}
                    else{
                        if(book[i].getTitle().compareToIgnoreCase(book[j].getTitle()) < 0){
                            Book t = book[i];
                            book[i] = book[j];
                            book[j] = t;
                            if(book[i] == null){break;}
                        }
                        }    
                    }
                }
            if(book[i].getTitle() == null){}else{book[i].displayInfo(); System.out.println("");}
            }
            System.out.println("Returning to main menu...");
            WelcomeUser(book);
        }
}
        public static void sortByAuthor(Book[] book){
        int Tbook = book.length - 1;
        for(int i = 0; i < book.length - 1; i++)
        {
            if(book[i] == null)
            {
                Tbook--;
            } else if(book[i].getAuthor() == null){
                Tbook--;
            }
        }
        System.out.println(Tbook);
        System.out.println("If ascending type 1, if descending type 2.");
        int t2 = s.nextInt();
        if(t2 == 1)
        {
        System.out.println("Sorted By Ascending: ");
        for(int i = 0; i < Tbook; i++){
            if( i <= 9){
                for(int j = i+1; j < Tbook; j++){
                    if(book[i].getAuthor() == null){}
                    else{
                        if(book[i].getAuthor().compareToIgnoreCase(book[j].getAuthor()) > 0){
                            Book t = book[i];
                            book[i] = book[j];
                            book[j] = t;
                            if(book[i] == null){break;}
                        }
                        }    
                    }
                }
            if(book[i].getAuthor() == null){}else{book[i].displayInfo(); System.out.println("");}
            }
            System.out.println("Returning to main menu...");
            WelcomeUser(book);
        }
        else
        {
            System.out.println("Sorted By Descending: ");
            for(int i = 0; i < Tbook; i++){
            if( i <= 9){
                for(int j = i+1; j < Tbook; j++){
                    if(book[i].getAuthor() == null){}
                    else{
                        if(book[i].getAuthor().compareToIgnoreCase(book[j].getAuthor()) < 0){
                            Book t = book[i];
                            book[i] = book[j];
                            book[j] = t;
                            if(book[i] == null){break;}
                        }
                        }    
                    }
                }
            if(book[i].getAuthor() == null){}else{book[i].displayInfo(); System.out.println("");}
            }
            System.out.println("Returning to main menu...");
            WelcomeUser(book);
        }
}  
        public static void sortByPublisher(Book[] book){
        int Tbook = book.length - 1;
        for(int i = 0; i < book.length - 1; i++)
        {
            if(book[i] == null)
            {
                Tbook--;
            } else if(book[i].getPublisher() == null){
                Tbook--;
            }
        }
        System.out.println(Tbook);
        System.out.println("If ascending type 1, if descending type 2.");
        int t2 = s.nextInt();
        if(t2 == 1)
        {
        System.out.println("Sorted By Ascending: ");
        for(int i = 0; i < Tbook; i++){
            if( i <= 9){
                for(int j = i+1; j < Tbook; j++){
                    if(book[i].getPublisher() == null){}
                    else{
                        if(book[i].getPublisher().compareToIgnoreCase(book[j].getPublisher()) > 0){
                            Book t = book[i];
                            book[i] = book[j];
                            book[j] = t;
                            if(book[i] == null){break;}
                        }
                        }    
                    }
                }
            if(book[i].getPublisher() == null){}else{book[i].displayInfo(); System.out.println("");}
            }
            System.out.println("Returning to main menu...");
            WelcomeUser(book);
        }
        else
        {
            System.out.println("Sorted By Descending: ");
            for(int i = 0; i < Tbook; i++){
            if( i <= 9){
                for(int j = i+1; j < Tbook; j++){
                    if(book[i].getPublisher() == null){}
                    else{
                        if(book[i].getPublisher().compareToIgnoreCase(book[j].getPublisher()) < 0){
                            Book t = book[i];
                            book[i] = book[j];
                            book[j] = t;
                            if(book[i] == null){break;}
                        }
                        }    
                    }
                }
            if(book[i].getPublisher() == null){}else{book[i].displayInfo(); System.out.println("");}
            }
            System.out.println("Returning to main menu...");
            WelcomeUser(book);
        }
}
        public static void sortByISBN(Book[] book){
        int Tbook = book.length - 1;
        for(int i = 0; i < book.length - 1; i++)
        {
            if(book[i] == null)
            {
                Tbook--;
            } else if(book[i].getISBN() == null){
                Tbook--;
            }
        }
        System.out.println(Tbook);
        System.out.println("If ascending type 1, if descending type 2.");
        int t2 = s.nextInt();
        if(t2 == 1)
        {
        System.out.println("Sorted By Ascending: ");
        for(int i = 0; i < Tbook; i++){
            if( i <= 9){
                for(int j = i+1; j < Tbook; j++){
                    if(book[i].getISBN() == null){}
                    else{
                        if(book[i].getISBN().compareToIgnoreCase(book[j].getISBN()) > 0){
                            Book t = book[i];
                            book[i] = book[j];
                            book[j] = t;
                            if(book[i] == null){break;}
                        }
                        }    
                    }
                }
            if(book[i].getISBN() == null){}else{book[i].displayInfo(); System.out.println("");}
            }
            System.out.println("Returning to main menu...");
            WelcomeUser(book);
        }
        else
        {
            System.out.println("Sorted By Descending: ");
            for(int i = 0; i < Tbook; i++){
            if( i <= 9){
                for(int j = i+1; j < Tbook; j++){
                    if(book[i].getISBN() == null){}
                    else{
                        if(book[i].getISBN().compareToIgnoreCase(book[j].getISBN()) < 0){
                            Book t = book[i];
                            book[i] = book[j];
                            book[j] = t;
                            if(book[i] == null){break;}
                        }
                        }    
                    }
                }
            if(book[i].getISBN() == null){}else{book[i].displayInfo(); System.out.println("");}
            }
            System.out.println("Returning to main menu...");
            WelcomeUser(book);
        }
}
    //searching method
        public static void searchBook(Book[] book){
            String title;
            String ISBN;
            System.out.println("Please input the title or ISBN of the book you want to search.");
            title = s.nextLine();
            ISBN = s.nextLine();
            for(int i=0; i<book.length;i++)
            {
            if(title.equalsIgnoreCase(book[i].getTitle()) || ISBN.equalsIgnoreCase(book[i].getTitle()))
            {
                System.out.println("Book found at index: " + i);
                book[i].displayInfo();
                break;
            }
            }
            WelcomeUser(book);
        }
    //delete method
        public static void deleteBook(Book[] book){
            int Tbook = book.length-1;
            System.out.println("List of Books:" + "\n");
            for(int i = 0; i < book.length - 1; i++)
            {
                if(book[i] == null){Tbook--;} 
                else if(book[i].getISBN() == null){Tbook--;}
            }
            //display prompt
            for(int i=0; i<Tbook; i++){
                if(book[i].getTitle() == null){}else{
                System.out.println("Book " + (i+1) + ": ");
                book[i].displayInfo();
                System.out.println("");
                }
            }
            System.out.println("Pick a number from 1 - 10 to delete the book content assigned to it.");
            int BookIndex = s.nextInt() - 1;
            if(BookIndex == 0 || BookIndex == 1 || BookIndex == 2 || BookIndex == 3 || BookIndex == 4 || BookIndex == 5 || BookIndex == 6 || BookIndex == 7 || BookIndex == 8 || BookIndex == 9)
            {
            book[BookIndex] = new Book();
            System.out.println("Book " + (BookIndex + 1) +" deleted successfully!" + "\n");
            }else{System.out.println("Invalid Number!!");}
            System.out.println("Updated list: ");
            for(int i=0; i<Tbook;i++){
                if(book[i].getTitle() == null){System.out.println("Book " + (i+1) + " is empty." + "\n");}
                else{
                    book[i].displayInfo();
                    System.out.println("");
                }
            }
            for(int i=0; i<Tbook; i++){
                if(book[i].getTitle() == null)
                {
                    System.out.println("Book " + (i+1) + " is empty, system will rearrange the library." + "\n");
                    Rearrange(book);
                }
            }
            WelcomeUser(book);
        }
    //rearranging method(to remove null object)
        public static void Rearrange(Book[] book){
            int Tbook = book.length;
                    //booklength initialization
        for(int i = 0; i < book.length - 1; i++)
        {
            if(book[i] == null){Tbook--;} 
            else if(book[i].getTitle() == null){Tbook--;}
        }
                    //default list
                    System.out.println("Default Books:" + "\n");
                    for(int y=0;y<Tbook;y++){
                    if(null != book[y]){
                    System.out.println("Book " + (y+1) + ": ");
                            book[y].displayInfo();
                            System.out.println(""); 
                    }
                    else if (book[y] == null){
                    System.out.println("Book " + (y+1) + " is empty." + "\n");
                    }else{}
                    }
                    //putting string variable to null array
                    for(int z=0;z<Tbook;z++){
                    if(null != book[z]){}else{
                    for(int i=0; i<Tbook; i++){
                                if(book[i] == null || book[i].getTitle()==null){
                                    book[i] = new Book(b.uiTitle(""), b.uiAuthor(""), b.uiPublisher(""), b.uiISBN(""));
                                     //System.out.println(i + book[i].getTitle());
                                }
                            }
                        }
                    }
                    //rearranging method
                    System.out.println("Rearranged List: " + "\n");
                    for(int i=0; i< Tbook; i++)
                    {
                    if( i <= 9){
                    for(int j = i+1; j < Tbook; j++){
                        if(book[j].getTitle() == null){break;}
                        else if("".equalsIgnoreCase(book[i].getTitle())){
                            Book t = book[i];
                            book[i] = book[j];
                            book[j] = t;
                            if(book[j] == null){break;}
                        }
                        else{} 
                        }
                    }  
                }
                    for(int i=0; i< Tbook; i++)
                    {
                    if("".equals(book[i].getTitle()))
                    {
                    book[i] = new Book();
                    }
                    if(book[i].getTitle() == null || book[i] == null){System.out.println("Book " + (i+1) + " is empty.");}else{
                        System.out.println("Book " + (i+1));
                        book[i].displayInfo();
                        System.out.println("");
                    }
                    
                    }
                    System.out.println("");
                    WelcomeUser(book);
            }
    //main method
        public static void main(String[] args){ 
    Book[] book = new Book[10];
    System.out.println("Please add your books");
    String author, title, publisher, isbn, temp;
    int emptybook = 0;
    for(int i=0; i < book.length; i++){
                System.out.print("Type Title: "); title = s.nextLine();
                System.out.print("Type Author: "); author = s.nextLine();
                System.out.print("Type Publisher: "); publisher = s.nextLine();
                System.out.print("Type ISBN: "); isbn = s.nextLine();
                //book[i] = new Book(b.uiTitle(Integer.toString(i+5)), b.uiAuthor(Integer.toString(i+4)), b.uiPublisher(Integer.toString(i+3)), b.uiISBN(Integer.toString(i+2)));
                book[i] = new Book(b.uiTitle(title), b.uiAuthor(author), b.uiPublisher(publisher), b.uiISBN(isbn));
                System.out.print("Do you want to add more? ");
                temp = s.nextLine(); 
                if("Yes".equalsIgnoreCase(temp)){}
                else{break;}
                
    }
    System.out.println("Book count: " + b.getBookCount());
    WelcomeUser(book);
        }     
}