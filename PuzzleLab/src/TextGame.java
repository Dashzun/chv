import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.AbstractListModel;


public class TextGame {

	private JFrame frame;

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
		frame.setBounds(100, 100, 569, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInstructions = new JLabel("Instructions");
		lblInstructions.setBounds(10, 11, 176, 14);
		frame.getContentPane().add(lblInstructions);
		
		JLabel lblN = new JLabel("N:");
		lblN.setBounds(39, 36, 46, 14);
		frame.getContentPane().add(lblN);
		
		JComboBox comboBoxN = new JComboBox();
		comboBoxN.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		comboBoxN.setBounds(75, 33, 65, 20);
		frame.getContentPane().add(comboBoxN);
		
		JButton btnCreateGame = new JButton("Create Game");
		btnCreateGame.setBounds(294, 32, 140, 23);
		frame.getContentPane().add(btnCreateGame);
		
		JComboBox comboBoxM = new JComboBox();
		comboBoxM.setBounds(201, 33, 83, 20);
		frame.getContentPane().add(comboBoxM);
		
		JLabel lblNewLabel = new JLabel("M:");
		lblNewLabel.setBounds(170, 36, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		
		JButton btn2 = new JButton("I");
		btn2.setBounds(123, 67, 37, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("I");
		btn3.setBounds(170, 67, 37, 23);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("I");
		btn4.setBounds(217, 67, 37, 23);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("I");
		btn5.setBounds(263, 67, 37, 23);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("I");
		btn6.setBounds(310, 66, 37, 23);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("I");
		btn7.setBounds(75, 101, 37, 23);
		frame.getContentPane().add(btn7);
		
		JButton btn13 = new JButton("I");
		btn13.setBounds(75, 135, 37, 23);
		frame.getContentPane().add(btn13);
		
		JButton btn19 = new JButton("I");
		btn19.setBounds(75, 169, 37, 23);
		frame.getContentPane().add(btn19);
		
		JButton btn25 = new JButton("I");
		btn25.setBounds(75, 203, 37, 23);
		frame.getContentPane().add(btn25);
		
		JButton btn31 = new JButton("I");
		btn31.setBounds(75, 237, 37, 23);
		frame.getContentPane().add(btn31);
		
		JButton btn1 = new JButton("I");
		btn1.setBounds(75, 67, 37, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn8 = new JButton("I");
		btn8.setBounds(123, 101, 37, 23);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("I");
		btn9.setBounds(170, 101, 37, 23);
		frame.getContentPane().add(btn9);
		
		JButton btn10 = new JButton("I");
		btn10.setBounds(217, 101, 37, 23);
		frame.getContentPane().add(btn10);
		
		JButton btn11 = new JButton("I");
		btn11.setBounds(263, 101, 37, 23);
		frame.getContentPane().add(btn11);
		
		JButton btn12 = new JButton("I");
		btn12.setBounds(310, 100, 37, 23);
		frame.getContentPane().add(btn12);
		
		JButton btn14 = new JButton("I");
		btn14.setBounds(123, 135, 37, 23);
		frame.getContentPane().add(btn14);
		
		JButton btn20 = new JButton("I");
		btn20.setBounds(123, 169, 37, 23);
		frame.getContentPane().add(btn20);
		
		JButton btn26 = new JButton("I");
		btn26.setBounds(123, 203, 37, 23);
		frame.getContentPane().add(btn26);
		
		JButton btn32 = new JButton("I");
		btn32.setBounds(123, 237, 37, 23);
		frame.getContentPane().add(btn32);
		
		JButton btn15 = new JButton("I");
		btn15.setBounds(170, 135, 37, 23);
		frame.getContentPane().add(btn15);
		
		JButton btn21 = new JButton("I");
		btn21.setBounds(169, 169, 37, 23);
		frame.getContentPane().add(btn21);
		
		JButton btn27 = new JButton("I");
		btn27.setBounds(170, 203, 37, 23);
		frame.getContentPane().add(btn27);
		
		JButton btn33 = new JButton("I");
		btn33.setBounds(170, 237, 37, 23);
		frame.getContentPane().add(btn33);
		
		JButton btn16 = new JButton("I");
		btn16.setBounds(217, 135, 37, 23);
		frame.getContentPane().add(btn16);
		
		JButton btn22 = new JButton("I");
		btn22.setBounds(217, 169, 37, 23);
		frame.getContentPane().add(btn22);
		
		JButton btn28 = new JButton("I");
		btn28.setBounds(217, 203, 37, 23);
		frame.getContentPane().add(btn28);
		
		JButton btn34 = new JButton("I");
		btn34.setBounds(217, 237, 37, 23);
		frame.getContentPane().add(btn34);
		
		JButton btn17 = new JButton("I");
		btn17.setBounds(263, 135, 37, 23);
		frame.getContentPane().add(btn17);
		
		JButton btn23 = new JButton("I");
		btn23.setBounds(263, 169, 37, 23);
		frame.getContentPane().add(btn23);
		
		JButton btn29 = new JButton("I");
		btn29.setBounds(263, 203, 37, 23);
		frame.getContentPane().add(btn29);
		
		JButton btn35 = new JButton("I");
		btn35.setBounds(263, 237, 37, 23);
		frame.getContentPane().add(btn35);
		
		JButton btn18 = new JButton("I");
		btn18.setBounds(310, 135, 37, 23);
		frame.getContentPane().add(btn18);
		
		JButton btn24 = new JButton("I");
		btn24.setBounds(310, 169, 37, 23);
		frame.getContentPane().add(btn24);
		
		JButton btn30 = new JButton("I");
		btn30.setBounds(310, 203, 37, 23);
		frame.getContentPane().add(btn30);
		
		JButton btn36 = new JButton("I");
		btn36.setBounds(310, 237, 37, 23);
		frame.getContentPane().add(btn36);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"apple", "frog", "cat", "bear"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(378, 100, 151, 316);
		frame.getContentPane().add(list);
		
		JLabel lblPossibleWords = new JLabel("Possible Words");
		lblPossibleWords.setBounds(406, 76, 99, 14);
		frame.getContentPane().add(lblPossibleWords);
		
	}
	
	public void startGame(int n,int m){
		Puzzle gamePuzzle = new Puzzle(n,m);
		
		
		
	}
}
