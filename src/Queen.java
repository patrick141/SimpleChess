


public class Queen extends ChessPiece{

	public Queen(GameColor gameColor) {
		isAlive = true;
		color = gameColor;
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		hasBeenMoved = true;
		
	}

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "Queen";
	}

	@Override
	void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	String getColor() {
		// TODO Auto-generated method stub
		return null;
	}

}
