import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import java.awt.Container;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


class BOWSER extends Thread
{
	//JFrame thisguy = new JFrame();
	int x;
	int y;
	Point BowserPoint;
	Container content;
	//JLabel Bman;
	public BOWSER(Container CP) {
		content = CP;
		//thisguy.setContentPane(CP);
		run();
	}
	public void run()
	{
		JLabel Bman = new JLabel("");
		Image image2 = new ImageIcon(this.getClass().getResource("/Bowser.png")).getImage();
        Bman.setIcon(new ImageIcon(image2));
        Bman.setBounds(465, 50, 64, 64);
        content.add(Bman);
		System.out.print("Test");
		BowserPoint = Bman.getLocation();
		int flag = 0;
		while(true)
		{
			if (BowserPoint.x > 100)
				flag = 1;
			if (BowserPoint.x < 0)
				flag = 0;
			switch (flag)
			{
				case 1:
				{
					BowserPoint = Bman.getLocation();
	        		BowserPoint.x -= 5;
					Bman.setLocation(BowserPoint);
					try {
						Thread.sleep(50);;
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.print("b");
					break;
				}
				
				case 0:
				{
					BowserPoint = Bman.getLocation();
	        		BowserPoint.x += 5;
					Bman.setLocation(BowserPoint);
					try {
						Thread.sleep(50);;
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.print("a");
					break;
				}
					
			
	        }
		}
	}
}

class MARIO extends Thread
{
	//JFrame thisguy = new JFrame();
	Container content;
	Point MarioPoint;
	//JLabel Bman;
	public MARIO(Container CP) {
		content = CP;
		//thisguy.setContentPane(CP);
		run();
	}
	public void run()
	{
		
		System.out.print("TEST");
		JLabel Mario = new JLabel("");
        Image image = new ImageIcon(this.getClass().getResource("/Mario.png")).getImage();
        Mario.setIcon(new ImageIcon(image));
        Mario.setBounds(463, 589, 64, 64);
        content.add(Mario);
        
        MarioPoint = Mario.getLocation();
		int flag = 0;
		while(true)
		{
			if (MarioPoint.x > 100)
				flag = 1;
			if (MarioPoint.x < 0)
				flag = 0;
			switch (flag)
			{
				case 1:
				{
					MarioPoint = Mario.getLocation();
					MarioPoint.x -= 5;
					Mario.setLocation(MarioPoint);
					try {
						Thread.sleep(50);;
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.print("d");
					break;
				}
				
				case 0:
				{
					MarioPoint = Mario.getLocation();
					MarioPoint.x += 5;
					Mario.setLocation(MarioPoint);
					try {
						Thread.sleep(50);;
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.print("c");
					break;
				}
			}
		}
        
        /*JTextField txtgame = new JTextField();
        txtgame.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()== KeyEvent.VK_RIGHT)
				{
					MarioPoint = Mario.getLocation();
					MarioPoint.x += 15;
					Mario.setLocation(MarioPoint);
				}
				if (e.getKeyCode()== KeyEvent.VK_LEFT)
				{
					MarioPoint = Mario.getLocation();
					MarioPoint.x -= 15;
					Mario.setLocation(MarioPoint);
				}
				
			}
		});
        txtgame.setBounds(0, 0, 0, 26);
        content.add(txtgame);
        txtgame.setColumns(10);*/
	}
}

public class Screen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x = 0;
	private JTextField txtgame;
	Point MarioPoint;
	Point FireballPoint;
	//JLabel Bowser = new JLabel("");
	
	/**
	 * Launch the application.
	 * @return 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen frame = new Screen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}
	
	public Screen()
	{
		getContentPane().setLayout(null);
		setBounds(100, 100, 1000, 700);
		
		
		/*JLabel Mario = new JLabel("");
        Image image = new ImageIcon(this.getClass().getResource("/Mario.png")).getImage();
        Mario.setIcon(new ImageIcon(image));
        Mario.setBounds(463, 589, 64, 64);
        getContentPane().add(Mario);*/
        
        
        /*Image image2 = new ImageIcon(this.getClass().getResource("/Bowser.png")).getImage();
        Bowser.setIcon(new ImageIcon(image2));
        Bowser.setBounds(465, 50, 64, 64);
        getContentPane().add(Bowser);*/
        
       /* JLabel Fireball = new JLabel("");
        Image image3 = new ImageIcon(this.getClass().getResource("/Fireball.png")).getImage();
        Bowser.setIcon(new ImageIcon(image3));
        Fireball.setBounds(344, 327, 32, 32);
        getContentPane().add(Fireball);*/
        
        /*JTextField txtgame = new JTextField();
        txtgame.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()== KeyEvent.VK_RIGHT)
				{
					MarioPoint = Mario.getLocation();
					MarioPoint.x += 15;
					Mario.setLocation(MarioPoint);
				}
				if (e.getKeyCode()== KeyEvent.VK_LEFT)
				{
					MarioPoint = Mario.getLocation();
					MarioPoint.x -= 15;
					Mario.setLocation(MarioPoint);
				}
				if (e.getKeyCode()== KeyEvent.VK_SPACE)
				{
					FireballPoint.x = MarioPoint.x;
					FireballPoint.y = MarioPoint.y;
					Fireball.setLocation(FireballPoint);
				}
			}
		});
        txtgame.setBounds(0, 0, 0, 26);
        getContentPane().add(txtgame);
        txtgame.setColumns(10);*/
      
        //Container contentPane = getContentPane();
        Play();
	}
	
	public void Play()
	{
		//System.out.print("TestTEST");
		BOWSER bowser = new BOWSER(getContentPane());
		bowser.start();
		MARIO mario = new MARIO(getContentPane());
		mario.start();
	}
	
}
