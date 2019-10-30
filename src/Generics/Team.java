package Generics;

import java.util.ArrayList;

public class Team {

    private String name;
    private int win = 0;
    private int lost = 0;
    private int tied = 0;
    private int played = 0;

    private ArrayList<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(Player player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on team.");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName() + " is picked for team " + this.name);
            return true;
        }
    }

    public void matchResult(Team opponent, int ourScore, int theirScore){
        if(ourScore > theirScore){
            win++;
        }else if(ourScore == theirScore){
            tied++;
        }else{
            lost++;
        }
        played++;

        if(opponent != null) {
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
