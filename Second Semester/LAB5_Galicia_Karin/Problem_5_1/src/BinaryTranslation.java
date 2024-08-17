import java.util.Scanner;
/*
 * Name: Karin Galicia
 * Course: CSC 135
 * Project: Problem 5.1
 * File name: BinaryTranslation.java
 */
public class BinaryTranslation 
{
    /*There is an error in my program that I couldn't figure out
    If you write a single digit it skips the first part of the loop.
    I tried setting i value to 0 after the  first check, but it didnt work.
    */
    public static void main(String[] args) 
    {
        //user input
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a binary value: ");
        String a = scan.nextLine();
        
        //empty variables to hold value
        String word = "";
        int num = 0;
        
        //loops over the input string and assigns value to previous variables
        for(int i = 0; i < a.length(); i++)
        {
            char b = a.charAt(i);
            if(b != '1' && b != '0')
            {
                System.out.print("This is not a valid binary number.\n\n"
                        + "Enter another value: ");
                a = scan.nextLine();
            }
            else
            {
                word += b;
                if(b == '1')
                {
                    num++;
                }
            }
        }
        //output
        System.out.println("The total number of 1 digits in " + word + " is: "
                + num);
    }
}
