package com.example.simplechess.model.game;

import com.example.simplechess.model.piece.Bishop;
import com.example.simplechess.model.piece.ChessPiece;
import com.example.simplechess.model.piece.Horse;
import com.example.simplechess.model.piece.King;
import com.example.simplechess.model.piece.Pawn;
import com.example.simplechess.model.piece.Queen;
import com.example.simplechess.model.piece.Rook;
import com.example.simplechess.util.GameConstants;

import java.util.ArrayList;


public class GameBoard {
	ArrayList<ChessPiece> whitePieces;
	ArrayList<ChessPiece> blackPieces;
	ChessSquare[][] squares;
	public int numOfPieces = GameConstants.NUMBER_OF_PIECES;
	public int boardLength = GameConstants.CHESSBOARD_LENGTH;
	
	public GameBoard() {
		whitePieces = new ArrayList<ChessPiece>(numOfPieces);
		blackPieces = new ArrayList<ChessPiece>(numOfPieces);
		squares = new ChessSquare[boardLength][boardLength];	
		for(int i = 0; i< boardLength; i++) {
			for(int j = 0; j< boardLength; j++) {
				int temp = i + j;
				ChessSquare chessSquare;
				if(temp %2 == 0) {
					chessSquare = new ChessSquare(GameColor.BLACK);
				} else {
					chessSquare = new ChessSquare(GameColor.WHITE);
				}
				squares[i][j] = chessSquare;
			}
		}
	}
	
	public void setUpClassicBoard() {
		initalizeGamePieceSet(whitePieces, GameColor.WHITE);
		initalizeGamePieceSet(blackPieces, GameColor.BLACK);

		for(int i = 0; i < boardLength; i++) {
			ChessPiece wPiece = whitePieces.get(i);
			ChessPiece bPiece = blackPieces.get(i);
			
			squares[0][i].setGamePiece(wPiece);
			squares[boardLength-1][boardLength-i-1].setGamePiece(bPiece);
		}	
		
		for(int i = boardLength; i < numOfPieces; i++) {
			ChessPiece wPiece = whitePieces.get(i);
			ChessPiece bPiece = blackPieces.get(i);
			
			squares[1][i-8].setGamePiece(wPiece);
			
			squares[boardLength-2][boardLength*2-i-1].setGamePiece(bPiece);
		}	
	}
	
	public void printBoard() {
		for(ChessSquare[] row: squares) {
			String line = "";
			for(ChessSquare square: row) {
				ChessPiece piece = square.getChessPiece();
				if(piece != null) {
					if(piece.getName().equals("Pawn")) {
						line = line + "Pawn  ";
					} else {
						line = line + piece.getName() + " ";
					}
				} else {
					line = line + "_____ ";
				}
			}
			System.out.println(line);
		}
	}
	
	public ChessSquare getSpaceAt(int x, int y) {
		return pointsInRange(x,y) ? squares[x][y]: null;
	}
	
	public int[] findPosition(ChessPiece gPiece) {
		for(int i = 0; i< boardLength; i++) {
			for(int j = 0; j< boardLength; j++) {
				ChessSquare square = squares[i][j];
				if(square != null 
					&& square.getChessPiece() != null
					&& square.getChessPiece().equals(gPiece)) {
					return new int[] {i,j};
				}
			}
		}
		return null;
	}
	
	public int[] findPosition(String sPiece) {
		if(sPiece == null || sPiece.isEmpty()) {
			return null;
		}
		
		for(int i = 0; i< boardLength; i++) {
			for(int j = 0; j< boardLength; j++) {
				ChessSquare square = squares[i][j];
				ChessPiece piece = square.getChessPiece();
				if(piece != null 
					&& piece.getName() != null 
					&& !piece.getName().isEmpty() 
					&& piece.getName().equals(sPiece)) {
					return new int[] {i,j};
				}
			}
		}
		return null;
	}
	
	public boolean pointsInRange(int x, int y) {
		return  !( x < 0 || x >= boardLength || y < 0 || y >= boardLength);
	}
	
	
	public void initalizeGamePieceSet(ArrayList<ChessPiece> gamePieces, GameColor gameColor) {
		gamePieces.clear();
		King king = new King(gameColor);
		Queen queen = new Queen(gameColor);
		Rook leftRook = new Rook(gameColor);
		Rook rightRook = new Rook(gameColor);
		Bishop whiteBishop = new Bishop(gameColor);
		Bishop blackBishop = new Bishop(gameColor);
		Horse leftHorse = new Horse(gameColor);
		Horse rightHorse = new Horse(gameColor);
		gamePieces.add(leftRook);
		gamePieces.add(leftHorse);
		gamePieces.add(blackBishop);
		gamePieces.add(queen);
		gamePieces.add(king);
		gamePieces.add(whiteBishop);
		gamePieces.add(rightHorse);
		gamePieces.add(rightRook);
		for(int i = 0; i < boardLength; i++) {
			gamePieces.add(new Pawn(gameColor));
		}
	}
	
	public String getChessSquareString(int x, int y)
	{
		if(!pointsInRange(x,y))
		{
			 return "ERROR";
		}
		String letter = String.valueOf((char)(x+97));
		String squareName = letter + y;
		return squareName;
	}
}
