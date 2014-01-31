package com.mp.pacman.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.mp.pacman.view.TextureFactory;

public class Ghost extends GameElement {
	private static float SIZE;
	
	public Ghost(Vector2 v, World w){
		super(v, w);
	}
	
	public Texture getTexture(){
		return null;//TextureFactory.getInstance().getTextureGhost();
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
