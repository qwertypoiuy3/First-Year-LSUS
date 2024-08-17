import java.text.NumberFormat;
import static java.text.NumberFormat.getCurrencyInstance;

/*
 * Name: Karin Galicia
 * Course: CSC 135-1
 * Project: Problem 4.1
 * File name: Television.java
 */
public class Television 
{
    private double price, size;
    private String brand;
    
    //Constructors of a Televsion object
    public Television()
    {
        price = 0;
        size = 0;
        brand = null;
    }
    public Television(double price, double size, String brand)
    {
        this.price = price;
        this.size = size;
        this.brand = brand;
    }
    
    //Getters
    public double getPrice()
    {
        return price;
    }
    public double getSize()
    {
        return size;
    }
    public String getBrand()
    {
        return brand;
    }
    
    //Setters
    public void setPrice(double a)
    {
        price = a;
    }
    public void setSize(double a)
    {
        size = a;
    }
    public void setBrand(String a)
    {
        brand = null;
        brand = a;
    }
    
    public String toString()
    {
        NumberFormat frmt = getCurrencyInstance();
        return("The " + brand + " television is " + size + "\" and it is " + frmt.format(price) );
    }
}
