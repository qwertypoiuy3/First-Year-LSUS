/*
 * Name: Karin Galicia
 * Course: CSC 135-1
 * Project: Problem 4.3
 * File name: BookShelf.java
 */
public class BookShelf 
{
    public static void main(String[] args) 
    {
        //Creates three book objects
        Book book1 = new Book("Computer Science", "Karin Galicia", "LSUS", 2020);
        Book book2 = new Book("1984", "George Orwell", "Secker & Warburg", 1949);
        Book book3 = new Book("Moby Dick", "Herman Melville", "Harper & "
                + "Brothers", 1851);
        
        System.out.println(book1 + "\n" + book2 + "\n" + book3);
        
        //use of all getter and setter methods
        book1.setTitle("The Shining");
        System.out.println("\n" + book1.getTitle() );
        
        book1.setAuthor("Stephen King");
        System.out.println(book1.getAuthor() );
        
        book1.setPublisher("Doubleday");
        System.out.println(book1.getPublisher() );
        
        book1.setYear(1977);
        System.out.println(book1.getYear() );
        
        System.out.println("\n" + book1);
        
    }
    
}
