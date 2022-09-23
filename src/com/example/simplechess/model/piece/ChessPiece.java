package com.example.simplechess.model.piece;

import com.example.simplechess.model.game.GameColor;


public abstract class ChessPiece {
	protected boolean isAlive;
	protected boolean hasBeenMoved;
	protected GameColor color;
	abstract void move();
	abstract public String getName();
	abstract void attack();
	public abstract String getColor();
}
