package generics.exercise;

public class Main {

    public static void main(String[] args) {
        LeagueTable<Team<FootballPlayer>> footballLeague = new LeagueTable<>("AFL");
        Team<FootballPlayer> chivas = new Team<>("Chivas");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> banks = new Team<>("Gordon");
        Team<FootballPlayer> hawthrn = new Team<>("Hawthorn");
        Team<FootballPlayer> freamantle = new Team<>("Fremantle");

        hawthrn.matchResult(freamantle,1,0);
        hawthrn.matchResult(chivas,3,8);
        chivas.matchResult(freamantle,2,1);

        footballLeague.addPlayer(chivas);
        footballLeague.addPlayer(melbourne);
        footballLeague.addPlayer(banks);
        footballLeague.addPlayer(hawthrn);
        footballLeague.addPlayer(freamantle);

        footballLeague.showLeagueTable();
    }
}
