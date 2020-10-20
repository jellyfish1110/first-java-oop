package com.company;

public class student_MarksException extends Throwable
{
    public student_MarksException(int markCount)
    {
        super("Expected no more than 10 marks, got " + markCount);
    }
}
