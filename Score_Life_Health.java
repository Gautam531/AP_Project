package com.mygdx.game.Scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class Score_Life_Health  {
    public Stage stage;
    private Viewport viewport;
    private Integer Health1,Health2;
    private Byte Fuel;
    private Integer Coins1,Coins2;


    Label CoinsLabel1;
    Label coinsLabel1,coinsLabel2;
    Label CoinsLabel2;
    Label HealthLabel1,HealthLabel2;
    Label healthLabel1,healthLabel2;
    Label FuelLabel;
    Label fuelLabel;



    public Score_Life_Health(SpriteBatch batch){
        Fuel = 100;
        Coins1 =0;
        Coins2 = 0;
        Health1 = 100;
        Health2 = 100;
        viewport = new FitViewport(800,480,new OrthographicCamera());
        stage = new Stage(viewport,batch);


        Table table = new Table();
        table.top();
        table.setFillParent(true);

        HealthLabel1 = new Label(String.format("%03d",Health1),new Label.LabelStyle(new BitmapFont(), Color.BLACK));
        HealthLabel2 = new Label(String.format("%03d",Health2),new Label.LabelStyle(new BitmapFont(), Color.BLACK));
        FuelLabel = new Label(String.format("%03d",Fuel),new Label.LabelStyle(new BitmapFont(), Color.BLACK));
        CoinsLabel1 = new Label(String.format("%06d",Coins1), new Label.LabelStyle(new BitmapFont(),Color.BLACK));
        CoinsLabel2 = new Label(String.format("%06d",Coins2), new Label.LabelStyle(new BitmapFont(),Color.BLACK));
        healthLabel1 = new Label("Health",new Label.LabelStyle(new BitmapFont(),Color.BLUE));
        healthLabel2 = new Label("Health",new Label.LabelStyle(new BitmapFont(),Color.BLUE));
        fuelLabel = new Label("Fuel",new Label.LabelStyle(new BitmapFont(),Color.GREEN));
        coinsLabel1 = new Label("Coins",new Label.LabelStyle(new BitmapFont(),Color.GOLDENROD));
        coinsLabel2 = new Label("Coins",new Label.LabelStyle(new BitmapFont(),Color.GOLDENROD));


        table.add(coinsLabel1).expandX().padTop(0);
        table.add(healthLabel1).expandX().padTop(0);
        table.add(healthLabel2).expandX().padTop(0);
        table.add(coinsLabel2).expandX().padTop(0);
        table.row();
        table.add(CoinsLabel1).expandX().padTop(0);
        table.add(HealthLabel1).expandX().padTop(0);
        table.add(HealthLabel2).expandX().padTop(0);
        table.add(CoinsLabel2).expandX().padTop(0);


        stage.addActor(table);
    }
}
