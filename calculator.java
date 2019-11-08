import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class calculator extends menuControl {

	/**
	 * TEST
	 */
	// view section ++
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel calcArea;
	protected Object frame;
	
	// calculator control
	private String calcAreaDefault = new String("0.0");
	private boolean initialCalcAreaInputState;
	private enum STATE { INITIAL, SAVE1, SAVE2, CALC };
	private STATE mathState;
	
	// calculator values
	private enum OPERATOR { NOOP, PLUS, MINUS, DIVIDE, MULTIPLY };
    private OPERATOR mathOp;
	private double arg1;
    private double arg2;
    private double calcAnswer;

	/**
	 * Launch the application.
	 */
/*
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	
	/**
	 * Calculator control
	 */
	private void calculateAnswer()  // method to perform calculation
	{
	    switch(mathOp)
	    {
	        case PLUS:
	            calcAnswer = arg1 + arg2;
	            break;
	        case MINUS:
	            calcAnswer = arg1 - arg2;
	            break;
	        case DIVIDE:
	            calcAnswer = arg1 / arg2;
	            break;
	        case MULTIPLY:
	            calcAnswer = arg1 * arg2;
	            break;
	        case NOOP:
	            calcAnswer = arg1;
	    }
		calcArea.setText(String.valueOf(calcAnswer));
	    arg1 = Double.valueOf(calcArea.getText());
	    mathState = STATE.CALC;
		initialCalcAreaInputState = true;
	}
	
	/**
	 * Save values for Calculator.
	 */
	private void saveValueOfArg1() { // method to store 1st value in calculation (arg1)
	    arg1 = Double.valueOf(calcArea.getText());
	    mathState = STATE.SAVE1;
		initialCalcAreaInputState = true;
	}
	
	private void saveValueOfArg2() { // method to store 2nd value in calculation (arg2)
		if (mathState != STATE.CALC) {
			arg2 = Double.valueOf(calcArea.getText());
			mathState = STATE.SAVE2;
		}
	}
	
	private void saveValueOfMathOp(OPERATOR op) { // method to store operator
		mathOp = op;
	}
	
	/**
	 * Update the Calculation area display
	 */
	private void updateCalcArea(String string) {
		if (initialCalcAreaInputState) {  // sets text to string on initial key typed
			calcArea.setText(string);
			initialCalcAreaInputState = false;
	    } else  {                         // concatenates string to end of text subsequent keys typed
			calcArea.setText(calcArea.getText() + string);
	    }
	}
	
	private void clearCalculator() {  // helper method to clear and update calculator to default
		calcArea.setText(calcAreaDefault);
		mathState = STATE.INITIAL;
		initialCalcAreaInputState = true;
		arg1 = 0.0;
		arg2 = 0.0;
		calcAnswer = 0.0;
	}

	/**
	 * Create the frame.
	 */
	public calculator() {
		
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		calcArea = new JLabel(calcAreaDefault);
		calcArea.setFont(new Font("Apple Chancery", Font.PLAIN, 17));
		calcArea.setBounds(123, 38, 225, 16);
		calcArea.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(calcArea);
		
		
		JButton button_1 = new JButton("1");
		button_1.setFont(new Font("Apple Chancery", Font.PLAIN, 13));
		button_1.setBounds(101, 142, 41, 29);
		button_1.setBackground(new Color(0, 0, 255));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_1.getText());
			}

		});
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setFont(new Font("Apple Chancery", Font.PLAIN, 13));
		button_2.setBounds(163, 142, 41, 29);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_2.getText());
			}

		});
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.setFont(new Font("Apple Chancery", Font.PLAIN, 13));
		button_3.setBounds(228, 142, 41, 29);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_3.getText());
			}

		});
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.setFont(new Font("Apple Chancery", Font.PLAIN, 13));
		button_4.setBounds(101, 112, 41, 29);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_4.getText());
			}

		});
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setFont(new Font("Apple Chancery", Font.PLAIN, 13));
		button_5.setBounds(163, 112, 41, 29);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_5.getText());
			}

		});
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.setFont(new Font("Apple Chancery", Font.PLAIN, 13));
		button_6.setBounds(228, 112, 41, 29);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_6.getText());
			}

		});
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.setFont(new Font("Apple Chancery", Font.PLAIN, 13));
		button_7.setBounds(101, 82, 41, 29);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_7.getText());
			}

		});
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setFont(new Font("Apple Chancery", Font.PLAIN, 13));
		button_8.setBounds(163, 82, 41, 29);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_8.getText());
			}

		});
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setFont(new Font("Apple Chancery", Font.PLAIN, 13));
		button_9.setBounds(228, 82, 41, 29);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_9.getText());
			}

		});
		contentPane.add(button_9);	
		
		JButton button_plus = new JButton("+");
		button_plus.setBounds(307, 82, 41, 29);
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveValueOfArg1();
				saveValueOfMathOp(OPERATOR.PLUS);
			}
		});
		contentPane.add(button_plus);
		
		JButton button_minus = new JButton("-");
		button_minus.setBounds(307, 112, 41, 29);
		button_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveValueOfArg1();
				saveValueOfMathOp(OPERATOR.MINUS);
			}
		});
		contentPane.add(button_minus);
		
		JButton button_equal = new JButton("=");
		button_equal.setBounds(307, 142, 41, 29);
		button_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveValueOfArg2();
				calculateAnswer();
			}
		});
		button_equal.setBackground(Color.CYAN);
		contentPane.add(button_equal);
		
		JButton button_clear = new JButton("AC");
		button_clear.setBounds(349, 139, 41, 34);
		button_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearCalculator();
			}
		});
		button_clear.setBackground(Color.CYAN);
		contentPane.add(button_clear);
		
		JButton button_0 = new JButton("0");
		button_0.setFont(new Font("Apple Chancery", Font.PLAIN, 13));
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCalcArea(button_0.getText());
			}
		});
		button_0.setBounds(101, 171, 41, 29);
		contentPane.add(button_0);
		
		JButton multi = new JButton("*");
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveValueOfArg1();
				saveValueOfMathOp(OPERATOR.MULTIPLY);
			}
		});
		multi.setBounds(349, 82, 41, 29);
		contentPane.add(multi);
		
		JButton divi = new JButton("/");
		divi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveValueOfArg1();
				saveValueOfMathOp(OPERATOR.DIVIDE);
			}
		});
		divi.setBounds(349, 112, 41, 29);
		contentPane.add(divi);
		
		// prepare Calculator values
		clearCalculator();

	}
}
