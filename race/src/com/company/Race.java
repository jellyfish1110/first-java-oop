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
            current_Contestant.getDistance();
        }
    }


    public void simulateRace(int iterationCounter, int contestant_Iterations)
    {
        System.out.println("         Ready, ");
        System.out.println("      Set...GO!!! \n");
        System.out.println(getContestantStanding());
        while(iterationCounter >= 1)
        {
            for (Contestant currentContestant : Contestants)
            {
                currentContestant.calcDistance(contestant_Iterations);
                currentContestant.calcDistance(contestant_Iterations);
                currentContestant.calcDistance(contestant_Iterations);

            }
            iterationCounter--;
            contestant_Iterations++;
            resetContestants();
            Collections.sort(Contestants, Contestant.comparator);
            System.out.println(getContestantStanding());
        }
        System.out.println("      Race is over!");
        System.out.println("        results:");
        System.out.println(getContestantStanding());
    }


    public String getContestantStanding()
    {
        StringBuilder sb = new StringBuilder();
        for (Contestant sorted_Contestant : Contestants)
        {
            sb.append(sorted_Contestant.getName());
            sb.append(": ");
            sb.append(sorted_Contestant.getDistance());
            sb.append(" meters (");
            sb.append(sorted_Contestant.getSpeed());
            sb.append(" km/h)\n");
        }
        return sb.toString();
    }
}