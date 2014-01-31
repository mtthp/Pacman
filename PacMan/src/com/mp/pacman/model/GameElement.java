package com.mp.pacman.model;

import com.badlogic.gdx.math.*;
import com.badlogic.gdx.graphics.Texture;

public abstract class GameElement{
	private Vector2 position;
	private World w; //pointeur sur le monde
	
	public GameElement(Vector2 v, World w){
		position = v;
	}
	
	public Vector2 getPosition(){
		return position;
	}
	
	public abstract float getWidth();
	
	public abstract float getHeidth();
	
	public abstract Texture getTexture();

}
