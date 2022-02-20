


public class King extends ChessPiece{
	public static final String name = "King";
	
	public King(GameColor gameColor) {
		isAlive = true;
		color = gameColor;
	}

	@Override
	void move()  {
		// TODO Auto-generated method stub	
		hasBeenMoved = true;
	}

	@Override
	String getName() {
		return name;
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
