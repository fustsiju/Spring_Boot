package com.curso.ecommerce.service.ecommerce;

import com.curso.ecommerce.domain.game.Games;
import org.springframework.stereotype.Service;

@Service
public class EcommerceService {

    public Games getGameByName(String name){
        return new Games();
    }

    public void createGames(Games createGames){

    }

    public String deleteGames(Games deleteGames) {
        if(deleteGames.getName() == null || deleteGames.getName().isEmpty()){
            return "All games deleted";
        }

        return "Game " + deleteGames.getName() + " deleted!";
    }
    public Games updateGames(Games updatedGames) {
        Games games = new Games();
        games.setName("GTA V");
        games.setMetacritic(97);
        games.setRecommendation(92734);
        games.setPrice(39.99f);

        if(games.getName() != null)
            updatedGames.setName(games.getName());
        if(games.getMetacritic() != null)
            updatedGames.setMetacritic(games.getMetacritic());
        if(games.getRecommendation() != null)
            updatedGames.setRecommendation(games.getRecommendation());
        if(games.getPrice() != 0)
            updatedGames.setPrice(games.getPrice());


        return updatedGames;

    }
}
