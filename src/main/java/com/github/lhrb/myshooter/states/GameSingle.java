package com.github.lhrb.myshooter.states;

import org.lwjgl.opengl.GL11;

public class GameSingle implements State {
    @Override
    public void stateRender(){
        GL11.glColor3f(0f, 1.0f, 1.0f);
        GL11.glRectf(0,0,650,480);
    }
    @Override
    public void stateEnter(){

    }
    @Override
    public void stateExit(){

    }
}
