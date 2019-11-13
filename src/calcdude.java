import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class calcdude extends menuControl {

	JLabel Bowser;
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	double num = 0, num1 = 0, num2 = 0;
    String thing1 = "";
    boolean operator = false;
    int opDone = 0;
    String opPressed;
    double ans = 0;
    String numero = "";
    
	public calcdude() {
		getContentPane().setBackground(new Color(240, 128, 128));
		getContentPane().setLayout(null);
		
        //setBounds(100, 100, 330, 510);
		//getContentPane().setLayout(null);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //getContentPane().setLayout(null);
        
		textField = new JTextField();
		textField.setFont(new Font("Apple Chancery", Font.PLAIN, 16));
        textField.setBounds(6, 11, 438, 38);
        getContentPane().add(textField);
        textField.setColumns(10);
        
        JButton Bclear = new JButton("C");
        Bclear.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        Bclear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	num1 = 0;
            	num2 = 0;
            	num = 0;
            	ans = 0;
            	opDone = 0;
            	thing1 = "";
            	displayAnswer(0.0);
            }
        });
        Bclear.setBounds(113, 49, 36, 28);
        getContentPane().add(Bclear);
        
        JButton Bback = new JButton("<");
        Bback.setForeground(new Color(0, 0, 0));
        Bback.setBackground(new Color(0, 0, 0));
        Bback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	thing1 = thing1.substring(0, thing1.length()-1);
            	displayAnswer(Double.valueOf(thing1));
            	loadNumber(thing1);
            }
        });
        Bback.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        Bback.setBounds(171, 49, 36, 28);
        getContentPane().add(Bback);
        
        JButton Badd = new JButton("+");
        Badd.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        Badd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkCalc(operator);
                if(opDone > 0)
                    displayAnswer(ans);
                operator = true;
                opDone++;
                opPressed = "+";
                thing1 = "";
            }
        });
        Badd.setBounds(229, 49, 36, 28);
        getContentPane().add(Badd);
        
        /*********************row 2*************************/
        JButton B7 = new JButton("7");
        B7.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        B7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDisplay("7");
                loadNumber("7");
                //checkCalc(operator);
            }
        });
        B7.setBounds(113, 89, 36, 28);
        getContentPane().add(B7);
        
        
        JButton B8 = new JButton("8");
        B8.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        B8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDisplay("8");
                loadNumber("8");
                //checkCalc(operator);
            }
        });
        B8.setBounds(171, 89, 36, 28);
        getContentPane().add(B8);
        
        JButton B9 = new JButton("9");
        B9.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        B9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDisplay("9");
                loadNumber("9");
                //checkCalc(operator);
            }
        });
        B9.setBounds(229, 89, 36, 28);
        getContentPane().add(B9);
        
        JButton Bsub = new JButton("-");
        Bsub.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        Bsub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkCalc(operator);
                if(opDone > 0)
                    displayAnswer(ans);
                operator = true;
                opDone++;
                opPressed = "-";
                thing1 = "";
            }
        });
        Bsub.setBounds(287, 49, 36, 28);
        getContentPane().add(Bsub);
        
        /*********************row 3*************************/
        JButton B4 = new JButton("4");
        B4.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        B4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDisplay("4");
                loadNumber("4");
                //checkCalc(operator);
            }
        });
        B4.setBounds(113, 129, 36, 28);
        getContentPane().add(B4);
        
        JButton B5 = new JButton("5");
        B5.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        B5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDisplay("5");
                loadNumber("5");
                //checkCalc(operator);
            }
        });
        B5.setBounds(171, 129, 36, 28);
        getContentPane().add(B5);
        
        JButton B6 = new JButton("6");
        B6.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        B6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDisplay("6");
                loadNumber("6");
                //checkCalc(operator);
            }
        });
        B6.setBounds(229, 129, 36, 28);
        getContentPane().add(B6);
        
        JButton Bmulti = new JButton("*");
        Bmulti.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        Bmulti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkCalc(operator);
                if(opDone > 0)
                    displayAnswer(ans);
                operator = true;
                opDone++;
                opPressed = "*";
                thing1 = "";
            }
        });
        Bmulti.setBounds(287, 89, 36, 28);
        getContentPane().add(Bmulti);
        
        /*********************row 4*************************/
        JButton B1 = new JButton("1");
        B1.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        B1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDisplay("1");
                loadNumber("1");
                //checkCalc(operator);
            }
        });
        B1.setBounds(113, 169, 36, 28);
        getContentPane().add(B1);
        
        JButton B2 = new JButton("2");
        B2.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        B2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDisplay("2");
                loadNumber("2");
                //checkCalc(operator);
            }
        });
        B2.setBounds(171, 169, 36, 28);
        getContentPane().add(B2);
        
        JButton B3 = new JButton("3");
        B3.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        B3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDisplay("3");
                loadNumber("3");
                //checkCalc(operator);
            }
        });
        B3.setBounds(229, 169, 36, 28);
        getContentPane().add(B3);
        
        JButton Bdiv = new JButton("/");
        Bdiv.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        Bdiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkCalc(operator);
                if(opDone > 0)
                    displayAnswer(ans);
                operator = true;
                opDone++;
                opPressed = "/";
                thing1 = "";
            }
        });
        Bdiv.setBounds(287, 129, 36, 28);
        getContentPane().add(Bdiv);
        
        /*********************row 5*************************/
        JButton B0 = new JButton("0");
        B0.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        B0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDisplay("0");
                loadNumber("0");
                //checkCalc(operator);
            }
        });
        B0.setBounds(113, 209, 36, 28);
        getContentPane().add(B0);
        
        JButton Bdec = new JButton(".");
        Bdec.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        Bdec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDisplay(".");
                loadNumber(".");
                //checkCalc(operator);
            }
        });
        Bdec.setBounds(287, 169, 36, 28);
        getContentPane().add(Bdec);
        
        JButton Bequal = new JButton("=");
        Bequal.setFont(new Font("Apple Chancery", Font.BOLD, 25));
        Bequal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkCalc(operator);
                displayAnswer(ans);
            }
        });
        Bequal.setBounds(287, 209, 36, 28);
        getContentPane().add(Bequal);
        
        Bowser = new JLabel("");
        Image image = new ImageIcon(this.getClass().getResource("/Bowser.png")).getImage();
        Bowser.setIcon(new ImageIcon(image));
        Bowser.setBounds(384, 61, 60, 82);
        getContentPane().add(Bowser);
        
        JLabel Mario = new JLabel("");
        Image image2 = new ImageIcon(this.getClass().getResource("/Mario.png")).getImage();
        Mario.setIcon(new ImageIcon(image2));
        Mario.setBounds(330, 97, 82, 70);
        getContentPane().add(Mario);
        
        JLabel Link = new JLabel("");
        Image image3 = new ImageIcon(this.getClass().getResource("/Link.png")).getImage();
        Link.setIcon(new ImageIcon(image3));
        Link.setBounds(6, 62, 73, 70);
        getContentPane().add(Link);
        
        
        
        
        
    }
	public void updateDisplay(String num)
    {
        thing1 = thing1.concat(num);
        textField.setText(thing1);
    }
    
    public void checkCalc(boolean opmaybe)
    {
        if (opmaybe)
            doCalc(opPressed);
        operator = false;
    }
    
    public void doCalc(String opMan)
    {
        switch(opMan)
        {
            case "+":
                Add(num, num1, num2);
                break;
            case "-":
                Subtract(num, num1, num2);
                break;
            case "*":
                Multiply(num, num1, num2);
                break;
            case "/":
                Divide(num, num1, num2);
                break;
            case "%":
            	Percent(num, num1, num2);
            	break;
        }
    }
    
    public void loadNumber(String number)
    {
        if(opDone % 2 == 0)
        {
            //thing1 = thing1.concat(number);
            num1 = Double.valueOf(thing1);
        }
        else
        {
            num2 = Double.valueOf(thing1);
        }
        num = Double.valueOf(thing1);
    }
    
    public void displayAnswer(double TheAnswer)
    {
        String display = "";
        display = String.valueOf(TheAnswer);
        textField.setText(display);
    }
    
    public void Add(double n, double n1, double n2)
    {
        if (opDone == 1)
            ans = n1 + n2;
        else
            ans+=num;
    }
    
    public void Subtract(double n, double n1, double n2)
    {
        if (opDone == 1)
            ans = Math.abs(n1 - n2);
        else
            ans-=num;
    }
    
     public void Multiply(double n, double n1, double n2)
    {
        if (opDone == 1)
            ans = n1*n2;
        else
            ans*=num;
    }
    
    public void Divide(double n, double n1, double n2)
    {
        if (opDone == 1)
            ans = n1/n2;
        else
            ans/=num;
    }
    
    public void Percent(double n, double n1, double n2)
    {
    	if (opDone == 1)
    		ans = num1/100;
    	else
    		ans = num1/100;
    }
}
	/**
	 * TEST
	 */
	// view section ++
	
	
	