package generics.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class  LeagueTable <T extends Team> {

    private String nameTeam;

    private int position;

    private List <T> league = new ArrayList<>();

    public LeagueTable(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public boolean addPlayer(T team){
        if (league.contains(team)){
            return false;
        } else {
            league.add(team);
            return true;
        }
    }
    public void showLeagueTable(){
        Collections.sort(league);
        for (T t: league){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

}
