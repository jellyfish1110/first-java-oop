package com.company;

public class sizeException extends Exception
{
    public sizeException(String name)
    {
        super("Name must contain at least 5 characters, got '" + name + "'");
    }
}
