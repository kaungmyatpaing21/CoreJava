package Generics;

public class Main {
    public static void main(String[] args) {
        BaseballPlayer pat = new BaseballPlayer("Paticen");
        SoccerPlayer jack = new SoccerPlayer("Jack");
        FootballPlayer foot = new FootballPlayer("Ronaldo");

        Team<FootballPlayer> manU = new Team<>("Manchester United");
        Team<FootballPlayer> chel = new Team<>("Chelsea");
        Team<FootballPlayer> lipool = new Team<>("Liverpool");
        Team<BaseballPlayer> wings = new Team("South Club");

        manU.addPlayer(foot);
        wings.addPlayer(pat);
        System.out.println(manU.numPlayers());

        manU.matchResult(chel, 3, 2);
        manU.matchResult(lipool, 1, 4);
//        manU.matchResult(wings, 0,5);
    }
}
