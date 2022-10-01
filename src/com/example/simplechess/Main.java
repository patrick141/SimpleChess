package com.example.simplechess;

import com.example.simplechess.model.game.Player;
import com.example.simplechess.model.game.GameBoard;

import java.util.Scanner;

public class Main {
	public static boolean gameStatus = false;
	public static boolean turn = true;
	static GameBoard board;
	public static Player player1 = new Player("Player 1");
	public static Player player2 = new Player("Player 2");
	public static Scanner scanner;
	
	public static void main(String[] args) {
    	System.out.println("Hello, World!");
        board = new GameBoard();
        gameStatus = true;
        board.setUpClassicBoard();
        board.printBoard();
        Player currentPlayer;
        turn = true;
        while(gameStatus) {
        	scanner = new Scanner(System.in); 
        	currentPlayer = turn ? player1: player2;
            System.out.println("Select move to do " + currentPlayer.getName() +",");
            printOptions();
            String command = scanner.nextLine(); 
            switch(command) {
	            case "1": 
	            	board.printBoard();
	            	System.out.println("Decide next move");
	            	System.out.println(board.getSpaceAt(0, 0));
	            	turn = !turn;
	            	break;
	            case "2": 
	            	printHelp();
	            	break;
	            case "3": 
	            	board.printBoard();
	            	break;
	            case "4": 
	            	gameStatus = false;
	            	break;
	            default: 
	            	System.out.println("Do not understand command");
	            	break;
            }
        }
        System.out.println("Game ended");
    }
	
	public static void printOptions()
	{
		System.out.println("1. Make a move");
		System.out.println("2. Help");
		System.out.println("3. Show board");
		System.out.println("4. Quit");
	}
	
	public static void printHelp()
	{
		System.out.println("To play chess, you need to know that pieces have different movesets.");
	}
}
