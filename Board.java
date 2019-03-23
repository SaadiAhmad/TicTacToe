package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// the View part of MVC
public class Board extends JFrame {

	private JPanel contentPane;
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

	/**
	 * Create the frame.
	 */
	public Board() {
		Board b = this;
		
		setTitle("Tic-Tac-Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 329);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGame = new JMenu("Game");
		menuBar.add(mnGame);
		
		JMenuItem mntmNewGame = new JMenuItem("New Game");
		mntmNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resetBoard();
			}
		});
		mnGame.add(mntmNewGame);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b.dispose();
			}
		});
		mnGame.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 102));
		panel.setBounds(5, 5, 422, 243);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		btn1 = new JButton("");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn1.setBackground(new Color(255, 255, 153));
		panel.add(btn1);
		
		btn2 = new JButton("");
		btn2.setBackground(new Color(255, 255, 153));
		panel.add(btn2);
		
		btn3 = new JButton("");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn3.setBackground(new Color(255, 255, 153));
		panel.add(btn3);
		
		btn4 = new JButton("");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn4.setBackground(new Color(255, 255, 153));
		panel.add(btn4);
		
		btn5 = new JButton("");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn5.setBackground(new Color(255, 255, 153));
		panel.add(btn5);
		
		btn6 = new JButton("");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn6.setBackground(new Color(255, 255, 153));
		panel.add(btn6);
		
		btn7 = new JButton("");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn7.setBackground(new Color(255, 255, 153));
		panel.add(btn7);
		
		btn8 = new JButton("");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn8.setBackground(new Color(255, 255, 153));
		panel.add(btn8);
		
		btn9 = new JButton("");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 40));
		btn9.setBackground(new Color(255, 255, 153));
		panel.add(btn9);
	}

	public void addMoveListener(JButton btn, ActionListener listener) {
		btn.addActionListener(listener);
	}

	public void endGame(String winner) {
		int newGame;
		if(!winner.equals("3"))
			newGame = JOptionPane.showConfirmDialog(null, "Do you want to start a new game?", "Player " + winner + " won the game!", JOptionPane.OK_CANCEL_OPTION);
		else
			newGame = JOptionPane.showConfirmDialog(null, "Do you want to start a new game?", "Game tied.", JOptionPane.OK_CANCEL_OPTION);
		
		if(newGame == 0)
			resetBoard();
		else
			this.dispose();
	}
	
	private void resetBoard() {
		btn1.setText("");
		btn1.setEnabled(true);
		btn2.setText("");
		btn2.setEnabled(true);
		btn3.setText("");
		btn3.setEnabled(true);
		btn4.setText("");
		btn4.setEnabled(true);
		btn5.setText("");
		btn5.setEnabled(true);
		btn6.setText("");
		btn6.setEnabled(true);
		btn7.setText("");
		btn7.setEnabled(true);
		btn8.setText("");
		btn8.setEnabled(true);
		btn9.setText("");
		btn9.setEnabled(true);
	}
	
	public JButton getBtn1() {
		return btn1;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public JButton getBtn4() {
		return btn4;
	}

	public JButton getBtn5() {
		return btn5;
	}

	public JButton getBtn6() {
		return btn6;
	}

	public JButton getBtn7() {
		return btn7;
	}

	public JButton getBtn8() {
		return btn8;
	}

	public JButton getBtn9() {
		return btn9;
	}
	
	
}
