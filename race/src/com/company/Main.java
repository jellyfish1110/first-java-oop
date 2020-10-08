package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int iterationCounter = scan.nextInt();

        Contestant john = new Contestant();
        Contestant nick = new Contestant();
        Contestant dimo = new Contestant();

        Race nishava = new Race();

        nishava.addContestants(john);
        nishava.addContestants(nick);
        nishava.addContestants(dimo);

        nishava.simulateRace(iterationCounter);
    }
}
