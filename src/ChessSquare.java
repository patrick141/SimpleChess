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
	
}
