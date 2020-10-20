package com.company;

public class invalidIndex extends Exception
{
    public invalidIndex(int index)
    {
        super("Index must be in range of already existing number of marks!");
    }
}
