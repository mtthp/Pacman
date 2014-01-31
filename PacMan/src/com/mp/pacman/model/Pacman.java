package com.mp.pacman.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.*;
import com.mp.pacman.view.TextureFactory;

public class Pacman extends GameElement{
	private static float SIZE;
	
	public Pacman(Vector2 v, World w){
		super(v, w);
	}
	
	public Texture getTexture(){
		return TextureFactory.getInstance().getTexturePacman();
	}
	
	public float getWidth(){
		return 0;
	}
	
	public float getHeidth(){
		return 0;
	}
	
	public void update(float f){
		
	}
}
