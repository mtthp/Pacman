package com.mp.pacman.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.mp.pacman.view.TextureFactory;

public class Block extends GameElement{
	private static float SIZE;
	
	public Block(Vector2 v){
		super(v, null);
	}
	
	public Texture getTexture(){
		return TextureFactory.getInstance().getTextureBlock();
	}
	
	public float getWidth(){
		return 0;
	}
	
	public float getHeidth(){
		return 0;
	}
}
