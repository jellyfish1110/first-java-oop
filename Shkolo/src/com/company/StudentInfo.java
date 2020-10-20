package com.company;

import java.util.ArrayList;

public class StudentInfo
{
    private String studentName;
    private double marks;
    private ArrayList<Double> studentMarks = new ArrayList<>();
    private ArrayList<StudentInfo> students = new ArrayList<>();

    public StudentInfo()
    {
        this.marks = 0;
        this.studentMarks = new ArrayList<>();
    }

    public StudentInfo(String studentName, double marks, double mark_Counter) throws studentsException, marksException, sizeException
    {
        this.studentName = studentName;
        this.marks = marks;
        this.studentMarks = studentMarks;
        while(mark_Counter > 0)
        {
            studentMarks.add(marks);
            mark_Counter--;
        }

        if (studentMarks.size() > 10)
        {
            throw
                    new studentsException("No more than 10 students allowed!");

        }

        if (marks > 6 || marks < 2)
        {
            throw
                    new marksException("Marks must be between 2 and 6!");
        }

        if (studentName.length() < 5)
        {
            throw
                    new sizeException("Name must contain at least 5 characters");
        }
    }

    public String getName()
    {
        return studentName;
    }

    public ArrayList<Double> getMarks()
    {
        return studentMarks;
    }

    public void addMark(double new_Mark) throws studentsException, marksException
    {
        studentMarks.add(new_Mark);
        if(studentMarks.size() == 10)
        {
            throw
                    new studentsException("Marks list already full!");
        }

        if(new_Mark > 6 || new_Mark < 2)
        {
            throw
                    new marksException("Marks must have a value between 2 and 6!");
        }
    }

    public void getAverage()
    {


        double average = marks / studentMarks.size();
        double bullcrap = studentMarks.size();
/*
        while(bullcrap != 1)
        {
            marks = marks + marks;
            bullcrap--;
        }
        */
        System.out.println(average);
    }

    public String toString()
    {
        double counter = 1;
        StringBuilder string_Builder = new StringBuilder();

        for(StudentInfo student : students)
        {
            string_Builder.append("Name: ");

            while(studentMarks.size() > 0)
            {
                string_Builder.append("Mark " + counter);
                string_Builder.append(studentMarks.get(0) + " ");
                counter++;
            }
        }
        return string_Builder.toString();
    }

    public void removeMark(int index) throws sizeException
    {
        if(index > studentMarks.size())
        {
            throw
                    new sizeException("Mark is null, cannot be removed");
        }
        else
        {
            studentMarks.remove(index);
        }
    }

    public void replaceMarkAt(int index, double new_Mark) throws sizeException, marksException
    {
        if(index > studentMarks.size())
        {
            throw
                    new sizeException("Mark is null, cannot be removed");
        }
        else
        {
            studentMarks.set(index, new_Mark);
        }

        if(new_Mark > 6 || new_Mark < 2)
        {
            throw
                    new marksException("Marks must have a value between 2 and 6!");
        }
    }
}
