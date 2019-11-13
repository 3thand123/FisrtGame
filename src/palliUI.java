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
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class palliUI extends menuControl {
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPanel ContentPane;
	String input;
	
	public palliUI() 
	{
		ContentPane = new JPanel();
		ContentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ContentPane);
		ContentPane.setLayout(null);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()== KeyEvent.VK_ENTER)
				{
					input = textField.getText();
					input = input.replaceAll("[\\W]", "");
					input = input.toLowerCase();
					doStuff(input);
				}
			}
		});
		textField.setBounds(160, 35, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(160, 105, 130, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(160, 151, 130, 26);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(160, 194, 130, 26);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Loops");
		lblNewLabel.setBounds(104, 199, 44, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Recurrsion");
		lblNewLabel_1.setBounds(81, 161, 67, 16);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Reverse");
		lblNewLabel_2.setBounds(104, 110, 48, 16);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Type Here");
		lblNewLabel_3.setBounds(81, 40, 63, 16);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Pallindrome Tester");
		lblNewLabel_4.setBounds(160, 7, 130, 16);
		getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input = textField.getText();
				input = input.replaceAll("[\\W]", "");
				input = input.toLowerCase();
				doStuff(input);
			}
		});
		btnNewButton.setBounds(291, 35, 117, 29);
		ContentPane.add(btnNewButton);
	}
	
	public void doStuff(String input)
	{
		boolean loopAns, recurAns, reverAns;

		loopAns = Pallindrome.Loops(input);
		recurAns = Pallindrome.Recurssion(input);
		reverAns = Pallindrome.Reverse(input);
		
		if (loopAns)
			textField_1.setText("Pallindrome");
		else
			textField_1.setText("Not Pallindrome");
		
		if (recurAns)
			textField_2.setText("Pallindrome");
		else
			textField_2.setText("Not Pallindrome");
		
		if (reverAns)
			textField_3.setText("Pallindrome");
		else
			textField_3.setText("Not Pallindrome");
	}
	
}