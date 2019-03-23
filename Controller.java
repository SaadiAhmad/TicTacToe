package game;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.WindowConstants;

public class Controller {
	
	private Board board;
	private Model model;
	
	public Controller(Board b, Model m) {
		board = b;
		model = m;
		
		// Setting event listeners for all nine squares
		board.addMoveListener(board.getBtn1(), new MoveListener(0, 0, board.getBtn1()));
		board.addMoveListener(board.getBtn2(), new MoveListener(0, 1, board.getBtn2()));
		board.addMoveListener(board.getBtn3(), new MoveListener(0, 2, board.getBtn3()));
		board.addMoveListener(board.getBtn4(), new MoveListener(1, 0, board.getBtn4()));
		board.addMoveListener(board.getBtn5(), new MoveListener(1, 1, board.getBtn5()));
		board.addMoveListener(board.getBtn6(), new MoveListener(1, 2, board.getBtn6()));
		board.addMoveListener(board.getBtn7(), new MoveListener(2, 0, board.getBtn7()));
		board.addMoveListener(board.getBtn8(), new MoveListener(2, 1, board.getBtn8()));
		board.addMoveListener(board.getBtn9(), new MoveListener(2, 2, board.getBtn9()));
	}
	
	class MoveListener implements ActionListener{

		int i, j;
		JButton btn;
		
		MoveListener(int x, int y, JButton b){
			i = x;
			j = y;
			btn = b;
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(btn.isEnabled()) {
				btn.setEnabled(false);
				btn.setText(model.getSign());
				model.move(i, j);
				
				int result = model.finished;
				if(result != -1) {
					board.endGame(Integer.toString(model.finished));
					model.reset();
				}
			}
		}
	}
}
