package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you choose a time legnth for this race, please?");

        int iterationsChosenByUser = scan.nextInt();
        int iterationCounter = iterationsChosenByUser;
        int contestantIterations = iterationsChosenByUser / iterationsChosenByUser;

        Contestant john = new Contestant("John", 50);
        Contestant nick = new Contestant("Nick", 45);
        Contestant dimo = new Contestant("Dimo", 60);

        Race nishava = new Race();

        nishava.addContestants(john);
        nishava.addContestants(nick);
        nishava.addContestants(dimo);

        nishava.simulateRace(iterationCounter, contestantIterations);
    }
}
