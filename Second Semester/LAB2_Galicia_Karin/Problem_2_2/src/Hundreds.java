import java.util.Scanner;
/*
 * Name: Karin Galicia
 * Course: CSC 135-1
 * Project: Problem 2.2
 * File name: Hundreds.java
 */
public class Hundreds {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int a = scan.nextInt();
        
        int op = (a / 100) % 10;
        
        System.out.println("The number in the hundreds position is: " + op + ".");
    }
    
}
