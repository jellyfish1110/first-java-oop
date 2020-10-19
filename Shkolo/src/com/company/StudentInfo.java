package com.company;

import java.util.ArrayList;

public class StudentInfo
{
    public StudentInfo()
    {
        this.marks = marks;
        this.studentMarks = studentMarks;
    }

    public StudentInfo(String studentName, ArrayList studentMarks)
    {
        
    }

    private String studentName;
    private double marks;
    private ArrayList<StudentInfo> studentMarks;

    public String getName()
    {
        return studentName;
    }

    public ArrayList<StudentInfo> getMarks()
    {
        return studentMarks;
    }

    public void addMark(StudentInfo marks)
    {
        studentMarks.add(marks);
    }

    public double getAverage()
    {
        return marks / studentMarks.size();
    }
}
