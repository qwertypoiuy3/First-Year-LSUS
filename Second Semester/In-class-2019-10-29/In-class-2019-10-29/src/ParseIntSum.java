/* Write a program that will accept a positive integer from the user.
   It will sum all the digits of the integer it accepted, print each digit, 
   as well as print the sum.

   Name your class ParseIntSum.java
   In-class-2017-10-31 NetBeans Project
*/

import java.util.Scanner;

public class ParseIntSum
{
    //-----------------------------------------------------------------
    //  Counts the number of odd, even, and zero digits in an
    //  integer input value.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        int userValue, value, digit, sum=0;
        String digitOut = ""; // this will keep the digits string

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        userValue = scan.nextInt();

        value = userValue; // this makes a copy of it and keeps the original
        
        System.out.print("The sum of digits in " + userValue + " ");
        
        while (value > 0)
        {
            digit = value % 10;
            
            if (digitOut=="")
                digitOut = Integer.toString(digit); 
            else
                digitOut = digit + "+" + digitOut;

            sum += digit;
            value = value / 10;
        }
        
        System.out.print(digitOut + " = " + sum + ".\n");
    }
}

