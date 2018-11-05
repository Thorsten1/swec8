package com.github.lhrb.myshooter.states;

import java.util.HashMap;

public class SceneManager {

    HashMap<String,State> gameStates = new HashMap<String, State>();
    private State current;

    public SceneManager() {
        gameStates.put("MainMenu", new MainMenu());
        gameStates.put("GameSingle", new GameSingle());
        gameStates.put("PauseMenu", new PauseMenu());
        current = gameStates.get("MainMenu");
    }

    public void setState(State newState){
        if (newState != null && gameStates.containsKey(newState)){
            current = gameStates.get(newState);
        }
    }

    public void stateRender() { gameStates.get(current).stateRender(); }
    public void stateEnter() { gameStates.get(current).stateEnter(); }
    public void stateExit() { gameStates.get(current).stateExit(); }

}
