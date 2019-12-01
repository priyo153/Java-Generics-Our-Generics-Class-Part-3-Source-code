package com.timbuchalka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class LeagueTable< T extends Player> {
	
	List<Team<T>> teams=new ArrayList<>();
	
	void addTeam(Team<T> theTeam) {
		teams.add(theTeam);
	}
	
	void addTeamList(List<Team<T>> newTeams) {
		teams.addAll(newTeams);
	}
	
	void printTeamList(){
		
		Collections.sort(teams);
		System.out.println("\n\n---------------------");
		for(Team<T> team:teams) {
			System.out.println(team.getName()+" has a ranking of "+team.ranking());
		}
		
		
	}
	
	

}
