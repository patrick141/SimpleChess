package com.example.simplechess.model.piece;

import com.example.simplechess.model.game.GameColor;


public class Bishop extends ChessPiece{
	
	public Bishop(GameColor color) {
		isAlive = true;
		this.color = color;
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Bishop";
	}

	@Override
	void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return null;
	}

}
