package _abstract;

import entities.Game;
import entities.Player;

public interface PlayerService {
    boolean dogrula(Player player);
    void addGames(Player player, Game[] games);
}
