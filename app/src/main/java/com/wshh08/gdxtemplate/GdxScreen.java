package com.wshh08.gdxtemplate;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

/**
 * Created by wshh08 on 15-10-23.
 */
public class GdxScreen implements Screen {
    @Override
    public void show() {}
    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.0f, 0.0f, 1.0f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }
    @Override
    public void resize(int w, int h) {}
    @Override
    public void dispose() {}
    @Override
    public void pause() {}
    @Override
    public void resume() {}
    @Override
    public void hide() {}
}
