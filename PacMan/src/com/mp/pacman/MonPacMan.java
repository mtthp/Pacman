package com.mp.pacman;

import com.mp.pacman.model.*;
import com.mp.pacman.view.*;
import com.mp.pacman.screens.*;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class MonPacMan implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;
	private Sprite sprite;
	
	private Pacman _pacman;
	private Block _block;
	
	private GameElement[][] _game = new GameElement[10][5];

	public MonPacMan(){
		this._pacman = new Pacman(new Vector2(200, 200), null);
		this._block = new Block(new Vector2(120, 120));
		
		
	}
	
	@Override
	public void create() {
		float w = Gdx.graphics.getWidth();		
		float h = Gdx.graphics.getHeight();
		
		//camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		
//		texture = new Texture(Gdx.files.internal("data/pacmanLeft.png"));
//		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
//		
//		//TextureRegion region = new TextureRegion(texture, 0, 0, 0, 0);
//		
//		sprite = new Sprite(TextureFactory.getInstance().getTexturePacman());
//		sprite.setSize(0.1f, 0.1f * sprite.getHeight() / sprite.getWidth());
//		sprite.setOrigin(sprite.getHeight()/2, sprite.getWidth()/2);
//		sprite.setPosition(0.5f, 0.5f);
//		
//		Gdx.app.log("Info", "Coucou !");
		
		//World world = new World();
		
		//Block b = new Block(new Vector2(1,1));
		
		//batch.draw(TextureFactory.getInstance().getTexturePacman(), 0, 0);
		//batch.draw(TextureFactory.getInstance().getTextureBloc(), 100, 100);
	}

	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void render() {
	   
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		//batch.setProjectionMatrix(camera.combined);
		
		batch.begin();
		//sprite.draw(batch);
	
		
		batch.draw(this._pacman.getTexture(), _pacman.getPosition().x, _pacman.getPosition().y);
		batch.draw(this._block.getTexture(), _block.getPosition().x, _block.getPosition().y);
		
		batch.end();
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
}
