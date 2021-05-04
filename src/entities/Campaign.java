package entities;

import _abstract.Entity;

public class Campaign implements Entity {
    private Game[] games;
    private String name;

    public Campaign(String name) {
        this.name = name;
    }
    public Campaign(){};

    public Game[] getGames() {
        return games;
    }

    public void setGames(Game[] games) {
        this.games = games;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){return name;}
}
