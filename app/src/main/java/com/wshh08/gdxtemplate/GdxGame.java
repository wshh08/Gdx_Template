package com.wshh08.gdxtemplate;

import com.badlogic.gdx.Game;

/**
 * Created by wshh08 on 15-10-23.
 */
public class GdxGame extends Game {
    @Override
    public void create() {
        setScreen(new GdxScreen());
    }
}
