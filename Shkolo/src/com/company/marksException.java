package com.company;

public class marksException extends Exception
{
    public marksException(double markCount)
    {
        super("Marks must be between 2 and 6, given mark " + markCount + "");
    }
}
