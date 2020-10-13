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


    public Contestant(String Contestant, int Speed)
    {
        this.Contestant = Contestant;
        this.Speed = Speed;
        this.Distance = 0;
    }

    private String Contestant = new String();
    private int Speed;
    private int Distance;

    public String getName()
    {
        return Contestant;
    }

    public int getSpeed()
    {
        return Speed;
    }

    public int getDistance()
    {
        return Distance;
    }

    public void calcDistance(int iteration_count)
    {
        Distance = Speed * iteration_count;
    }

    public static Comparator<Contestant> comparator = new Comparator<com.company.Contestant>()
    {
        @Override
        public int compare(Contestant o1, Contestant o2)
        {
            return o2.Distance - o1.Distance;
        }
    };
}