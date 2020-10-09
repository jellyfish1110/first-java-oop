package com.company;

import java.util.Comparator;

public class Contestant
{

    public Contestant()
    {
        this.Contestant = "";
        this.Distance = 0;
        this.Speed = 0;
    }


    public Contestant(String Contestant, double Speed)
    {
        this.Contestant = Contestant;
        this.Speed = Speed;
        this.Distance = 0;
    }

    private String Contestant = new String();
    private double Speed;
    private double Distance;

    public String getName()
    {
        return Contestant;
    }

    public double getSpeed()
    {
        return Speed;
    }

    public double getDistance()
    {
        return Distance;
    }

    public void calcDistance(int iteration_count)
    {
        Distance = Speed * iteration_count;
    }

    public static Comparator<Contestant> comparator = new Comparator<com.company.Contestant>()
    {
        public double compare(Contestant o1, Contestant o2)
        {
            return o1.Distance - o2.Distance;
        }
    };
}