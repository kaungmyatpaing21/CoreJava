package Generics_Challenge;

import Generics.Team;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends Generics.Team> {
    private String name;
    private ArrayList<T> league = new ArrayList<T>();

    public League(String name){
        this.name = name;
    }

    public boolean add(T team){
        if(league.contains(team.getName())){
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeagueTable(){
        //this will automatically invoke Team.compareTo cuz Team.compareTo is implementation of Comparable
        Collections.sort(league);
        for(Team t: league){
            System.out.println(t.getName() + ": " + t.ranking() );
        }
    }
}
