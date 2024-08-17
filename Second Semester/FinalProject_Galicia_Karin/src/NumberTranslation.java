/*
 * Name: Karin Galicia
 * Course: CSC 135
 * Project: FinalProject_Galicia_Karin
 * File name: NumberTranslation.java
 */
public class NumberTranslation 
{
//Private variables to be used as parameters
    private int digit;
    
//Builder of the NumberTranslation class
    public NumberTranslation(int digit)
    {
        this.digit = digit;
    }
    
//Gives a value for each possible number, returning a "barcode"
    public String translate(int a)
    {
        if(a == 1)
        {
            return ":::||";
        }
        if(a == 2)
        {
            return "::|:|";
        }
        if(a == 3)
        {
            return "::||:";
        }
        if(a == 4)
        {
            return ":|::|";
        }
        if(a == 5)
        {
            return ":|:|:";
        }
        if(a == 6)
        {
            return ":||::";
        }
        if(a == 7)
        {
            return "|:::|";
        }
        if(a == 8)
        {
            return "|::|:";
        }
        if(a == 9)
        {
            return "|:|::";
        }
        if(a == 0)
        {
            return "||:::";
        }
        return "";
    }
}
