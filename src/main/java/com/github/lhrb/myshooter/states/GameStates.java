package com.github.lhrb.myshooter.states;

public class GameStates {
    private State[] states = { new PauseMenu(), new MainMenu(), new GameSingle() };
    private int current = 0;

    public void setState(int state){
        this.current = state;
    }

    public void stateRender(){
        states[current].stateRender();
    }
    void stateEnter(){
        states[current].stateRender();
    }
    void stateExit(){
        states[current].stateRender();
    }
}
