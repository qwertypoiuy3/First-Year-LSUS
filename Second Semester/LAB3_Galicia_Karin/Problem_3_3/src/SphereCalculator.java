import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * Name: Karin Galicia
 * Course: CSC 135-1
 * Project: Problem 3.3
 * File name: SphereCalculator.java
 */
public class SphereCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        DecimalFormat frmt = new DecimalFormat("0.0000");
        
        //User input
        System.out.print("Enter the length of the radius: ");
        double radius = scan.nextDouble();
        
        //Surface area and volume formulas
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        double volume = Math.PI * Math.pow(radius, 3) * 4 / 3;
        
        //Output
        System.out.println("\nSphere with a radius of: " + radius);
        System.out.println("Volume: " + frmt.format(volume) );
        System.out.println("Surface area: " + frmt.format(surfaceArea) );
    }
    
}
