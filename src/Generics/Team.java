package Generics;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private int win = 0;
    private int lost = 0;
    private int tied = 0;
    private int played = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on team.");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName() + " is picked for team " + this.name);
            return true;
        }
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;

        if(ourScore > theirScore){
            win++;
            message = " beat ";
        }else if(ourScore == theirScore){
            tied++;
            message = " drew up ";
        }else{
            lost++;
            message = " lost to ";
        }
        played++;

        if(opponent != null) {
            System.out.println(this.name + message + opponent.name);
            opponent.matchResult(null, theirScore, ourScore);
        }

    }

    public int ranking(){
        return (win * 2) + tied;
    }

    public int numPlayers(){
        return this.members.size();
    }
}
