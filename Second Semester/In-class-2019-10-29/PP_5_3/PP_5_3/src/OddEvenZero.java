
import java.util.Scanner;

/**
 * PP 5.3, Page 263 Write a program that determines and prints the number of
 * odd, even and zero digits in an integer value read from the keyboard. Name
 * your class OddEvenZero. In-class-2016-11-01
 */
public class OddEvenZero {

    public static void main(String[] args) {
        int oddCount = 0, evenCount = 0, zeroCount = 0;
        int value, digit;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer value: ");
        value = scan.nextInt();

        if (value == 0) {
            zeroCount++;
        }

        while (value > 0) {

            digit = value % 10;

            if (digit == 0) {
                zeroCount++;
            } else if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            value = value / 10;
        }
        System.out.println("Zero digits: " + zeroCount);
        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
    }

}
