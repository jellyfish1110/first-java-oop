package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws marksException, studentsException, sizeException
    {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = a;

        StudentInfo go6o = new StudentInfo("peter", a, b);

        go6o.getAverage();
    }
}
