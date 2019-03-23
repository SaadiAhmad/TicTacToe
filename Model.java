package game;

public class Model {
	
	int[][] marks = new int[3][3];
	int currentPlayer;
	int finished;

	Model(){
		currentPlayer = 1;
		finished = -1;
		init();
	}
	
	public void move(int i, int j) {
		marks[i][j] = currentPlayer;
		if(checkRow(i) || checkColumn(j) || checkDiagonals())
			finished = currentPlayer;
		else if(isDraw())
			finished = 3;
		else
			nextPlayer();
	}	
	private boolean checkRow(int r) {
		for(int j = 0; j < 3; j++)
			if(marks[r][j] != currentPlayer)
				return false;
		
		return true;
	}
	private boolean checkColumn(int c) {
		for(int i = 0; i < 3; i++)
			if(marks[i][c] != currentPlayer)
				return false;
		
		return true;
	}
	private boolean checkDiagonals() {
		return firstDiagonal() || secondDiagonal();
	}
	private boolean firstDiagonal() {
			for(int i = 0; i < 3; i++)
				if(marks[i][i] != currentPlayer)
					return false;
			
			return true;
	}
	private boolean secondDiagonal() {
		int j = 2;
		for(int i = 0; i < 3; i++){
			if(marks[i][j] != currentPlayer)
				return false;
			
			j--;
		}
		
		return true;
	}
	public String getSign() {
		if(currentPlayer == 1)
			return "X";
		
		return "O";
	}
	private void nextPlayer() {
		if(currentPlayer == 1)
			currentPlayer = 2;
		else
			currentPlayer = 1;
	}
	private void init() {
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				marks[i][j] = 0;
	}
	public void reset() {
		init();
		currentPlayer = 1;
		finished = -1;
	}
	private boolean isDraw() {
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				if(marks[i][j] == 0)
					return false;
		
		return true;
	}
}
