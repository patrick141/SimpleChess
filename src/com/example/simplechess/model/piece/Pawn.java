package com.example.simplechess.model.piece;

import com.example.simplechess.model.game.GameColor;


public class Pawn extends ChessPiece {
	boolean isOnFirstTurn;
	
	public Pawn(GameColor color) {
		isAlive = true;
		this.color = color;
		isOnFirstTurn = true;
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		isOnFirstTurn = false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Pawn";
	}

	@Override
	void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "";
	}
}
