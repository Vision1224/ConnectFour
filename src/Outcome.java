
public class Outcome {
	public boolean winner(char board[][]){
		if(checkVertically(board)== true){
			return checkVertically(board);
		}
		else if(checkHorizontally(board)==true){
			return checkHorizontally(board);
		}
		else if(checkDiagonally(board)==true){
			return checkDiagonally(board);
		}
		
		
		return false;
	}
	public boolean checkDiagonally(char board[][]){
		int countX=0;
		int countO=0;
		boolean player1Winner=false, player2Winner=false;
		 for(int i=0,j=board[0].length; i<board.length; i++,j--){
	         if (board[i][j] =='x') { 
	             countO=0;
	             countX++;
	             if(countX==4){
	            	 System.out.println("You are the winner player1");
	            	 player1Winner=true;
					return player1Winner;
	             }
	         }
	         else if(board[i][j] == 'o'){
					countX=0;
					countO++;
					if(countO == 4){
						System.out.println("You are the winner player2");
						player2Winner=true;
						return player2Winner;
					}
				}
	     }
		 return false;
	}
	public boolean checkVertically(char board[][]){
		int countX;
		int countO;
		boolean player1Winner=false, player2Winner=false;
		//System.out.println("I'm working");
		for(int j=0;j<board[0].length;j++){
			countX=0;
			countO=0;
			for(int i=board.length-1;i>-1;i--){
				if(board[i][j] == 'x'){
					countO=0;
					countX++;
					if(countX == 4){
						System.out.println("You are the winner player1");
						player1Winner=true;
						return player1Winner;
					}
				}
				else if(board[i][j] == 'o'){
					countX=0;
					countO++;
					if(countO == 4){
						System.out.println("You are the winner player2");
						player2Winner=true;
						return player2Winner;
					}
				}
			}
		}
		return false;
	}
	public boolean checkHorizontally(char board[][]){
		int countX;
		int countO;
		System.out.println("I'm working");
		boolean player1Winner=false, player2Winner=false;
		for(int i=0;i<board.length;i++){
			countX=0;
			countO=0;
			for(int j=0;j<board[0].length;j++){
				if(board[i][j] == 'x'){
					countO=0;
					countX++;
					if(countX == 4){
						System.out.println("You are the winner player1");
						player1Winner=true;
						return player1Winner;
					}
				}
				else if(board[i][j] == 'o'){
					countX=0;
					countO++;
					if(countO == 4){
						System.out.println("You are the winner player2");
						player2Winner=true;
						return player2Winner;
					}
				}
			}
		}
		return false;
	}


}
