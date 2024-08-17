import java.util.Scanner;
/*
 * Name: Karin Galicia
 * Course: CSC 135-1
 * Project: Problem 2.8
 * File name: TimeConverter.java
 */
public class TimeConverter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours, minutes, seconds;
        
        System.out.print("Enter the amount of hours, minutes, and seconds: " + "\nHours: ");
        hours = scan.nextInt();
        
        System.out.print("Minutes: ");
        minutes = scan.nextInt();
        
        System.out.print("Seconds: ");
        seconds = scan.nextInt();
        
        int totalsecs = (hours * 60 * 60) + (minutes * 60) + seconds;
        System.out.println("Total number of seconds in " + hours + " hours, "
            + minutes + " minutes, and " + seconds + " seconds is: " + totalsecs + " seconds.");
    }
    
}
