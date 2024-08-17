import java.util.Scanner;
/*
 * Name: Karin Galicia
 * Course: CSC 135
 * Project: FinalProject_Galicia_Karin
 * File name: BarcodeVisualizer.java
 */
public class BarcodeVisualizer 
{
    public static void main(String[] args) 
    {
    //Creates a scanner and a BarcodeBulder class so they can be used later 
    //in the program
        Scanner scan = new Scanner(System.in);
        BarcodeBuilder code;
        
    //Prompts the user to imput a 9 digit ZIP code, soit can be added as the
    //parameter of the BarcodeBuilder class previously creates
        System.out.print("Enter a 9 nine digit ZIP code: ");
        long userCode = scan.nextLong();
        code = new BarcodeBuilder(userCode);
        
    //Uses the a BarcodeVisualizer class to check if the input is 9 digits long
        boolean f = code.check(userCode);
        
    //Serves as a break in the next while loop, so it doesn't run forever
        int i = 0;
        
    //The while loop will run as long as i is equal to 0, so when the user 
    //decides not to type in a nother value, it adds 1 to the variable i 
    //causing the while to stop.
        while(i == 0)
        {
        //If the input is 9 digits long it outputs the ZIP code translated into
        //a barcode, using the visualize method in the BarcodeBuilder class
            if(f == true)
            {
                System.out.println("\nThe barcode for the ZIP code " + code + 
                    " is:\n" + code.vizualize(userCode) + "\n\nWould you like"
                                + " to enter ZIP code? (Enter yes or no)");
                String confirm = scan.next();
            //If the user decides to input another value, it assigns new values 
            //to previously created variables. Since i is still equal to 0 it
            //goes through the same if statement before this one.
                if(confirm.equals("yes") )
                {
                    System.out.print("Enter a 9 digit ZIP code: ");
                    userCode = scan.nextLong();
                    code = new BarcodeBuilder(userCode);
                    f = code.check(userCode);
                }
            //If the user decides not to inpu another value it adds 1 to i 
            //causing the while loop to stop.
                else if(confirm.equals("no") )
                {
                    i++;
                }
            }
        //If the input length is not equal to 9 digits, it asks the user to type
        //another value.
            else
            {
                System.out.print("\nThat is not a valid ZIP code.\nPlease enter"
                        + " a 9 digit number: ");
                userCode = scan.nextLong();
                code = new BarcodeBuilder(userCode);
                f = code.check(userCode);
            //Once the input is equal to 9 digits it repeats the same code from
            //the true alternative
                if(f == true)
                {
                    System.out.println("\nThe barcode for the ZIP code " + code 
                    + " is:\n" + code.vizualize(userCode) + "\n\nWould you like"
                            + " to enter ZIP code? (Enter yes or no)");
                    String confirm = scan.next();
                    if(confirm.equals("yes"))
                    {
                        System.out.print("Enter a 9 digit ZIP code: ");
                        userCode = scan.nextLong();
                        code = new BarcodeBuilder(userCode);
                        f = code.check(userCode);
                    }
                    else if(confirm.equals("no"))
                    {
                        i++;
                    }
                }
            }
        }
    }
}
