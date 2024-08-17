import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * Name: Karin Galicia
 * Course: CSC 135-1
 * Project: MidterV1-Last-First
 * File name: MortgageComparator.java
 */
public class MortgageComparator 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        NumberFormat frmt = NumberFormat.getCurrencyInstance();
        DecimalFormat frmt2 =  new DecimalFormat("0.00");
        
        //User input
        System.out.print("Enter the annual interest rate: ");
        double rate = scan.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();
        System.out.print("Enter the amount of the mortgage: ");
        int mortgage = scan.nextInt();
        
        //Math operations
        double month = (rate / 100) / 12;
        double op = (month * mortgage) / (1 - (1 / (Math.pow(1 + month,
                12 * years) ) ));
        double total = op * 12 * years;
        double overpayment = total - mortgage;
        double percentage = overpayment / 100;
        
        double month2 = ((rate - 1) / 100) / 12;
        double op2 = (month2 * mortgage) / (1 - (1 / (Math.pow(1 + month2,
                12 * years) ) ));
        double total2 = op2 * 12 * years;
        double overpayment2 = total2 - mortgage;
        double percentage2 = overpayment2 / 100;
        
        double month3 = ((rate - 0.5) / 100) / 12;
        double op3 = (month3 * mortgage) / (1 - (1 / (Math.pow(1 + month3,
                12 * years) ) ));
        double total3 = op3 * 12 * years;
        double overpayment3 = total3 - mortgage;
        double percentage3 = overpayment3 / 100;
        
        double month4 = ((rate + 0.5) / 100) / 12;
        double op4 = (month4 * mortgage) / (1 - (1 / (Math.pow(1 + month4,
                12 * years) ) ));
        double total4 = op4 * 12 * years;
        double overpayment4 = total4 - mortgage;
        double percentage4 = overpayment4 / 100;
        
        double month5 = ((rate + 1) / 100) / 12;
        double op5 = (month5 * mortgage) / (1 - (1 / (Math.pow(1 + month5,
                12 * years) ) ));
        double total5 = op5 * 12 * years;
        double overpayment5 = total5 - mortgage;
        double percentage5 = overpayment5 / 100;
        
        //Output
        System.out.println("\n*********************************");
        System.out.println("Loan amount: " + frmt.format(mortgage));
        System.out.println("Number of years: " + years);
        System.out.println("Range of interest rates: " + (rate - 1) + "%" + 
                " - " + (rate + 1) + "%");
        System.out.println("*********************************");
        
        System.out.println("\nInterest Rate\tMonthly Payment\t Total Payment\t"
                + "$Overpayment\t%Overpayment");
        
        System.out.println(rate - 1 + "%\t\t" + frmt.format(op2) + "\t\t " + 
                frmt.format(total2) + "\t" + frmt.format(overpayment2) + "\t" +
                frmt2.format(percentage2) + "%");
        
        System.out.println(rate - 0.5 + "%\t\t" + frmt.format(op3) + "\t\t " + 
                frmt.format(total3) + "\t" + frmt.format(overpayment3) + "\t" +
                frmt2.format(percentage3) + "%");
        
        System.out.println(rate + "%\t\t" + frmt.format(op) + "\t\t " + 
                frmt.format(total) + "\t" + frmt.format(overpayment) + "\t" +
                frmt2.format(percentage) + "%");
        
        System.out.println(rate + 0.5 + "%\t\t" + frmt.format(op4) + "\t\t " + 
                frmt.format(total4) + "\t" + frmt.format(overpayment4) + "\t" +
                frmt2.format(percentage4) + "%");
        
        System.out.println(rate + 1 + "%\t\t" + frmt.format(op5) + "\t\t " + 
                frmt.format(total5) + "\t" + frmt.format(overpayment5) + "\t" +
                frmt2.format(percentage5) + "%");
    }   
}
