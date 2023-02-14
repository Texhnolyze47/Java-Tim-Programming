package generics;

public class MainPlayer {

    public static void main(String[] args) {
        FootballPlayer jeo = new FootballPlayer("Jeo");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beck = new SoccerPlayer("Beck");

        Team<FootballPlayer> chivas = new Team<>("Chivas");
        chivas.addPlayer(jeo);
        //chivas.addPlayer(pat);
        //chivas.addPlayer(beck);

        System.out.println(chivas.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("chicago");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beck);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthrn = new Team<>("Hawthorn");
        Team<FootballPlayer> freamantle = new Team<>("Fremantle");

        hawthrn.matchResult(freamantle,1,0);
        hawthrn.matchResult(chivas,3,8);

        chivas.matchResult(freamantle,2,1);
//        chivas.matchResult(baseballTeam,2,1);

        System.out.println("Rankings");
        System.out.println(chivas.getName() + ": " + chivas.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(freamantle.getName() + ": " + freamantle.ranking());
        System.out.println(hawthrn.getName() + ": " + hawthrn.ranking());

        System.out.println(chivas.compareTo(melbourne));
        System.out.println(chivas.compareTo(hawthrn));


        System.out.println(hawthrn.compareTo(chivas));
        System.out.println(melbourne.compareTo(freamantle));
    }
}
