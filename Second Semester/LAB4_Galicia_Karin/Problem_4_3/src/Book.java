/*
 * Name: Karin Galicia
 * Course: CSC 135-1
 * Project: Problem 4.3
 * File name: Book.java
 */
public class Book
{
    private String title, author, publisher;
    private int year;
    
    //contructor for a Book object
    public Book(String title, String author, String publisher, int year)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }
    
    //getters and setter for all parameters
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String a)
    {
        title = a;
    }
    
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String a)
    {
        author = a;
    }
    
    public String getPublisher()
    {
        return publisher;
    }
    public void setPublisher(String a)
    {
        publisher = a;
    }
    
    public int getYear()
    {
        return year;
    }
    public void setYear(int a)
    {
        year = a;
    }
    
    public String toString()
    {
        String out = ("The book with the title " + "\"" + title + "\"" + 
                " was written by " + author + ", and was published by " + 
                publisher + " in " + year);
        return out;
    }
}
