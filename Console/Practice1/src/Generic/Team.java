package Generic;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    // using extends -> enables java to know what type is so no casting is needed
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName());
//            System.out.println(((Player)player).getName());
            return  false;
        } else {
            members.add(player);
            System.out.println(player.getName() + "added to " + name);
//            System.out.println(((Player)player).getName() + "added to " + name);
            return true;
        }
    }

    public int players() {
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }
        played++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (ranking() > team.ranking()) {
            return -1;
        } else if (ranking() < team.ranking()) {
            return 1;
        }
        return 0;
    }
}
