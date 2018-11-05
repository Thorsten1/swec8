package com.github.lhrb.myshooter.states;

import java.util.HashMap;

public class GameStates {

    HashMap<String,State> gameStates = new HashMap();
    private String current;

    public GameStates() {
        gameStates.put("MainMenu", new MainMenu());
        gameStates.put("GameSingle", new GameSingle());
        gameStates.put("PauseMenu", new PauseMenu());
        current = "MainMenu";
    }

    public void setState(String state){
        this.current = state;
    }

    public void stateRender() { gameStates.get(current).stateRender(); }
    public void stateEnter() { gameStates.get(current).stateEnter(); }
    public void stateExit() { gameStates.get(current).stateExit(); }

}
