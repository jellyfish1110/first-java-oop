package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Race
{

    public Race()
    {
        this.Contestants = new ArrayList<>();
    }


    public Race(ArrayList<Contestant> Contestants)
    {
        this.Contestants = Contestants;
    }


    private ArrayList<Contestant> Contestants = new ArrayList<Contestant>();


    public ArrayList<Contestant> getContestants()
    {
        return Contestants;
    }


    public void addContestants(Contestant new_Contestant)
    {
        Contestants.add(new_Contestant);
    }


    public void resetContestants()
    {
        for (Contestant current_Contestant : Contestants)
        {
            current_Contestant.calcDistance(0);
        }
    }

    public void simulateRace(int iterationCounter)
    {
        while(iterationCounter >= 1)
        {
            for (Contestant currentContestant : Contestants)
            {
                currentContestant.calcDistance(1);
                currentContestant.calcDistance(1);
                currentContestant.calcDistance(1);
            }
            iterationCounter--;
            resetContestants();
            Collections.sort(Contestants, Contestant.comparator);
        }
    }
}