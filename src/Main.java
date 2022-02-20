import java.util.Scanner;

public class Main {
	public static boolean gameStatus = false;
	static GameBoard board;
	public Player player1;
	public Player player2;
	public Scanner scanner;
	
	public static void main(String[] args) {
        System.out.println("Hello, World!");
        board = new GameBoard();
        gameStatus = true;
        board.setUpClassicBoard();
        board.printBoard();
        
        while(gameStatus) {
        	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Select move to do");

            String command = myObj.nextLine();  // Read user input
            if(command.equals("Quit")){
            	break;
            }
        }
    }
}
