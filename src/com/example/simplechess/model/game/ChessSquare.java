package com.example.simplechess.model.game;

import com.example.simplechess.model.piece.ChessPiece;


public class ChessSquare {
	public boolean isOccupied;
	public ChessPiece piece;
	public GameColor color;
	
	public ChessSquare(GameColor color) {
		isOccupied = false;
		this.color = color;
	}
	
	public void setIsOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	
	public void setGamePiece(ChessPiece piece) {
		this.piece = piece;
		setIsOccupied(true);
	}
	
	public ChessPiece getChessPiece() {
		return piece;
	}
	
	public GameColor getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		if(piece == null) {
			return super.toString();
		}
		return piece.getName() + " " + piece.getColor() + " occupied: " + isOccupied;
	}
	
}
