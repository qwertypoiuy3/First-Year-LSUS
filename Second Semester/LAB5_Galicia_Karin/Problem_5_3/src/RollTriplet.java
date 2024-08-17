/*
 * Name: Karin Galicia
 * Course: CSC 135
 * Project: Problem 5.3
 * File name: RollTriplet.java
 */
public class RollTriplet 
{
    public static void main(String[] args) 
    {
        //Creates a a DieTriplet object
        DieTriplet triple = new DieTriplet();
        
        //Creates an empty variable to serve as counter
        int count = 0;
       
        //Loops from 0 to 5000 adding 1 each loop
        for(int i = 0; i < 5000; i++)
        {
            triple.roll();
            
            //Adds 1 to count when all dice are equal to 1
            if(triple.getFaceValue1() == 1 && triple.getFaceValue2() == 1 
                    && triple.getFaceValue3() == 1)
            {
                count++;
            }
        }
        //output
        System.out.println("The number of instances where all values are equal"
                + " to 1 is: " + count);
    }    
}
