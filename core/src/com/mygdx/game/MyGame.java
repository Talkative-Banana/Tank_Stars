package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.Load_Save;

import sun.security.krb5.internal.crypto.Des;
import javax.swing.*;

public class MyGame extends ApplicationAdapter implements InputProcessor {
	private SpriteBatch batch;

	private Basic basic;
	private Texture img, Img, InGame, Terrain;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("./Pictures/Background_Image.png");
		Img = new Texture("./Pictures/New_Game_Image_BG.png");
		InGame = new Texture("./Pictures/In_Game_BG.png");
		Terrain = new Texture("./Pictures/Terrain.jpeg");
		Gdx.input.setInputProcessor(this);


	}
	public MyGame(Basic basic) {
		this.basic = basic;
	}

	public Basic getBasic() {
		return basic;
	}

	public void setBasic(Basic basic) {
		this.basic = basic;
	}
	@Override
	public void render () {

		batch.begin();
		Resume_Game();
//		Main_page();
//		New_Game();
//		In_game();
//		In_game_menu();
//		Resume_Game();
		batch.end();
	}

	public void screen(int val){
		if(val == 0){
			Main_page();
		} else if (val == 1) {
			New_Game();
		}
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
	public void Main_page(){
		Texture New_Game_Image;
		Sprite New_Game;
		Texture Resume_Game_Image;
		Sprite Resume_Game;
		Texture Exit_Game_Image;
		Sprite Exit_game;
		New_Game_Image = new Texture("./Pictures/New_Game_Image.png");
		Resume_Game_Image = new Texture("./Pictures/Resume_Game_Image.png");
		Exit_Game_Image = new Texture("./Pictures/Exit_Game_Image.png");

		New_Game = new Sprite(New_Game_Image);
		Resume_Game = new Sprite(Resume_Game_Image);
		Exit_game = new Sprite(Exit_Game_Image);
		batch.draw(img, -60, -20,750,550);
		New_Game.setPosition(100,75);
		New_Game.setSize(100,50);

		New_Game.draw(batch);
		Resume_Game.setPosition(250,75);
		Resume_Game.setSize(100,50);
		Resume_Game.draw(batch);

		Exit_game.setPosition(400,75);
		Exit_game.setSize(100,50);
		Exit_game.draw(batch);

	}

	public void New_Game(){
		batch.draw(Img, -60, -20,750,550);
		Select_Player_1();
//		Select_Player_2();

	}

	public void Resume_Game(){
//		Load_Save loading = new Load_Save();

		Player p1 = Load_Save.load("./Saved_Files/PLAYER_1_SAVED_DATA.txt");
		Player p2 = Load_Save.load("./Saved_Files/PLAYER_2_SAVED_DATA.txt");

		Basic basic2 = new Basic(p1.getName(),p2.getName(),0, 1);
		ScreenUtils.clear(0,0 ,0 , 1);
		Texture img;
		img = new Texture("./Pictures/Saved_Games.png");
		batch.draw(img, 0, 0,650,510);
	}

	public void Exit(){

		System.exit(0);
	}
	public void PauseGame(){
		Load_Save.save("./Saved_Files/PLAYER_1_SAVED_DATA.txt", basic.getP1());
		Load_Save.save("./Saved_Files/PLAYER_2_SAVED_DATA.txt",basic.getP2());
	}
	public void In_game_menu(){
		ScreenUtils.clear(0,0 ,1, 1);
		Texture options;
		options = new Texture("./Pictures/Main_Menu.png");
		batch.draw(options,0,0,550,210);

	}

	public void Select_Player_1(){
//		ScreenUtils.clear(0,0 , 0, 0);
		Texture Tank_1;
		Texture Tank_2;
		Texture Tank_3;
		Texture P1;


		Tank_1 = new Texture("./Tanks/Rocket.png");
		Tank_2 = new Texture("./Tanks/Siedge.png");
		Tank_3 = new Texture("./Tanks/Coalition_bow_up.png");
		Sprite Rocket = new Sprite(Tank_1);
		Sprite Seidge = new Sprite(Tank_2);
		Sprite Coalition = new Sprite(Tank_3);

		Coalition.setPosition(75,155);
		Coalition.setSize(150,150);
		Coalition.draw(batch);

		Seidge.setPosition(250,155);
		Seidge.setSize(150,150);
		Seidge.draw(batch);

		Rocket.setPosition(425,150);
		Rocket.setSize(150,150);
		Rocket.draw(batch);


		P1 = new Texture("./Pictures/Player1.png");
//		P2 = new Texture("./Pictures/Player2.png");
//		batch.draw(Tank_1, 50, 250,120,180);
//		batch.draw(Tank_2, 250, 300,120,100);
//		batch.draw(Tank_3, 450, 300,120,90);
//		batch.draw(Tank_1, 50, 50,120,180);
//		batch.draw(Tank_2, 250, 100,120,100);
//		batch.draw(Tank_3, 450, 100,120,90);
		batch.draw(P1, 250, 350,120,90);
//		batch.draw(P2, 250, 200,120,90);

	}
	public void Select_Player_2(){
//		ScreenUtils.clear(0,0 , 0, 0);
		Texture Tank_1;
		Texture Tank_2;
		Texture Tank_3;
		Texture P2;

//		batch.draw(Img, -60, -20,750,550);
		Tank_1 = new Texture("./Tanks/Rocket.png");
		Tank_2 = new Texture("./Tanks/Siedge.png");
		Tank_3 = new Texture("./Tanks/Coalition_bow_up.png");
		Sprite Rocket = new Sprite(Tank_1);
		Sprite Seidge = new Sprite(Tank_2);
		Sprite Coalition = new Sprite(Tank_3);

		Coalition.setPosition(75,150);
		Coalition.setSize(150,150);
		Coalition.draw(batch);

		Seidge.setPosition(250,150);
		Seidge.setSize(150,150);
		Seidge.draw(batch);

		Rocket.setPosition(425,150);
		Rocket.setSize(150,150);
		Rocket.draw(batch);


//		P1 = new Texture("./Pictures/Player1.png");
		P2 = new Texture("./Pictures/Player2.png");
//		batch.draw(Tank_1, 50, 250,120,180);
//		batch.draw(Tank_2, 250, 300,120,100);
//		batch.draw(Tank_3, 450, 300,120,90);
//		batch.draw(Tank_1, 50, 50,120,180);
//		batch.draw(Tank_2, 250, 100,120,100);
//		batch.draw(Tank_3, 450, 100,120,90);
//		batch.draw(P1, 250, 400,120,90);
		batch.draw(P2, 250, 350,120,90);
	}

	public void In_game(){
		batch.draw(InGame, -60, -20,750,550);
		batch.draw(Terrain,0,0,700,100);

		Sprite Tank_1;
		Sprite Tank_2;
		Sprite Pause;
		Tank_1 = new Sprite(new Texture("./Tanks/Rocket-removebg-preview.png"));
		Tank_2 = new Sprite(new Texture("./Tanks/Left_Facing_Seidge.png"));

		Texture Health_bar_1 = new Texture("./Pictures/Health_Bar_1.png");
		Texture Health_bar_2 = new Texture("./Pictures/Health_Bar_2.png");

		Texture Weapons_Player_1 = new Texture("./Pictures/Weapons_Player_1.png");
		Texture Weapons_Player_2 = new Texture("./Pictures/Weapons-Player_2.png");

		batch.draw(Health_bar_1,25,400,100,100);
		batch.draw(Health_bar_2,500,400,100,100);

		batch.draw(Weapons_Player_1,25,300,100,100);
		batch.draw(Weapons_Player_2,500,300,100,100);

		Pause = new Sprite(new Texture("./Pictures/Pause_Button.png"));

		Pause.setPosition(295,420);
		Pause.setSize(50,50);
		Pause.draw(batch);

		Tank_1.setPosition(50,100);
		Tank_1.setSize(50,50);
		Tank_1.draw(batch);


		Tank_2.setPosition(500,100);
		Tank_2.setSize(50,50);
		Tank_2.draw(batch);

// code for the health of tanks

	}



	@Override
	public boolean keyDown(int keycode) {
		if(keycode == Input.Keys.N){
			New_Game();
		}
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		return false;
	}
}
