package com.thymeleafexample;

import java.util.List;

public class GameContainer {
    private List<Game> games;

    public void addGame(Game game){
        games.add(game);
    }

    public List<Game> getGames(){
        return games;
    }

    public GameContainer(){
        games.add(new Game("BeeTheWarrior"));
    }
}
