package generics;

public class Main {
    public static void main(String[] args) {
        BaseballPlayer pat = new BaseballPlayer("Paticen");
        SoccerPlayer jack = new SoccerPlayer("Jack");
        FootballPlayer foot = new FootballPlayer("Ronaldo");

        Team<FootballPlayer> manU = new Team<>("Manchester United");
        Team<FootballPlayer> chel = new Team<>("Chelsea");
        Team<FootballPlayer> lipool = new Team<>("Liverpool");
        Team<BaseballPlayer> wings = new Team<>("South Club");

        manU.addPlayer(foot);
        wings.addPlayer(pat);
        System.out.println(manU.numPlayers());

        manU.matchResult(chel, 3, 2);
        manU.matchResult(lipool, 1, 4);
//        manU.matchResult(wings, 0,5);

        System.out.println("Rankings: ");
        System.out.println(manU.ranking());
        System.out.println(chel.ranking());
        System.out.println(lipool.ranking());
        System.out.println(wings.ranking());

        System.out.println(manU.compareTo(chel));
        System.out.println(chel.compareTo(lipool));
        System.out.println(lipool.compareTo(manU));
    }
}
