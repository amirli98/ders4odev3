package entities;

import _abstract.Entity;

public class Player implements Entity {
    private Integer id;
    private String firstName;
    private String lastName;
    private int birthYear;
    private String tcKN;
    private Game[] games;

    public Player() {
    }

    public Player(int id, String firstName, String lastName, int birthYear, String tcKN) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.tcKN = tcKN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        //eger idsi varsa idsi set edilemesin.
        if(this.id == null )
            this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getTcKN() {
        return tcKN;
    }

    public void setTcKN(String tcKN) {
        if (this.tcKN != null) {
            return;
        }
        this.tcKN = tcKN;
    }

    public Game[] getGames() {
        return games;
    }
    public void setGames(Game[] games) {
        this.games = games;
    }

    @Override
    public String toString(){return firstName + " "+lastName;}
}
