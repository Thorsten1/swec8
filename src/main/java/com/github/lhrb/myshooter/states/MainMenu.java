package com.github.lhrb.myshooter.states;

import org.lwjgl.opengl.GL11;

public class MainMenu extends State {

    void stateRender(){
        GL11.glColor3f(1.0f, 0f, 0f);
        GL11.glRectf(0,0,650,480);
    }
    void stateEnter(){

    }
    void stateExit(){

    }
}
