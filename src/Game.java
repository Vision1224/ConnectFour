import java.io.*;
import java.util.*;

public class Game {
	static boolean game=true;
	public static void main(String[]args){
		Board board = new Board(6,7);
		//board.CreateBoard();
		startGame(board);


	}
	public static void startGame(Board board){
		char [][] gameBoard = board.CreateBoard();
		Outcome decision = new Outcome();
		int countUser1moves=0;
		int countUser2moves=0;
		while(game){
			Scanner input = new Scanner(System.in);
			try{
				System.out.println("");
				char user1='x';
				char user2='o';
				System.out.println("Please enter column numbered 1-7");
				int userColumn = input.nextInt();
				System.out.println(userColumn);
				board.insert(userColumn, user1, gameBoard);
				countUser1moves++;
				System.out.println("Please enter a column numbered 1-7 player2");
				int player2Column = input.nextInt();
				board.insert(player2Column, user2, gameBoard);
				countUser2moves++;
				if(countUser1moves >= 4 && countUser2moves >= 4){
					if(decision.winner(gameBoard)== true){
						break;
					}
				}
			}catch(Exception e){
				System.out.println("Please put in a number");
			}


		}
	}

}
