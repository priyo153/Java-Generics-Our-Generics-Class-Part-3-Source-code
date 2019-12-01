package com.timbuchalka;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    	/*
	    FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
//        adelaideCrows.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

//        ArrayList<Team> teams;
//        Collections.sort(teams);
 * 
 */
    	
    	FootballPlayer joe = new FootballPlayer("Joe");
    	FootballPlayer poe = new FootballPlayer("poe");
    	FootballPlayer smo = new FootballPlayer("smo");
    	
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        melbourne.addPlayer(joe);
        melbourne.addPlayer(poe);
        melbourne.addPlayer(smo);
        
        
        Team<FootballPlayer> arsenal = new Team<>("arsenal");
        arsenal.addPlayer(joe);
        arsenal.addPlayer(poe);
        arsenal.addPlayer(smo);
        
        Team<FootballPlayer> madrid = new Team<>("madrid");
        madrid.addPlayer(joe);
        madrid.addPlayer(poe);
        madrid.addPlayer(smo);
        
        melbourne.matchResult(arsenal, 12, 3);
        melbourne.matchResult(madrid, 0, 3);
        melbourne.matchResult(madrid, 3, 13);
        madrid.matchResult(arsenal, 5, 2);
        arsenal.matchResult(melbourne, 23, 1);
        arsenal.matchResult(melbourne, 23, 1);
        
        List <Team<FootballPlayer>> newTeams=new ArrayList<>();
        newTeams.add(melbourne);
        newTeams.add(madrid);
        
        LeagueTable<FootballPlayer> theTable=new LeagueTable<>();
        theTable.addTeam(arsenal);
        theTable.addTeamList(newTeams);
        
        theTable.printTeamList();
        
        Team<BaseballPlayer> cubs = new Team<>("cubs");
        
//        theTable.addTeam(cubs);
        
        
        
    	
    	
    }
}
