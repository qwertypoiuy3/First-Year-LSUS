/*
 * Name: Karin Galicia
 * Course: CSC 135
 * Project: FinalProject_Galicia_Karin
 * File name: BarcodeBuilder.java
 */
public class BarcodeBuilder 
{
//Creates private variables zipNumber and length
    private long zipNumber;
    private final int length = 9;
    
//Builder for the BarcodeBuilder class
    public BarcodeBuilder(long zipNumber)
    {
        this.zipNumber = zipNumber;
    }
    
//Returns true if the length for the ZIP number is 9 digits 
//Else it returns false
    public boolean check(long a)
    {
        String o = Long.toString(a);
        if(o.length() == length)
        {
            return true;
        }
        return false;
    }
    
//Returns the value of zipNumber
    public long getNum()
    {
        return zipNumber;
    }
    
//Calculates the last number for the ZIP code and returns it
    public int correctionCalculator(int a)
    {
        int b = (a / 10 + 1) * 10;
        return b - a;
    }
    
//Takes in a long variable so it can be turned into its barcode version
    public String vizualize(long a)
    {
    //Creates an empty String and int variable so I can add value at the end.
        String all = "|"; 
        int sum = 0;
        
    //Instantiates a NumberTranslation variable, so it can change numbers into 
    //their barcode version.
        NumberTranslation x;
        
    //Turns the paramater a into a String so I can get each number with a 
    //for loop.
        String join = Long.toString(a);
        
    //Loops over the previously stated String, "translating" each number into 
    //their barcode version, and adding it to the empty String. 
    //Then it adds each number value individually and adds to sum.
        for(int i = 0; i < join.length(); i++)
        {
            char single = join.charAt(i);
            int y = Character.getNumericValue(single);
            x = new NumberTranslation(y);
            all += x.translate(y);
            sum += y;
        }
        
    //Uses the correctionCalculator method created previously, using sum as its 
    //parameter, and translates it as a barcode.
        BarcodeBuilder last = new BarcodeBuilder(sum);
        int correction = last.correctionCalculator(sum);
        
        NumberTranslation lastTranslation = new NumberTranslation(correction);
        String translation = lastTranslation.translate(correction);
        
    //returns the String all which contains the numbers the user inputs as well
    //as the last correction number at the end.
        return all + translation + "|";
    }
    
//Returns the ZIP code in formatted manner
    public String toString()
    {
        String zip = Long.toString(zipNumber);
        String first = zip.substring(0,5);
        String second = zip.substring(5,zip.length() );
        return first + "-" + second;
    }
}
