package com.mp.pacman.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class TextureFactory {
	
	private static TextureFactory _instance = new TextureFactory();
	private Texture _pacman;
	private Texture _block;
	
	private TextureFactory(){
		_pacman = new Texture(Gdx.files.internal("data/pacmanLeft.png"));
		_block = new Texture(Gdx.files.internal("data/bloc.png"));
	}
	
	public static TextureFactory getInstance(){
		return _instance;
	}
	
	public Texture getTexturePacman(){
		return _pacman;
	}
	
	public Texture getTextureBlock(){
		return _block;
	}
	
}
