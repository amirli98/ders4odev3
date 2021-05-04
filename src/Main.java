import _abstract.CampaignService;
import _abstract.GameService;
import _abstract.PlayerService;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.PlayerManager;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		CampaignService campaignService = new CampaignManager();
		GameService gameService = new GameManager();
		PlayerService playerService = new PlayerManager();
		Campaign campaign = new Campaign("BIZ GROUP");
		Game game1 = new Game("PRO GAME", 34);
		Game game2 = new Game("Beginner Game", 23);
		Game[] games = new Game[]{game1, game2};
		Player player = new Player(1, "Faik", "Tastan",1994,"12322234565");
		campaignService.addGames(games,campaign);
		gameService.download(game1);
		playerService.addGames(player, new Game[]{game2});
		playerService.dogrula(player);

	}

}
