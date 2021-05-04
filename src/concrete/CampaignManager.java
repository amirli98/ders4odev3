package concrete;

import _abstract.CampaignService;
import entities.Campaign;
import entities.Game;

import java.util.Arrays;

public class CampaignManager implements CampaignService {

    @Override
    public void addGames(Game[] games, Campaign cmp) {
        System.out.println(cmp.toString()+"e "+"oyunlar eklendi : "+ Arrays.toString(games));
    }

    @Override
    public void updateGames(Game[] games, Campaign cmp) {
        System.out.println(cmp.toString()+"deki "+"oyunlar yenilendi : " + Arrays.toString(games));
    }

    @Override
    public void deleteGames(Game[] games, Campaign campaign) {
        System.out.println(campaign.toString()+"deki "+"oyunlar silindi : " + Arrays.toString(games));
    }
}
