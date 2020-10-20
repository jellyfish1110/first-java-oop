package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class StudentInfo
{
    private String studentName;
    private List<Double> studentMarks = new ArrayList<>();
    private ArrayList<StudentInfo> students = new ArrayList<>();

    public StudentInfo()
    {
        this.studentMarks = new ArrayList<>();
    }

    public StudentInfo(String studentName, List<Double> studentMarks) throws student_MarksException, marksException, sizeException
    {
        this.studentName = studentName;
        this.studentMarks = studentMarks;

        if (studentMarks.size() > 10)
        {
            throw
                    new student_MarksException(studentMarks.size());

        }

        for (double current_Mark : studentMarks)
        {
            if(current_Mark > 6 || current_Mark < 2)
            {
                throw
                        new marksException(current_Mark);
            }
        }

        if (studentName.length() < 5)
        {
            throw
                    new sizeException(studentName);
        }
    }

    public String getName()
    {
        return studentName;
    }

    public List<Double> getMarks()
    {
        return studentMarks;
    }

    public void addMark(double new_Mark) throws student_MarksException, marksException
    {

        if(studentMarks.size() > 10 || studentMarks.size() < 0)
        {
            throw
                    new student_MarksException(studentMarks.size());
        }

        else if(new_Mark > 6 || new_Mark < 2)
        {
            throw
                    new marksException(new_Mark);
        }

        else
        {
            studentMarks.add(new_Mark);
        }

    }

    public double getAverage()
    {

        double sum = 0;
        for(double mark : getMarks())
        {
            sum += mark;
        }

        double average = sum / studentMarks.size();

        return average;
    }

    public String toString()
    {
        DecimalFormat format = new DecimalFormat("#.00");
        double averageMark = getAverage();
        int counter = 1;

        StringBuilder string_Builder = new StringBuilder();

            string_Builder.append(" Name: " + getName() + "\n");

            for(double mark : studentMarks)
            {
                string_Builder.append(" Mark " + counter + ": ");
                string_Builder.append(format.format(mark) + " " + "\n");
                counter++;
            }
            string_Builder.append("Average" + ":" + " [" + format.format(averageMark) + "]");

        return string_Builder.toString();
    }

    public void removeMark(int index) throws student_MarksException
    {
        if(index > studentMarks.size())
        {
            throw
                    new student_MarksException(index);
        }
        else
        {
            studentMarks.remove(index);
        }
    }

    public void replaceMarkAt(int index, double new_Mark) throws invalidIndex, marksException
    {
        if(index > studentMarks.size())
        {
            throw
                    new invalidIndex(index);
        }

        else
        {
            studentMarks.set(index, new_Mark);
        }

        if(new_Mark > 6 || new_Mark < 2)
        {
            throw
                    new marksException(new_Mark);
        }
    }
}
