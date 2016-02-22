import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.AbstractListModel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;


public class TextGame {

	private JFrame frame;
	
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btn13;
	private JButton btn14;
	private JButton btn15;
	private JButton btn16;
	private JButton btn17;
	private JButton btn18;
	private JButton btn19;
	private JButton btn20;
	private JButton btn21;
	private JButton btn22;
	private JButton btn23;
	private JButton btn24;
	private JButton btn25;
	private JButton btn26;
	private JButton btn27;
	private JButton btn28;
	private JButton btn29;
	private JButton btn30;
	private JButton btn31;
	private JButton btn32;
	private JButton btn33;
	private JButton btn34;
	private JButton btn35;
	private JButton btn36;
	private JComboBox comboBoxN;
	private JButton btnCreateGame;
	private JLabel labelMValue;
	private JList list;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextGame window = new TextGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TextGame() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.setBounds(100, 100, 569, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInstructions = new JLabel("Select an N. Then CreateGame");
		lblInstructions.setBounds(10, 11, 206, 14);
		frame.getContentPane().add(lblInstructions);
		
		JLabel lblN = new JLabel("N:");
		lblN.setBounds(39, 36, 46, 14);
		frame.getContentPane().add(lblN);
		
		comboBoxN = new JComboBox();
		comboBoxN.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		comboBoxN.setBounds(75, 33, 65, 20);
		frame.getContentPane().add(comboBoxN);
		
		btnCreateGame = new JButton("Create Game");
		btnCreateGame.setBounds(294, 32, 140, 23);
		frame.getContentPane().add(btnCreateGame);
		btnCreateGame.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int n = (int) comboBoxN.getSelectedIndex();
				n++;
				  int m = Integer.parseInt(JOptionPane.showInputDialog("Insert M"));
				
				if(m<2){
					m = 2;
				}else if(m> n*n){
					m = n+1;
				}else{
					
				}
				startGame(n,m);
				labelMValue.setText(String.valueOf(m));
				list.isShowing();
			}	
		});
		
		
		JLabel lblNewLabel = new JLabel("M:");
		lblNewLabel.setBounds(170, 36, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		
		 btn2 = new JButton(" ");
		 btn2.setFont(new Font("Verdana", Font.BOLD, 9));
		btn2.setBounds(123, 67, 45, 23);
		frame.getContentPane().add(btn2);
		
		 btn3 = new JButton(" ");
		 btn3.setFont(new Font("Verdana", Font.BOLD, 9));
		btn3.setBounds(170, 67, 45, 23);
		frame.getContentPane().add(btn3);
		
		 btn4 = new JButton(" ");
		 btn4.setFont(new Font("Verdana", Font.BOLD, 9));
		btn4.setBounds(217, 67, 45, 23);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton(" ");
		btn5.setFont(new Font("Verdana", Font.BOLD, 9));
		btn5.setBounds(263, 67, 45, 23);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton(" ");
		btn6.setFont(new Font("Verdana", Font.BOLD, 9));
		btn6.setBounds(310, 66, 45, 23);
		frame.getContentPane().add(btn6);
		
		btn7 = new JButton(" ");
		btn7.setFont(new Font("Verdana", Font.BOLD, 9));
		btn7.setBounds(75, 101, 45, 23);
		frame.getContentPane().add(btn7);
		
		btn13 = new JButton(" ");
		btn13.setFont(new Font("Verdana", Font.BOLD, 9));
		btn13.setBounds(75, 135, 45, 23);
		frame.getContentPane().add(btn13);
		
		btn19 = new JButton(" ");
		btn19.setFont(new Font("Verdana", Font.BOLD, 9));
		btn19.setBounds(75, 169, 45, 23);
		frame.getContentPane().add(btn19);
		
		btn25 = new JButton(" ");
		btn25.setFont(new Font("Verdana", Font.BOLD, 9));
		btn25.setBounds(75, 203, 45, 23);
		frame.getContentPane().add(btn25);
		
		btn31 = new JButton(" ");
		btn31.setFont(new Font("Verdana", Font.BOLD, 9));
		btn31.setBounds(75, 237, 45, 23);
		frame.getContentPane().add(btn31);
		
		btn1 = new JButton(" ");
		btn1.setFont(new Font("Verdana", Font.BOLD, 9));
		btn1.setBounds(75, 67, 45, 23);
		frame.getContentPane().add(btn1);
		
		btn8 = new JButton(" ");
		btn8.setFont(new Font("Verdana", Font.BOLD, 9));
		btn8.setBounds(123, 101, 45, 23);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton(" ");
		btn9.setFont(new Font("Verdana", Font.BOLD, 9));
		btn9.setBounds(170, 101, 45, 23);
		frame.getContentPane().add(btn9);
		
		btn10 = new JButton(" ");
		btn10.setFont(new Font("Verdana", Font.BOLD, 9));
		btn10.setBounds(217, 101, 45, 23);
		frame.getContentPane().add(btn10);
		
		btn11 = new JButton(" ");
		btn11.setFont(new Font("Verdana", Font.BOLD, 9));
		btn11.setBounds(263, 101, 45, 23);
		frame.getContentPane().add(btn11);
		
		btn12 = new JButton(" ");
		btn12.setFont(new Font("Verdana", Font.BOLD, 9));
		btn12.setBounds(310, 100, 45, 23);
		frame.getContentPane().add(btn12);
		
		btn14 = new JButton(" ");
		btn14.setFont(new Font("Verdana", Font.BOLD, 9));
		btn14.setBounds(123, 135, 45, 23);
		frame.getContentPane().add(btn14);
		
		btn20 = new JButton(" ");
		btn20.setFont(new Font("Verdana", Font.BOLD, 9));
		btn20.setBounds(123, 169, 45, 23);
		frame.getContentPane().add(btn20);
		
		btn26 = new JButton(" ");
		btn26.setFont(new Font("Verdana", Font.BOLD, 9));
		btn26.setBounds(123, 203, 45, 23);
		frame.getContentPane().add(btn26);
		
		btn32 = new JButton(" ");
		btn32.setFont(new Font("Verdana", Font.BOLD, 9));
		btn32.setBounds(123, 237, 45, 23);
		frame.getContentPane().add(btn32);
		
		btn15 = new JButton(" ");
		btn15.setFont(new Font("Verdana", Font.BOLD, 9));
		btn15.setBounds(170, 135, 45, 23);
		frame.getContentPane().add(btn15);
		
		btn21 = new JButton(" ");
		btn21.setFont(new Font("Verdana", Font.BOLD, 9));
		btn21.setBounds(169, 169, 45, 23);
		frame.getContentPane().add(btn21);
		
		btn27 = new JButton(" ");
		btn27.setFont(new Font("Verdana", Font.BOLD, 9));
		btn27.setBounds(170, 203, 45, 23);
		frame.getContentPane().add(btn27);
		
		btn33 = new JButton(" ");
		btn33.setFont(new Font("Verdana", Font.BOLD, 9));
		btn33.setBounds(170, 237, 45, 23);
		frame.getContentPane().add(btn33);
		
		btn16 = new JButton(" ");
		btn16.setFont(new Font("Verdana", Font.BOLD, 9));
		btn16.setBounds(217, 135, 45, 23);
		frame.getContentPane().add(btn16);
		
		btn22 = new JButton(" ");
		btn22.setFont(new Font("Verdana", Font.BOLD, 9));
		btn22.setBounds(217, 169, 45, 23);
		frame.getContentPane().add(btn22);
		
		btn28 = new JButton(" ");
		btn28.setFont(new Font("Verdana", Font.BOLD, 9));
		btn28.setBounds(217, 203, 45, 23);
		frame.getContentPane().add(btn28);
		
		btn34 = new JButton(" ");
		btn34.setFont(new Font("Verdana", Font.BOLD, 9));
		btn34.setBounds(217, 237, 45, 23);
		frame.getContentPane().add(btn34);
		
		btn17 = new JButton(" ");
		btn17.setFont(new Font("Verdana", Font.BOLD, 9));
		btn17.setBounds(263, 135, 45, 23);
		frame.getContentPane().add(btn17);
		
		btn23 = new JButton(" ");
		btn23.setFont(new Font("Verdana", Font.BOLD, 9));
		btn23.setBounds(263, 169, 45, 23);
		frame.getContentPane().add(btn23);
		
		btn29 = new JButton(" ");
		btn29.setFont(new Font("Verdana", Font.BOLD, 9));
		btn29.setBounds(263, 203, 45, 23);
		frame.getContentPane().add(btn29);
		
		btn35 = new JButton(" ");
		btn35.setFont(new Font("Verdana", Font.BOLD, 9));
		btn35.setBounds(263, 237, 45, 23);
		frame.getContentPane().add(btn35);
		
		btn18 = new JButton(" ");
		btn18.setFont(new Font("Verdana", Font.BOLD, 9));
		btn18.setBounds(310, 135, 45, 23);
		frame.getContentPane().add(btn18);
		
		btn24 = new JButton(" ");
		btn24.setFont(new Font("Verdana", Font.BOLD, 9));
		btn24.setBounds(310, 169, 45, 23);
		frame.getContentPane().add(btn24);
		
		btn30 = new JButton(" ");
		btn30.setFont(new Font("Verdana", Font.BOLD, 9));
		btn30.setBounds(310, 203, 45, 23);
		frame.getContentPane().add(btn30);
		
		btn36 = new JButton(" ");
		btn36.setFont(new Font("Verdana", Font.BOLD, 9));
		btn36.setBounds(310, 237, 45, 23);
		frame.getContentPane().add(btn36);
		
	
		
		JLabel lblPossibleWords = new JLabel("Possible Words");
		lblPossibleWords.setBounds(406, 76, 99, 14);
		frame.getContentPane().add(lblPossibleWords);
		
		labelMValue = new JLabel("");
		labelMValue.setBounds(188, 36, 46, 14);
		frame.getContentPane().add(labelMValue);
		
		hidebuttons();
	}
	/**
	 * Method to create the puzzle and find the possible word combinations based on the n and m passed in
	 * @param n
	 * @param m
	 */
	public void startGame(int n,int m){
		Puzzle gamePuzzle = new Puzzle(n);
		String[][] puzzleArray = gamePuzzle.getPuzzle();
		if(n==1){
			btn1.setText(puzzleArray[0][0].toUpperCase());
			hidebuttons();
			btn1.show();
		}else if(n==2){
			btn1.setText(puzzleArray[0][0].toUpperCase());
			btn2.setText(puzzleArray[0][1].toUpperCase());
			
			btn7.setText(puzzleArray[1][0].toUpperCase());
			btn8.setText(puzzleArray[1][1].toUpperCase());
			hidebuttons();
			btn1.show();
			btn2.show();
			btn7.show();
			btn8.show();
		}else if(n==3){
			btn1.setText(puzzleArray[0][0].toUpperCase());
			btn2.setText(puzzleArray[0][1].toUpperCase());
			btn3.setText(puzzleArray[0][2].toUpperCase());
			
			btn7.setText(puzzleArray[1][0].toUpperCase());
			btn8.setText(puzzleArray[1][1].toUpperCase());
			btn9.setText(puzzleArray[1][2].toUpperCase());
			
			btn13.setText(puzzleArray[2][0].toUpperCase());
			btn14.setText(puzzleArray[2][1].toUpperCase());
			btn15.setText(puzzleArray[2][2].toUpperCase());
			hidebuttons();
			btn1.show();
			btn2.show();
			btn3.show();
			btn7.show();
			btn8.show();
			btn9.show();
			btn13.show();
			btn14.show();
			btn15.show();
		}else if(n==4){
			btn1.setText(puzzleArray[0][0].toUpperCase());
			btn2.setText(puzzleArray[0][1].toUpperCase());
			btn3.setText(puzzleArray[0][2].toUpperCase());
			btn4.setText(puzzleArray[0][3].toUpperCase());
			
			btn7.setText(puzzleArray[1][0].toUpperCase());
			btn8.setText(puzzleArray[1][1].toUpperCase());
			btn9.setText(puzzleArray[1][2].toUpperCase());
			btn10.setText(puzzleArray[1][3].toUpperCase());
			
			btn13.setText(puzzleArray[2][0].toUpperCase());
			btn14.setText(puzzleArray[2][1].toUpperCase());
			btn15.setText(puzzleArray[2][2].toUpperCase());
			btn16.setText(puzzleArray[2][3].toUpperCase());
		
			btn19.setText(puzzleArray[3][0].toUpperCase());
			btn20.setText(puzzleArray[3][1].toUpperCase());
			btn21.setText(puzzleArray[3][2].toUpperCase());
			btn22.setText(puzzleArray[3][3].toUpperCase());
			
			hidebuttons();
			btn1.show();
			btn2.show();
			btn3.show();
			btn4.show();
			
			btn7.show();
			btn8.show();
			btn9.show();
			btn10.show();
			
			btn13.show();
			btn14.show();
			btn15.show();
			btn16.show();
			
			btn19.show();
			btn20.show();
			btn21.show();
			btn22.show();
			
		}else if(n==5){
			btn1.setText(puzzleArray[0][0].toUpperCase());
			btn2.setText(puzzleArray[0][1].toUpperCase());
			btn3.setText(puzzleArray[0][2].toUpperCase());
			btn4.setText(puzzleArray[0][3].toUpperCase());
			btn5.setText(puzzleArray[0][4].toUpperCase());
			
			btn7.setText(puzzleArray[1][0].toUpperCase());
			btn8.setText(puzzleArray[1][1].toUpperCase());
			btn9.setText(puzzleArray[1][2].toUpperCase());
			btn10.setText(puzzleArray[1][3].toUpperCase());
			btn11.setText(puzzleArray[1][4].toUpperCase());
			
			btn13.setText(puzzleArray[2][0].toUpperCase());
			btn14.setText(puzzleArray[2][1].toUpperCase());
			btn15.setText(puzzleArray[2][2].toUpperCase());
			btn16.setText(puzzleArray[2][3].toUpperCase());
			btn17.setText(puzzleArray[2][4].toUpperCase());
		
			btn19.setText(puzzleArray[3][0].toUpperCase());
			btn20.setText(puzzleArray[3][1].toUpperCase());
			btn21.setText(puzzleArray[3][2].toUpperCase());
			btn22.setText(puzzleArray[3][3].toUpperCase());
			btn23.setText(puzzleArray[3][4].toUpperCase());
			
			btn25.setText(puzzleArray[4][0].toUpperCase());
			btn26.setText(puzzleArray[4][1].toUpperCase());
			btn27.setText(puzzleArray[4][2].toUpperCase());
			btn28.setText(puzzleArray[4][3].toUpperCase());
			btn29.setText(puzzleArray[4][4].toUpperCase());
			
			hidebuttons();
			btn1.show();
			btn2.show();
			btn3.show();
			btn4.show();
			btn5.show();
			
			btn7.show();
			btn8.show();
			btn9.show();
			btn10.show();
			btn11.show();
			
			btn13.show();
			btn14.show();
			btn15.show();
			btn16.show();
			btn17.show();
			
			btn19.show();
			btn20.show();
			btn21.show();
			btn22.show();
			btn23.show();
			
			btn25.show();
			btn26.show();
			btn27.show();
			btn28.show();
			btn29.show();
			
		}else if(n==6){
			btn1.setText(puzzleArray[0][0].toUpperCase());
			btn2.setText(puzzleArray[0][1].toUpperCase());
			btn3.setText(puzzleArray[0][2].toUpperCase());
			btn4.setText(puzzleArray[0][3].toUpperCase());
			btn5.setText(puzzleArray[0][4].toUpperCase());
			btn6.setText(puzzleArray[0][5].toUpperCase());
			
			btn7.setText(puzzleArray[1][0].toUpperCase());
			btn8.setText(puzzleArray[1][1].toUpperCase());
			btn9.setText(puzzleArray[1][2].toUpperCase());
			btn10.setText(puzzleArray[1][3].toUpperCase());
			btn11.setText(puzzleArray[1][4].toUpperCase());
			btn12.setText(puzzleArray[1][5].toUpperCase());
			
			btn13.setText(puzzleArray[2][0].toUpperCase());
			btn14.setText(puzzleArray[2][1].toUpperCase());
			btn15.setText(puzzleArray[2][2].toUpperCase());
			btn16.setText(puzzleArray[2][3].toUpperCase());
			btn17.setText(puzzleArray[2][4].toUpperCase());
			btn18.setText(puzzleArray[2][5].toUpperCase());
		
			btn19.setText(puzzleArray[3][0].toUpperCase());
			btn20.setText(puzzleArray[3][1].toUpperCase());
			btn21.setText(puzzleArray[3][2].toUpperCase());
			btn22.setText(puzzleArray[3][3].toUpperCase());
			btn23.setText(puzzleArray[3][4].toUpperCase());
			btn24.setText(puzzleArray[3][5].toUpperCase());
			
			btn25.setText(puzzleArray[4][0].toUpperCase());
			btn26.setText(puzzleArray[4][1].toUpperCase());
			btn27.setText(puzzleArray[4][2].toUpperCase());
			btn28.setText(puzzleArray[4][3].toUpperCase());
			btn29.setText(puzzleArray[4][4].toUpperCase());
			btn30.setText(puzzleArray[4][5].toUpperCase());
			
			btn31.setText(puzzleArray[5][0].toUpperCase());
			btn32.setText(puzzleArray[5][1].toUpperCase());
			btn33.setText(puzzleArray[5][2].toUpperCase());
			btn34.setText(puzzleArray[5][3].toUpperCase());
			btn35.setText(puzzleArray[5][4].toUpperCase());
			btn36.setText(puzzleArray[5][5].toUpperCase());
			
			hidebuttons();
			btn1.show();
			btn2.show();
			btn3.show();
			btn4.show();
			btn5.show();
			btn6.show();
			
			btn7.show();
			btn8.show();
			btn9.show();
			btn10.show();
			btn11.show();
			btn12.show();
			
			btn13.show();
			btn14.show();
			btn15.show();
			btn16.show();
			btn17.show();
			btn18.show();
			
			btn19.show();
			btn20.show();
			btn21.show();
			btn22.show();
			btn23.show();
			btn24.show();
			
			btn25.show();
			btn26.show();
			btn27.show();
			btn28.show();
			btn29.show();
			btn30.show();
			
			btn31.show();
			btn32.show();
			btn33.show();
			btn34.show();
			btn35.show();
			btn36.show();
			
		}
		// Create a pathFinder to find all possible words
		PathFinder pathFinder = new PathFinder(puzzleArray);
		// Use pathFinder to find all possible words and add them to words
		ArrayList<String> words = pathFinder.findWordsStarter(m);
		// Create a WordValidater
		WordValidater validater = new WordValidater();
		// Use the word validater to validate the words in "words",add all valid words to possibleWords
		ArrayList<String> possibleWords = validater.validate(words);
		// Output possible words to a JList that is displayed to the user
		list = new JList(possibleWords.toArray());
		list.setVisibleRowCount(12);
		list.setBounds(378, 100, 151, 316);
		frame.getContentPane().add(list);
		list.setVisible(true);
		// Refresh the frame to show the updated JList
		frame.repaint();
		
	}
/**
 * Method used to hide all of the buttons at once
 */
	private void hidebuttons() {
		btn1.hide();
		btn2.hide();
		btn3.hide();
		btn4.hide();
		btn5.hide();
		btn6.hide();
		btn7.hide();
		btn8.hide();
		btn9.hide();
		btn10.hide();
		btn11.hide();
		btn12.hide();
		btn13.hide();
		btn14.hide();
		btn15.hide();
		btn16.hide();
		btn17.hide();
		btn18.hide();
		btn19.hide();
		btn20.hide();
		btn21.hide();
		btn22.hide();
		btn23.hide();
		btn24.hide();
		btn25.hide();
		btn26.hide();
		btn27.hide();
		btn28.hide();
		btn29.hide();
		btn30.hide();
		btn31.hide();
		btn32.hide();
		btn33.hide();
		btn34.hide();
		btn35.hide();
		btn36.hide();
		
	}
}
