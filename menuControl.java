import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JMenuItem mntmPalliLoops = new JMenuItem("Palli Loops");
		mntmPalliLoops.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnNewMenu_2.add(mntmPalliLoops);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Palli Recurssion");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Palli Reverse");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		JMenu mnNewLabs = new JMenu("New labs");
		menuBar.add(mnNewLabs);
		
		JMenuItem mntmCalculator_1 = new JMenuItem("Calculator");
		mntmCalculator_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator frame = new calculator();
				frame.setVisible(true);
			}
		});
		mnNewLabs.add(mntmCalculator_1);
		
	}
	
}
