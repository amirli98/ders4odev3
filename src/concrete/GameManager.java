package concrete;


import _abstract.GameService;
import entities.Game;

public class GameManager implements GameService {

    @Override
    public void download(Game game) {
        game.setDownloadCount(game.getDownloadCount()+1);
    }
}
