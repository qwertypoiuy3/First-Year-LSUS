import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;
/*
 * Name: Karin Galicia
 * Course: CSC 135-1
 * Project: Problem 3.2
 * File name: EuclideanDistsence.java
 */
public class EuclideanDistance 
{
    public static void main(String[] args) 
    {
        //Rounds decimal
        DecimalFormat frmt = new DecimalFormat("0.00");
   
        //User input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the two pairs of x and y values: ");
        String valuesStr = scan.nextLine();
        
        //Seaparation of values in String
        StringTokenizer separation = new StringTokenizer(valuesStr);
        
        //First pair of values
        String x = separation.nextToken();
        int valFirst = Integer.parseInt(x);
        String y = separation.nextToken();
        int valSecond = Integer.parseInt(y);
        
        //Second pair of values
        String xS = separation.nextToken();
        int valThird = Integer.parseInt(xS);
        String yS = separation.nextToken();
        int valFourth = Integer.parseInt(yS);
        
        //Distance formula
        double op = Math.sqrt(Math.pow( (valThird - valFirst), 2) + 
                Math.pow( (valFourth - valSecond), 2) );
        
        //Output
        System.out.println("The distance between (" + valFirst + "," +
                valSecond + ") and (" + valThird + "," + valFourth + ")" +
                " is: " + frmt.format(op) );
    }
    
}
