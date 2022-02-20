

public abstract class ChessPiece {
	protected boolean isAlive;
	protected boolean hasBeenMoved;
	protected GameColor color;
	abstract void move();
	abstract String getName();
	abstract void attack();
	abstract String getColor();
}
