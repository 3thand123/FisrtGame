import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class menuControl extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuControl frame = new menuControl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public menuControl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_2 = new JMenu("Old Labs");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmPalliLoops = new JMenuItem("Pallindrome");
		mntmPalliLoops.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				palliUI frame = new palliUI();
				frame.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmPalliLoops);
		
		JMenu mnNewLabs = new JMenu("New labs");
		menuBar.add(mnNewLabs);
		
		JMenuItem mntmCalculator_1 = new JMenuItem("Calculator");
		mntmCalculator_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcdude frame = new calcdude();
				frame.setVisible(true);
			}
		});
		mnNewLabs.add(mntmCalculator_1);
		
	}
	
}
