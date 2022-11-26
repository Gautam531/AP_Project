package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Screens.RunningScreen;

public class TankShark extends Game {
	public SpriteBatch batch;       //spritebatch holds images, textures and stuff like that
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new RunningScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
