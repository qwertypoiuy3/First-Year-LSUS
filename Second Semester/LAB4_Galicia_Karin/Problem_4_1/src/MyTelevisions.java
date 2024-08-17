import java.text.NumberFormat;
import static java.text.NumberFormat.getCurrencyInstance;
import java.util.Scanner;
/*
 * Name: Karin Galicia
 * Course: CSC 135-1
 * Project: Problem 4.1
 * File name: MyTelevisions.java
 */
public class MyTelevisions 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        NumberFormat frmt = getCurrencyInstance();
        
        double price, price2, price3, size, size2, size3;
        String brand, brand2, brand3;
        Television first, second, third;
        
        //User input for Television 1
        System.out.print("Television 1:\n\tPrice: ");
        price = scan.nextDouble();
        System.out.print("\tBrand: ");
        brand = scan.next();
        System.out.print("\tSize: ");
        size = scan.nextDouble();
        
        //User input for Television 2
        System.out.print("Television 2:\n\tPrice: ");
        price2 = scan.nextDouble();
        System.out.print("\tBrand: ");
        brand2 = scan.next();
        System.out.print("\tSize: ");
        size2 = scan.nextDouble();
        
        //User input for Television 3
        System.out.print("Television 3:\n\tPrice: ");
        price3 = scan.nextDouble();
        System.out.print("\tBrand: ");
        brand3 = scan.next();
        System.out.print("\tSize: ");
        size3 = scan.nextDouble();
        
        //Television objects
        first = new Television(price, size, brand);
        second = new Television(price2, size2, brand2);
        third = new Television(price3, size3, brand3);
        
        //Output
        System.out.println("\n*******************************************\n");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println("\n*******************************************");
        
        //Use of all getters and setters
        System.out.println("\nDemonstration of all getter and setter methods: \n");
        
        first.setBrand("LG");
        System.out.println(first.getBrand() );
        
        second.setPrice(1150);
        System.out.println(second.getPrice() );
        
        third.setSize(10.5);
        System.out.println(third.getSize() );
    }
    
}
