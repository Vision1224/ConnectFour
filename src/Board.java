public class Board {
	private int columns;
	private int rows;
	public Board(int rows, int columns){
		this.columns=columns;
		this.rows=rows;
	}
	public char[][] CreateBoard(){
		char board [][]=new char[rows][columns];
		for(int i=0; i<board.length;i++){
			for(int j=0;j<board.length;j++){
				board[i][j]=' ';
			}
		}
		printBoard(board);
		return board;
	}
	public void count(char board[][]){
		int rows= board.length;
		int columns=board[0].length;
		System.out.println("This is the number of rows:" + rows + "This is the number of columns:" + columns);
	}
	public void printBoard(char board[][]){
		for(int i=0;i<board.length;i++){
			System.out.println("");
			for(int j=0;j<board.length;j++){
				System.out.print(board[i][j] + "|");
			}
		}
	}
	public void insert(int column, char token, char board[][]){
		int openRow= findOpenRow(board,column);
		board[openRow][column]=token;
		printBoard(board);
	}
	
	public int findOpenRow(char board[][], int column){
		for(int i=board.length-1; i>-1; i-- ){
			if(board[i][column]== ' '){
				return i;
			}
		}
		return -1;
	}
	
}
