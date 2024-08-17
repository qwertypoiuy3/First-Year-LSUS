import java.text.NumberFormat;
import java.util.Scanner;
/*
 * Name: Karin Galicia
 * Course: CSC 135-1
 * Project: Problem 2.14
 * File name: CartCalculator.java
 */
public class CartCalculator 
{
    public static void main(String[] args) 
    {
        //Formats numbers into dollar values
        NumberFormat dol = NumberFormat.getCurrencyInstance();
        //Gets user values
        Scanner scan = new Scanner(System.in);
        
        //User input
        System.out.print("Enter the amount of items: ");
        int amount = scan.nextInt();
        System.out.print("Enter the price: ");
        double price = scan.nextDouble();
        System.out.print("Enter the tax rate: ");
        double tax = scan.nextDouble();
        
        //Program output
        double total = (amount * price) * (tax / 100 + 1);
        System.out.println("The price is: " + dol.format(total));
    }
}
