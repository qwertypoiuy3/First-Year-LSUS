/*
 * Name: Karin Galicia
 * Course: CSC 135
 * Project: Problem 5.3
 * File name: DieTriplet.java
 */
public class DieTriplet 
{
    //Sets the maximum value a die can have
    private final int MAX = 6;
    //Creates three dice
    private int faceValue1, faceValue2, faceValue3;
    
    //Constructor for a new DieTriplet object
    public DieTriplet()
    {
        faceValue1 = 1;
        faceValue2 = 1;
        faceValue3 = 1;
    }
    
    //Simulates all dice being thrown
    public String roll()
    {
        faceValue1 = (int)(Math.random() * MAX) + 1;
        faceValue2 = (int)(Math.random() * MAX) + 1;
        faceValue3 = (int)(Math.random() * MAX) + 1;
        return (faceValue1 + ", " + faceValue2 + ", " + faceValue3);
    }
    
    //Stter methods, taking all three values
    public void setFaceValues(int a, int b, int c)
    {
        faceValue1 = a;
        faceValue2 = b;
        faceValue3 = c;
    }
    
    //All getter methods
    public int getFaceValue1()
    {
        return faceValue1;
    }
    public int getFaceValue2()
    {
        return faceValue2;
    }
    public int getFaceValue3()
    {
        return faceValue3;
    }
    
    //Adds the values of the three dice
    public int sum()
    {
        int op = faceValue1 + faceValue2 + faceValue3;
        return op;
    }
    
    //Returns all values for the three dice
    public String toSring()
    {
        String value1 = Integer.toString(faceValue1);
        String value2 = Integer.toString(faceValue2);
        String value3 = Integer.toString(faceValue3);
        return value1 + ", " + value2 + ", " + value3;
    }
}
