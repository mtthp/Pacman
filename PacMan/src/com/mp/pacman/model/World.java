package com.mp.pacman.model;
import java.util.*;

import com.badlogic.gdx.math.Vector2;

public class World implements Iterable<GameElement>{
	private Pacman _pacman;
	private Maze _maze;
	
	public World(){
		_maze = new Maze(this);
		_pacman = new Pacman(new Vector2(this.getHeight()/2, this.getWidth()/2), this);
		
	}
	
	public int getHeight(){
		return _maze.getHeight();
	}
	
	public int getWidth(){
		return _maze.getWidth();
	}
	
	public Maze getMaze(){
		return _maze;
	}
	
	public Pacman getPacman(){
		return _pacman;
	}
	
	@Override
	public Iterator<GameElement> iterator(){
		ArrayList<GameElement> listGameElements = new ArrayList<GameElement>();
		listGameElements.add(_pacman);
		//ajouter les block du labyrinthe
		return listGameElements.iterator();
	}
}
