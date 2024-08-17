import java.util.Scanner;
/*
 * Name: Karin Galicia
 * Course: CSC 135-1
 * Project: Problem 2.3
 * File name: BMICalculator.java
 */
public class BMICalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your weight in pounds: ");
        int weight = scan.nextInt();
        System.out.print("Enter your height in inches: ");
        int height = scan.nextInt();
        
        int op = weight * 703 / height * height;
        
        System.out.println("Your BMI is: " + op + ".");
    }
    
}
