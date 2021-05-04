package concrete;

import _abstract.PlayerService;
import entities.Game;
import entities.Player;

import java.util.Arrays;

public class PlayerManager implements PlayerService {


    @Override
    public boolean dogrula(Player player) {
        if(player.getTcKN().length() != 11){
            System.out.println("Oyuncu dogrulanamadi");
            return false;
        }return true;
    }

    @Override
    public void addGames(Player player, Game[] games) {
        for(Game game:games){
            game.download();
        };
        player.setGames(games);
        System.out.println(player.getFirstName()+ " " + Arrays.toString(games)+" oyunlarini aldi");
    }
}
