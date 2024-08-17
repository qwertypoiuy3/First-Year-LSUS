import java.util.Scanner;
/*
 * Name: Karin Galicia
 * Course: CSC 135-1
 * Project: Problem 2.1
 * File name: Fraction.java
 */
public class Fraction {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the numerator: ");
        int a = scan.nextInt();
        
        System.out.print("Enter the denominator: ");
        int b = scan.nextInt();
        
        System.out.println("The result of a/b is: " + (double)a/(double)b);
    }
    
}
