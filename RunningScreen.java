package com.mygdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.Scenes.Score_Life_Health;
import com.mygdx.game.TankShark;

public class RunningScreen implements Screen {
    private TankShark game;
    private OrthographicCamera gamecam;
    private Viewport gameport;
    private Score_Life_Health StaticScreen;
//    private TmxMapLoader mapLoader;
//    private TiledMap map;
//    private OrthogonalTiledMapRenderer renderer;
//    private World world;
//    private Box2DDebugRenderer b2dr;
    public RunningScreen(TankShark game){
        this.game = game;

//        gamecam = new OrthographicCamera();

//        gameport = new FitViewport(800,480,gamecam);
        StaticScreen = new Score_Life_Health(game.batch);    //to display score life and health
//        mapLoader = new TmxMapLoader();
//        map = mapLoader.load("level.tmx");
//        renderer = new OrthogonalTiledMapRenderer(map,1/16f);
//        gamecam.position.set(gameport.getWorldWidth() / 2,gameport.getWorldWidth()/2, 0);
//        world = new World(new Vector2(0,0),true);
//        b2dr = new Box2DDebugRenderer();
    }

    @Override
    public void show() {

    }
//    public void handleInput(float delta){
//        if(Gdx.input.isTouched()){
//            gamecam.position.x += 100*delta;}
//    }
//    public void update(float delta){
//        handleInput(delta);
//        gamecam.update();
//        renderer.setView(gamecam);
//    }

    @Override
    public void render(float delta) {
//        update(delta);
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        renderer.render();
        game.batch.setProjectionMatrix(StaticScreen.stage.getCamera().combined);
        StaticScreen.stage.draw();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
