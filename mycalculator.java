import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class mycalculator {

	private JFrame frmCalculator;
	private JTextField textField;

	double firstno;
	double secondno;
	double result;
	String answer;
	String operations;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mycalculator window = new mycalculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mycalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("CALCULATOR");
		frmCalculator.setFont(new Font("Dialog", Font.PLAIN, 18));
		frmCalculator.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmCalculator.getContentPane().setBounds(new Rectangle(10, 54, 50, 50));
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 218, 38);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		//-------------------ROW 1------------------------
		JButton btnBS = new JButton("<-");
		btnBS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace =null;
				if(textField.getText().length()>0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backspace=strB.toString();
					textField.setText(backspace);
				}
				
				
			}
		});
		btnBS.setBackground(Color.GRAY);
		btnBS.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnBS.setBounds(10, 54, 50, 50);
		frmCalculator.getContentPane().add(btnBS);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBackground(Color.GRAY);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(66, 54, 50, 50);
		frmCalculator.getContentPane().add(btnC);
		
		JButton btnPer = new JButton("%");
		btnPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstno = Double.parseDouble(textField.getText());
				textField.setText("");
				operations ="%";
			}
		});
		btnPer.setBackground(Color.GRAY);
		btnPer.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPer.setBounds(122, 54, 50, 50);
		frmCalculator.getContentPane().add(btnPer);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstno = Double.parseDouble(textField.getText());
				textField.setText("");
				operations ="+";
			}
		});
		btnPlus.setBackground(Color.GRAY);
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(178, 54, 50, 50);
		frmCalculator.getContentPane().add(btnPlus);
		//---------------------ROW 2-----------------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn7.getText();
			textField.setText(EnterNumber);
			}
		});
		btn7.setBackground(Color.GRAY);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 110, 50, 50);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn8.getText();
			textField.setText(EnterNumber);
			}
		});
		btn8.setBackground(Color.GRAY);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(66, 110, 50, 50);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn9.getText();
			textField.setText(EnterNumber);
			}
		});
		btn9.setBackground(Color.GRAY);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(122, 110, 50, 50);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstno = Double.parseDouble(textField.getText());
				textField.setText("");
				operations ="-";
			}
		});
		btnMinus.setBackground(Color.GRAY);
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(178, 110, 50, 50);
		frmCalculator.getContentPane().add(btnMinus);
		//---------------------------ROW 3----------------------
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn4.getText();
			textField.setText(EnterNumber);
			}
		});
		btn4.setBackground(Color.GRAY);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 166, 50, 50);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn5.getText();
			textField.setText(EnterNumber);
			}
		});
		btn5.setBackground(Color.GRAY);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(66, 166, 50, 50);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn6.getText();
			textField.setText(EnterNumber);
			}
		});
		btn6.setBackground(Color.GRAY);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(122, 166, 50, 50);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstno = Double.parseDouble(textField.getText());
				textField.setText("");
				operations ="*";
			}
		});
		btnMul.setBackground(Color.GRAY);
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul.setBounds(178, 166, 50, 50);
		frmCalculator.getContentPane().add(btnMul);
		//---------------------ROW 4--------------------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn1.getText();
			textField.setText(EnterNumber);
			}
		});
		btn1.setBackground(Color.GRAY);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 222, 50, 50);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn2.getText();
			textField.setText(EnterNumber);
			}
		});
		btn2.setBackground(Color.GRAY);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(66, 222, 50, 50);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn3.getText();
			textField.setText(EnterNumber);
			}
		});
		btn3.setBackground(Color.GRAY);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(122, 222, 50, 50);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstno = Double.parseDouble(textField.getText());
				textField.setText("");
				operations ="/";
			}
		});
		btnDiv.setBackground(Color.GRAY);
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv.setBounds(178, 222, 50, 50);
		frmCalculator.getContentPane().add(btnDiv);
		//----------------------ROW 5-------------------------
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn0.getText();
			textField.setText(EnterNumber);
			}
		});
		btn0.setBackground(Color.GRAY);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 278, 50, 50);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().contains("."));
				{
					textField.setText(textField.getText()+btnDot.getText());
				}
			}
		});
		btnDot.setBackground(Color.GRAY);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(66, 278, 50, 50);
		frmCalculator.getContentPane().add(btnDot);
		
		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textField.getText()));
				ops=ops*(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setBackground(Color.GRAY);
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnPM.setBounds(122, 278, 50, 50);
		frmCalculator.getContentPane().add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondno = Double.parseDouble(textField.getText());
				if(operations=="+")
				{
					result = firstno + secondno;
					answer= String.format("%2f", result);
					textField.setText(answer);
				}
				else if(operations=="-")
				{
					result = firstno - secondno;
					answer= String.format("%2f", result);
					textField.setText(answer);
				}	
				else if(operations=="*")
				{
					result = firstno * secondno;
					answer= String.format("%2f", result);
					textField.setText(answer);
				}	
				else if(operations=="/")
				{
					result = firstno / secondno;
					answer= String.format("%2f", result);
					textField.setText(answer);
				}	
				else if(operations=="%")
				{
					result = firstno % secondno;
					answer= String.format("%2f", result);
					textField.setText(answer);
				}	
			}
		});
		btnEqual.setBackground(Color.GRAY);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(178, 278, 50, 50);
		frmCalculator.getContentPane().add(btnEqual);

		
		
		frmCalculator.setBounds(100, 100, 253, 373);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
