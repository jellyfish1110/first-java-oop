package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws marksException, student_MarksException, sizeException
    {
        StudentInfo go6o = new StudentInfo("Peter", Arrays.asList(6.00, 3.00, 4.00, 3.50, 5.00, 3.00, 4.50));

//        System.out.printf("%.2f", go6o.getAverage());
        System.out.println(go6o.toString());
        //printf format !!!!!!!!!!!!!!!!!!!
    }
}
