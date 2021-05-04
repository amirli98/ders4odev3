package _abstract;

import entities.Campaign;
import entities.Game;

public interface CampaignService {
    void addGames(Game[] games, Campaign to);
    void updateGames(Game[] games, Campaign in);
    void deleteGames(Game[] games, Campaign from);
}
