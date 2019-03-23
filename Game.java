package game;

import javax.swing.WindowConstants;

public class Game {

	public static void main(String[] args) {
		
		Board board = new Board();
		board.setVisible(true);
		board.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		Model model = new Model();
		
		Controller game = new Controller(board, model);
		
	}

}
